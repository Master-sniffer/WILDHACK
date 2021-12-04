package Solution.wildhack;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    Button bt1, bt2;
//    Switch switch_active;
//    EditText edit_age, editTextTextPersonName;
//    ListView customer_list;
//    ArrayAdapter customerArray;
//    DatabaseHelper databaseHelper;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

//        bt1 = findViewById(R.id.bt1);
//        bt2 = findViewById(R.id.bt2);
//        switch_active = findViewById(R.id.switch_active);
//        edit_age = findViewById(R.id.edit_age);
//        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
//        customer_list = findViewById(R.id.customer_list);
//
//         databaseHelper  = new DatabaseHelper(MainActivity.this);
//
//
//        ShowCustomers(databaseHelper);
//
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CustomerModel customerModel;
//                    customerModel = new CustomerModel(-1, editTextTextPersonName.getText().toString(), Integer.parseInt(edit_age.getText().toString()), switch_active.isChecked() );
//                    Toast.makeText(MainActivity.this , customerModel.toString() , Toast.LENGTH_SHORT).show();
//
//
//                DatabaseHelper databaseHelper = new DatabaseHelper(MainActivity.this);
//                boolean b = databaseHelper.AddOne(customerModel);
//                Toast.makeText(MainActivity.this,"Result "  + b, Toast.LENGTH_SHORT).show();
//                ShowCustomers(databaseHelper);
//
//
//                    }
//
//
//
//        });
//
//        bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                databaseHelper  = new DatabaseHelper(MainActivity.this);
//
//
//                ShowCustomers(databaseHelper);
//
//
//                //Toast.makeText(MainActivity.this , results.toString(), Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//        customer_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                CustomerModel customerModel = (CustomerModel) parent.getItemAtPosition(position);
//                databaseHelper.deleteOne(customerModel);
//                ShowCustomers(databaseHelper);
//                Toast.makeText(MainActivity.this, "DELETED "+ customerModel.toString(), Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//
//
//        String files = "Потребуется стандартное походное снаряжение, за исключением палатки и посуды для приготовления еды на костре\n" +
//                "высокие резиновые сапоги («болотники»), спальник, коврик, налобный фонарик, термос, личная посуда\n" +
//                "(на некоторых кордонах вся посуда есть),\n" +
//                "биоразлагаемые средства гигиены, репелленты.\n" +
//                "Погода на Камчатке быстро и часто меняется – не забудьте про теплую и водоотталкивающую одежду и обувь.\n" +
//                "В теплые дни из соображений этики нельзя ходить по кордону в купальнике и коротких шортах,\n" +
//                "поэтому комплект легкой одежды тоже возьмите с собой. Помните, вы – лицо заповедника, наравне с сотрудниками!";
//        String flows = "Привет\n" +
//                "Пока\n" +
//                "Ага\n" +
//                "Вот\n" +
//                "да\n" +
//                "пока\n";
//
////        Tests.tests(files);
////        Tests.tests(flows);
//
//
//    }
//
//    private void ShowCustomers(DatabaseHelper databaseHelper2) {
//        customerArray = new ArrayAdapter<CustomerModel>(MainActivity.this, android.R.layout.simple_list_item_1, databaseHelper2.getEveryone());
//        customer_list.setAdapter(customerArray);
//    }
    }
}