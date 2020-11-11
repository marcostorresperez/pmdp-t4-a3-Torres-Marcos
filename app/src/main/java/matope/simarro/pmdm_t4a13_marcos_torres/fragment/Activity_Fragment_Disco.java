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
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Cancion;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Disco;


public class Activity_Fragment_Disco extends Fragment {
    private ArrayList<Disco> datos = new ArrayList<Disco>();
    private ListView lstListado;
    private DiscosListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_fragment_lista, container, false);
    }

    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        lstListado = (ListView) getView().findViewById(R.id.LstListado);

        ArrayList<Cancion> canciones = new ArrayList<>();
        canciones.add(new Cancion("Tu calorro", "3:12", "1"));
        canciones.add(new Cancion("La raja de tu falda", "3:25", "2"));
        canciones.add(new Cancion("Me falta el aliento", "3:40", "3"));
        canciones.add(new Cancion("Tan solo", "4:32", "4"));
        canciones.add(new Cancion("Poquito a poco", "3:04", "5"));
        canciones.add(new Cancion("Suma y sigue", "3:15", "6"));
        canciones.add(new Cancion("El del medio de los Chichos", "3:47", "7"));
        canciones.add(new Cancion("Como Camarón", "3:22", "8"));
        canciones.add(new Cancion("Exiliado en el lavabo", "3:16", "9"));
        canciones.add(new Cancion("Estopa", "3:35", "10"));
        canciones.add(new Cancion("Cacho a cacho", "2:30", "11"));
        canciones.add(new Cancion("Bossanova", "3:16", "12"));

        datos.add(new Disco("Estopa", "1999", "12", canciones));

        canciones = new ArrayList<>();

        canciones.add(new Cancion("Fin de semana", "2:59", "1"));
        canciones.add(new Cancion("Apagón", "3:05", "2"));
        canciones.add(new Cancion("Fuente de energía", "3:36", "3"));
        canciones.add(new Cancion("Penas con rumba", "3:10", "4"));
        canciones.add(new Cancion("Corazón aerodinámico", "3:43", "5"));
        canciones.add(new Cancion("Ya no me acuerdo", "2:50", "6"));
        canciones.add(new Cancion("Estrella fugaz", "3:40", "7"));
        canciones.add(new Cancion("Tanta tinta tonta", "3:13", "8"));
        canciones.add(new Cancion("Tragicomedia", "3:29", "9"));
        canciones.add(new Cancion("Necesito medicación", "3:31", "10"));
        canciones.add(new Cancion("Pastillas de freno", "3:24", "11"));
        canciones.add(new Cancion("Cuando cae la luna", "3:14", "12"));
        canciones.add(new Cancion("La del lute", "4:02", "13"));

        datos.add(new Disco("¿La calle es tuya?", "2004", "13", canciones));

        canciones = new ArrayList<>();
        canciones.add(new Cancion("Como Camarón", "3:40", "1"));
        canciones.add(new Cancion("Naturaleza", "4:03", "2"));
        canciones.add(new Cancion("Tu calorro", "3:53", "3"));
        canciones.add(new Cancion("Ahora", "3:54", "4"));
        canciones.add(new Cancion("Me quedare", "3:33", "5"));
        canciones.add(new Cancion("Ya no me acuerdo", "3:55", "6"));
        canciones.add(new Cancion("Rumba triste", "3:17", "7"));
        canciones.add(new Cancion("Cuando tú te vas", "4:06", "8"));
        canciones.add(new Cancion("El run run", "3:09", "9"));
        canciones.add(new Cancion("Hemicraneal", "4:20", "10"));
        canciones.add(new Cancion("Partiendo la pana", "4:24", "11"));
        canciones.add(new Cancion("La primavera", "3:21", "12"));
        canciones.add(new Cancion("Vino tinto", "3:53", "13"));
        canciones.add(new Cancion("Me falta el aliento", "4:20", "14"));
        canciones.add(new Cancion("La raja de tu falda", "4:33", "15"));

        datos.add(new Disco("Esto es Estopa", "2014", "15", canciones));

        lstListado.setAdapter(new AdaptadorDiscos(this, datos));

        lstListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> list, View view, int pos, long id) {
                if (listener != null) {
                    listener.onDiscoSeleccionado(
                            ((Disco) lstListado.getAdapter().getItem(pos)).getListaCanciones());
                }
            }
        });
    }

    public void setDiscosListener(DiscosListener listener) {
        this.listener = listener;
    }
}