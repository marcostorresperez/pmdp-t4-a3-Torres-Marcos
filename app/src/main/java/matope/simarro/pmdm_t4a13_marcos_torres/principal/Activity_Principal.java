package matope.simarro.pmdm_t4a13_marcos_torres.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import matope.simarro.pmdm_t4a13_marcos_torres.R;
import matope.simarro.pmdm_t4a13_marcos_torres.fragment.Activity_Fragment_Cancion;
import matope.simarro.pmdm_t4a13_marcos_torres.fragment.Activity_Fragment_Disco;
import matope.simarro.pmdm_t4a13_marcos_torres.fragment.DiscosListener;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Cancion;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Disco;

public class Activity_Principal extends AppCompatActivity implements DiscosListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal);
        Activity_Fragment_Disco disco = (Activity_Fragment_Disco) getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        disco.setDiscosListener(this);
    }

    @Override
    public void onDiscoSeleccionado(ArrayList<Cancion> lista) {
        boolean hayCancion = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);
        if (hayCancion) {
            ((Activity_Fragment_Cancion) getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarCancion(lista);
        } else {
            Intent i = new Intent(this, Activity_Detalle.class);
            i.putExtra("TextoCancion", lista);
            startActivity(i);
        }
    }
}