package Solution.wildhack;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Locale;

public class WelcomeScreen extends AppCompatActivity {
    public static String[] EXTRA_MESSAGE;

    Button Dle_Vas_Wel, Zametki_Wel, FAQ_Wel, SOS_Wel, Eshe_Wel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);


        try {
            EditText editText = (EditText) findViewById(R.id.search_Wel);

            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    EXTRA_MESSAGE = Look_For(editText.getText().toString());
                    Change(EXTRA_MESSAGE);
                    return true;
                }
            });
        } catch (Exception e){
            Log.i("Exception", String.valueOf(e));
        }

    }

    public void start_filling_form(View view){
        Intent intent = new Intent(this, SelectOne.class);

        startActivity(intent);
    }

    public void Change(String[] output) {
        Intent intent = new Intent(this, Answer_App.class);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE);
        startActivity(intent);
    }

    public void zametki_wel(View view) {
        Intent intent = new Intent(this, Enter_Or_Logi.class);
        startActivity(intent);
    }



    public void faq_wel(View view) {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        }


        Log.i("Connection", String.valueOf(connected));


        if (connected == true) {
            Intent intent = new Intent(this, FAQ_INTERNET.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, FAQ_OFFLINE.class);
            startActivity(intent);
        }

    }

    public void sos_wel(View view) {
        Intent intent = new Intent(this, Enter_Or_Logi.class);
        startActivity(intent);
    }

    public void eshe_wel(View view) {
        Intent intent = new Intent(this, Enter_Or_Logi.class);
        startActivity(intent);
    }



    public static String[] Look_For(String question) {



            String[][] matrix = //двумерный массив всех вариантов
                    {
                            {"обращение", "турзаявка", "требование", "заявление", "анкета", "волонтер", "доброволец", "регистрация", "заявка", "заявок", "прием"},
                            {"регистрация", "сайт", "добровольцы", "россии", "ссылка"},
                            {"договор", "деятельность", "добровольческой", "деятельности", "обработка", "персональных", "данныхотбор", "подтверждение", "свободных", "мест", "график", "набора", "техническое", "задание"},
                            {"сроки", "дедлайн", "дедлайны", "волонтерская", "работа", "волонтерские", "работы", "постановка", "в", "график", "график", "работа"},
                            {"подготовка", "к", "путешествию", "подготовка", "инвентаря", "инвентарь", "взять", "снаряжение", "одежда", "обувь", "спальник", "коврик", "фонарик", "термос", "посуда"},
                            {"связь", "интернет", "электричество","кордон"},
                            {"прививка", "прививках", "прививки", "справки", "справка", "справках", "здоровье", "здоровья", "здоров", "пцр", "covid-19", "короновирус", "аптечка", "жизнь", "опасность", "опасно", "животные"},
                            {"питание", "продукты", "продуктами", "питания", "пайком", "пайек", "фрукты", "овощи", "кондитерские", "изделия", "молочные", "продукты"},
                            {"проживание", "условия", "жилье", "жить", "туалет", "душ", "сушить", "стирать", "палатки", "инфраструктура", "стирки", "стирка", "сушка"},
                            {"подписание", "договора", "подписания", "договора", "договор", "договора", "документ", "документы", "правила", "безопасность", "безопасности", "ведомости", "соглашение", "соглашения", "политика", "политики", "информационная", "оопт", "заключение", "заключения", "при", "себе", "копия", "копии", "скан", "адрес", "куда"},
                            {"отправка", "дата", "дату", "где", "вертолет", "время", "вылета"},
                            {"ожидание", "отправки", "турист", "туристический", "сезон", "ждать"},
                            {"работа", "деятельность", "занятие", "работа", "территориях", "обязан", "обязанность", "график", "работы", "выходные", "экскурсия", "экскурсии", "экскурсиях"},
                            {"отзыв", "отчет", "проделанных", "работах", "возвращении", "офис"}
                    };

            String[] answers = new String[]{
                    "Добрый день! От Вас поступил запрос о прохождении волонтерских работ на территории Кроноцкого государственного\n" +
                            "заповедника/Южно-Камчатского федерального заказника, ",

                    "Регистрация на сайте «Добровольцы России»- обязательна, ссылка на сайт: https://dobro.ru/. ",
                    "После получения подтверждения отбора Вашей кандидатуры, при постановке в график, учитываются Ваши пожелания по территориям\n" +
                            "ООПТ для осуществления добровольческой деятельности.",

                    "Мы ставим Вас в график волонтерских работ на сезон согласно срокам, указанным в договоре.\n" +
                            "Минимальный срок работы на охраняемых территориях-3 недели.\n" +
                            "По мере формирования, график на текущий сезон размещается на сайте www.kronoki.ru в разделе ВОЛОНТЕРСТВО НА ТЕРРИТОРИЯХ.",

                    "Потребуется стандартное походное снаряжение, за исключением палатки и посуды для приготовления еды на костре:\n" +
                            "высокие резиновые сапоги («болотники»), спальник, коврик, налобный фонарик, термос, личная посуда\n" +
                            "(на некоторых кордонах вся посуда есть),\n" +
                            "биоразлагаемые средства гигиены, репелленты.",

                    "На всех кордонах есть электрогенераторы и солнечные батареи, то есть, возможность заряжать гаджеты у вас будет.\n" +
                            "Сотовой связи нет нигде. На многих кордонах утром и вечером есть интернет (очень медленный, но весточку родным\n" +
                            "отправить возможно).\n",

                    "Заповедные территории – зоны высокой вулканической и сейсмической активности, вокруг множество диких животных,\n" +
                            "а штатных врачей на кордонах нет. Поэтому мы приветствуем медицинские справки, а также просим вас самостоятельно\n" +
                            "оформить страхование жизни и здоровья, также необходимо иметь при себе отрицательный ПЦР тест на Covid-19.\n" +
                            "Не забудьте взять личную аптечку! \n",

                    "Основные продукты питания предоставляютя волонтеру. Заповедник обеспечивает пайком каждого волонтера.\n" +
                            "Вам необходимо будет только докупить для себя фрукты,овощи, кондитерские изделия, молочные продукты\n" +
                            "по своему вкусовому предпочтению",

                    "Волонтёры, работающие на кордонах, размещаются в домиках или модулях (сборные сезонные конструкции),\n" +
                            "спят в спальниках, либо на раскладушках с постельным бельём. Туалеты расположены вне домиков. Есть баня и\\или душ,\n" +
                            "возможность стирать и сушить личные вещи.",

                    "Ознакомление, подписание всех необходимых документов (договор о добровольческой деятельности в 2-х экземплярах,\n" +
                            "правила пожарной безопасности,инструкция при встрече с бурым медведем, правила санитарной безопасности в лесах,\n" +
                            "соглашение о соблюдении волонтером информационной политики Кроноцкого заповедника в области соц.сетей, ведомость\n" +
                            "о списании продуктов), выдача разрешений на посещение ООПТ проходит в офисе учреждения, по адресу: город Елизово,\n" +
                            "ул.Рябикова, дом 48. При себе необходимо иметь паспорт.",

                    "В зависимости от места нахождения для добровольцев есть три варианта отправки на кордоны: вертолет, вахтовка или\n" +
                            "маломерное судно. Например, добраться в Долину гейзеров, или в кальдеру вулкана Узон можно только на вертолете.\n" +
                            "На кордон Семячик или Кроноки – на маломерном судне или вертолете, на кордоны Травяной или Озерный можно\n" +
                            "добраться как на вахтовке, так и на вертолете.",

                    "Так как добровольцев отправляют бесплатно на туристических или технических бортах, не в каждом вертолете есть\n" +
                            "свободное место. Пожалуйста, учитывайте это при планировании длительности пребывания на Камчатке и бюджета на\n" +
                            "размещение в г. Елизово или в г. Петропавловск-Камчатский.",

                    "Доброволец обязан выполнять работы, оговоренные в соглашении. При нарушении условий договора ФГБУ\n" +
                            "«Кроноцкий государственный заповедник» в одностороннем порядке расторгает договор, и доброволец самостоятельно\n" +
                            " организует и оплачивает своё возвращение с территории.",

                    "По возвращении с территорий волонтеру необходимо написать отзыв и отчет добровольца (приложение №4,№5 к договору).\n" +
                            "Выдается личная волонтерская книжка(при отсутствии),с отметкой о дате и сведениях о деятельности волонтера.",
            };

            String[] tema = new String[]{
                    "Подача заявки",
                    "Регистрация на сайте «Добровольцы России»",
                    "Договор о добровольческой деятельности для ознакомления",
                    "Постановка в график",
                    "Подготовка к путешествию",
                    "Связь и электричество",
                    "Здоровье",
                    "Питание",
                    "Проживание и условия",
                    "Подписание договора",
                    "Отправка",
                    "Ожидание отправки",
                    "Работа на территориях",
                    "Отзыв,отчет о проделанных работах",

            };

//            String question = "Где и как можно узнать точную\n" +
//                    "дату вылета на кордон?"; //тут будет типа ввод вопроса пользователем


            String[] strToArray = question.toLowerCase(Locale.ROOT).split(" "); //сплитим для создания массива строк, так удобнее сравнивать


            System.out.println(Arrays.toString(strToArray));
            String[] Counter = new String[1];
            String[] Temas = new String[1];
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    String value = matrix[row][col];
                    for (String kek : strToArray) {
                        if (kek.equals(value)) {
                            System.out.println("Совпадения: " + value + " " + kek);
                            int ans = row;
//                        Arrays.fill(Counter, null);
                            Counter[0] = null;
                            Counter[0] = answers[ans];
//                        System.out.println(ans);
                            Temas[0] = tema[ans];

                        }
                    }
                }
            }
            System.out.println("ТЕМА: " + Temas[0]);
            System.out.println("ОТВЕТ: " + Counter[0]);
            String [] output ={Temas[0], Counter[0]};
            return output;
        }
    }

