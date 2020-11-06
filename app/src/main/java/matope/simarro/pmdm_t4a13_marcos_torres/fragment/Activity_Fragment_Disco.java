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
import matope.simarro.pmdm_t4a13_marcos_torres.adaptador.AdaptadorDiscos;
import matope.simarro.pmdm_t4a13_marcos_torres.fragment.DiscosListener;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Disco;


public class Activity_Fragment_Disco extends Fragment {
    private ArrayList<Disco> datos = new ArrayList<Disco>();
    private ListView lstListado;
    private DiscosListener listener;

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
        datos.add(new Disco("Estopa", "1999", "12"));
        datos.add(new Disco("¿La calle es tuya?", "2004", "13"));
        datos.add(new Disco("Esto es Estopa", "2014", "15"));

        lstListado.setAdapter(new AdaptadorDiscos(this, datos));

        lstListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> list, View view, int pos, long id) {
                if (listener != null) {
                    listener.onDiscoSeleccionado(
                            (Disco) lstListado.getAdapter().getItem(pos));
                }
            }
        });
    }

    public void setDiscosListener(DiscosListener listener) {
        this.listener = listener;
    }
}