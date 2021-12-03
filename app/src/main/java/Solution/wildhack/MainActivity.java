package Solution.wildhack;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String files = "Потребуется стандартное походное снаряжение, за исключением палатки и посуды для приготовления еды на костре\n" +
                "высокие резиновые сапоги («болотники»), спальник, коврик, налобный фонарик, термос, личная посуда\n" +
                "(на некоторых кордонах вся посуда есть),\n" +
                "биоразлагаемые средства гигиены, репелленты.\n" +
                "Погода на Камчатке быстро и часто меняется – не забудьте про теплую и водоотталкивающую одежду и обувь.\n" +
                "В теплые дни из соображений этики нельзя ходить по кордону в купальнике и коротких шортах,\n" +
                "поэтому комплект легкой одежды тоже возьмите с собой. Помните, вы – лицо заповедника, наравне с сотрудниками!";
        String flows = "Привет\n" +
                "Пока\n" +
                "Ага\n" +
                "Вот\n" +
                "да\n" +
                "пока\n";

        Tests.tests(files);
        Tests.tests(flows);
    }
}