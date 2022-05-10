package fort.kleber.dadosdosjogosestatsticodasprincipaisligaspelomundo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import fort.kleber.dadosdosjogosestatsticodasprincipaisligaspelomundo.databinding.ActivityMainBinding;
import fort.kleber.dadosdosjogosestatsticodasprincipaisligaspelomundo.fragment.ListaBrasileiroSerieAFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //configurar o adapter para abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Brasileiro - Série A", ListaBrasileiroSerieAFragment.class)
                .create()
        );

        binding.viewPager.setAdapter(adapter);
        binding.viewPagerTab.setViewPager(binding.viewPager);
    }
}