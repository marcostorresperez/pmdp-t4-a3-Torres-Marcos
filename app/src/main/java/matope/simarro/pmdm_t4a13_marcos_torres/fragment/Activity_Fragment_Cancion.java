package matope.simarro.pmdm_t4a13_marcos_torres.fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import matope.simarro.pmdm_t4a13_marcos_torres.R;
import matope.simarro.pmdm_t4a13_marcos_torres.adaptador.AdaptadorCanciones;
import matope.simarro.pmdm_t4a13_marcos_torres.fragment.CancionesListener;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Cancion;


public class Activity_Fragment_Cancion extends Fragment {
    private ArrayList<Cancion> datos = new ArrayList<Cancion>();
    private ListView lstListado;
    private CancionesListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_fragment_lista, container, false);
    }

    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        lstListado = (ListView) getView().findViewById(R.id.LstListado);
        datos.add(new Cancion("Persona 1", "Asunto del correo 1", "Texto del correo 1"));
        datos.add(new Cancion("Persona 2", "Asunto del correo 2", "Texto del correo 2"));
        datos.add(new Cancion("Persona 3", "Asunto del correo 3", "Texto del correo 3"));
        datos.add(new Cancion("Persona 4", "Asunto del correo 4", "Texto del correo 4"));
        datos.add(new Cancion("Persona 5", "Asunto del correo 5", "Texto del correo 5"));
        lstListado.setAdapter(new AdaptadorCanciones(this, datos));

        lstListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> list, View view, int pos, long id) {
                if (listener != null) {
                    listener.onCancionSeleccinada(
                            (Cancion) lstListado.getAdapter().getItem(pos));
                }
            }
        });
    }

    public void setCancionesListener(CancionesListener listener) {
        this.listener = listener;
    }
}