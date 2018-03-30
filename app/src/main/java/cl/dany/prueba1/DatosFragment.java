package cl.dany.prueba1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatosFragment extends Fragment {


    public DatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_datos, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       final EditText txtDay = view.findViewById(R.id.txtDay);
       final EditText txtMonth = view.findViewById(R.id.txtMonth);

        Button btnFind = view.findViewById(R.id.btnFind);
         btnFind.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {



                 String day = txtDay.getText().toString();

                 String month = txtMonth.getText().toString();

                 if (day.trim().length() > 0)
                 {
                     int dayBirth = Integer.parseInt(day);

                     if(dayBirth >= 22 && month.equals("diciembre") || dayBirth <= 20 && month.equals("enero"))
                     {
                         Toast.makeText(getContext(), "Tu signo es CAPRICORNIO", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 21 && month.equals("enero") || dayBirth <= 19 && month.equals("febrero"))
                     {
                         Toast.makeText(getContext(), "Tu signo es ACUARIO", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 20 && month.equals("febrero") || dayBirth <= 20 && month.equals("marzo"))
                     {
                         Toast.makeText(getContext(), "Tu signo es PISCIS", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 21 && month.equals("marzo") || dayBirth <= 20 && month.equals("abril"))
                     {
                         Toast.makeText(getContext(), "Tu signo es ARIES", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 21 && month.equals("abril") || dayBirth <= 21 && month.equals("mayo"))
                     {
                         Toast.makeText(getContext(), "Tu signo es TAURO", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 22 && month.equals("mayo") || dayBirth <= 21 && month.equals("junio"))
                     {
                         Toast.makeText(getContext(), "Tu signo es GEMINIS", Toast.LENGTH_LONG).show();
                     }else  if(dayBirth >= 22 && month.equals("junio") || dayBirth <= 22 && month.equals("julio"))
                     {
                         Toast.makeText(getContext(), "Tu signo es CANCER", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 23 && month.equals("julio") || dayBirth <= 22 && month.equals("agosto"))
                     {
                         Toast.makeText(getContext(), "Tu signo es LEO", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 23 && month.equals("agosto") || dayBirth <= 22 && month.equals("septiembre"))
                     {
                         Toast.makeText(getContext(), "Tu signo es VIRGO", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 23 && month.equals("septiembre") || dayBirth <= 22 && month.equals("octubre"))
                     {
                         Toast.makeText(getContext(), "Tu signo es LIBRA", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 23 && month.equals("octubre") || dayBirth <= 21 && month.equals("noviembre"))
                     {
                         Toast.makeText(getContext(), "Tu signo es ESCORPIÓN", Toast.LENGTH_LONG).show();
                     }else if(dayBirth >= 22 && month.equals("noviembre") || dayBirth <= 21 && month.equals("diciembre"))
                     {
                         Toast.makeText(getContext(), "Tu signo es SAGITARIO", Toast.LENGTH_LONG).show();
                     }else
                     {
                         Toast.makeText(getContext(), "Error: no hay signos para esos valores", Toast.LENGTH_LONG).show();
                     }











                 }else
                 {
                     Toast.makeText(getContext(), "Ingrese los datos para que los astros bajen a la app.", Toast.LENGTH_LONG).show();
                 }

             }
         });
    }
}
