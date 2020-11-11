package matope.simarro.pmdm_t4a13_marcos_torres.fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import matope.simarro.pmdm_t4a13_marcos_torres.R;
import matope.simarro.pmdm_t4a13_marcos_torres.adaptador.AdaptadorCanciones;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Cancion;

public class Activity_Fragment_Cancion extends Fragment {
    private ListView lstDetalle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_fragment_detalle, container, false);
    }

    public void mostrarCancion(ArrayList<Cancion> lista) {
        lstDetalle = (ListView) getView().findViewById(R.id.LstDetalle);
        lstDetalle.setAdapter(new AdaptadorCanciones(this, lista));

        lstDetalle.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> list, View view, int pos, long id) {
                Cancion cancion = (Cancion) lstDetalle.getAdapter().getItem(pos);
                String texto = cancion.getTitulo() + "\n" + "Posicion: "+cancion.getPosicion() + "\n" + "Duración: "+cancion.getDuración();
                Toast.makeText(getContext(), texto, Toast.LENGTH_LONG).show();
            }
        });
    }

}