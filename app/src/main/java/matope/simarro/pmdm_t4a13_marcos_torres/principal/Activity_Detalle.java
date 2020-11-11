package matope.simarro.pmdm_t4a13_marcos_torres.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import matope.simarro.pmdm_t4a13_marcos_torres.R;
import matope.simarro.pmdm_t4a13_marcos_torres.fragment.Activity_Fragment_Cancion;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Cancion;

public class Activity_Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_detalle);

        Activity_Fragment_Cancion cancion = (Activity_Fragment_Cancion) getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);
        cancion.mostrarCancion((ArrayList<Cancion>) getIntent().getSerializableExtra("TextoCancion"));

    }
}