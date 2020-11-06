package matope.simarro.pmdm_t4a13_marcos_torres.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import matope.simarro.pmdm_t4a13_marcos_torres.R;
import matope.simarro.pmdm_t4a13_marcos_torres.fragment.CancionesListener;
import matope.simarro.pmdm_t4a13_marcos_torres.fragment.DiscosListener;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Cancion;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Disco;

public class Activity_Principal extends AppCompatActivity implements DiscosListener, CancionesListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal);

    }

    @Override
    public void onCancionSeleccinada(Cancion c) {

    }

    @Override
    public void onDiscoSeleccionado(Disco d) {

    }
}