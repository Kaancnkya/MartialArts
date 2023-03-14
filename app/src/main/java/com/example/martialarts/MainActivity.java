package com.example.martialarts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MartialArtsAdapter.MartialArtsItemClickListener{
    private ArrayList<MartialArts> martialArtsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        martialArtsArrayList = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        martialArtsArrayList.add(new MartialArts("Ju Jitsu",
                "Jujutsu / Juijutsu, Japonya kökenli bir Uzak Doğu savaş sanatıdır. Samurayların savaşlarda silahsız kaldıklarında kullandıkları tekniklerle ortaya çıkmıştır.",
                R.drawable.ic_jiujitsu  ));
        martialArtsArrayList.add(new MartialArts("Judo",
                "Judo silahsız bir modern Japon dövüş sanatı ve 1964'ten beri Olimpiyat sporudur. Judo 1882'de Kanō Jigorō tarafından melez bir dövüş sanatı olarak geliştirilmiştir.",
                R.drawable.ic_judo ));
        martialArtsArrayList.add(new MartialArts("Karate",
                "silahsız savaş sanatı karate-do için yaygın kullanılan kısaltılmış terim olup Japonca kara boş + te el + do yol, sanat kelimelerinden oluşmakta ve silahsız elin yolu/sanatı anlamına gelmektedir.",
                R.drawable.ic_karate ));
        martialArtsArrayList.add(new MartialArts("Muay Thai",
                "Muay Thai, Tayland'da ortaya çıkan ve özgün adı Muay Thai olan dövüş sporu. Tayland Boksu da denir. Başta Tayland olmak üzere Myanmar, Kamboçya, Laos gibi Güneydoğu Asya ülkelerinde uygulanır. ",
                R.drawable.ic_muaythai ));
        martialArtsArrayList.add(new MartialArts("Wing Chun",
                "Wing Chun Wing Tsun, Wing Tzun, Ving Tsun ya da Wing Tsung, Güney Çin kökenli bir dövüş sanatı. Wing Tsun kavramı, sanatın günümüz şartlarına uydurulmuş versiyonlarını ifade etmek için kullanılır.",
                R.drawable.ic_wingchun ));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        MartialArtsAdapter martialArtsAdapter = new MartialArtsAdapter(this,martialArtsArrayList,this);
        recyclerView.setAdapter(martialArtsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onItemClickListener(MartialArts martialArts) {
        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra("MartialArts", martialArts);
        startActivity(intent);

    }
}