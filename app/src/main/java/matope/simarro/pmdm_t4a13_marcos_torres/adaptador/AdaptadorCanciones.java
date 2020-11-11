package matope.simarro.pmdm_t4a13_marcos_torres.adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import matope.simarro.pmdm_t4a13_marcos_torres.R;
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Cancion;

public class AdaptadorCanciones extends ArrayAdapter<Cancion> {
    Activity context;
    ArrayList<Cancion> listaCanciones;

    public AdaptadorCanciones(Fragment context, ArrayList<Cancion> listaCanciones) {
        super(context.getActivity(), R.layout.layout_elemento_cancion_lista, listaCanciones);
        this.context = context.getActivity();
        this.listaCanciones = listaCanciones;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.layout_elemento_cancion_lista, null);
        TextView lblTitulo = (TextView) item.findViewById(R.id.LblTitulo);

        lblTitulo.setText(listaCanciones.get(position).getTitulo());
        TextView lblDuracion = (TextView) item.findViewById(R.id.LblDuracion);
        lblDuracion.setText(getContext().getString(R.string.duracion) + listaCanciones.get(position).getDuración());
        TextView lblPosicion = (TextView) item.findViewById(R.id.LblPosicion);
        lblPosicion.setText(getContext().getString(R.string.posicion)+listaCanciones.get(position).getPosicion());
        return (item);
    }
}
