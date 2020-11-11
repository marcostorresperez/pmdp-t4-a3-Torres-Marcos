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
import matope.simarro.pmdm_t4a13_marcos_torres.pojo.Disco;

public class AdaptadorDiscos extends ArrayAdapter<Disco> {
    Activity context;
    ArrayList<Disco> listaDiscos;

    public AdaptadorDiscos(Fragment context, ArrayList<Disco> listaDiscos) {
        super(context.getActivity(), R.layout.layout_elemento_disco_lista, listaDiscos);
        this.context = context.getActivity();
        this.listaDiscos = listaDiscos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.layout_elemento_disco_lista, null);
        TextView lblNombre =  item.findViewById(R.id.LblNombre);
        lblNombre.setText(listaDiscos.get(position).getNombre());
        TextView lblAnyo =  item.findViewById(R.id.LblAnyo);
        lblAnyo.setText(getContext().getString(R.string.anyo)+listaDiscos.get(position).getAnyo());
        TextView lblNum =  item.findViewById(R.id.LblNum);
        lblNum.setText(getContext().getString(R.string.canciones)+listaDiscos.get(position).getNumCanciones());
        return (item);
    }
}
