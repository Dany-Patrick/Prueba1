package cl.dany.prueba1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
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
       final ImageView image = view.findViewById(R.id.imgSign);
       final TextView txtData = view.findViewById(R.id.txtDataSign);

        Button btnFind = view.findViewById(R.id.btnFind);
         btnFind.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {



                 String day = txtDay.getText().toString();

                 String month = txtMonth.getText().toString();

                 if (day.trim().length() > 0 && month.trim().length() > 0)
                 {
                     int dayBirth = Integer.parseInt(day);
                     int monthBirth = Integer.parseInt(month);

                     if(dayBirth >= 22  && dayBirth <= 31 && monthBirth == 12 || dayBirth <= 20  && dayBirth >= 1 && monthBirth == 1)
                     {
                         image.setImageResource(R.drawable.capricornio);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("CAPRICORNIO \n\nEste signo está regido por Saturno, planeta que se relaciona con la responsabilidad, la cautela, la previsión, la búsqueda de la seguridad. \n" +
                                 "\n" +
                                 "Ambicioso y muy perseverante para lograr sus propósitos. Generalmente la primera mitad de la vida es un tanto tímido y la segunda mitad de la vida va ganando en confianza. ");


                     }else if(dayBirth >= 21 && dayBirth <= 31 && monthBirth == 1 || dayBirth <= 19 && dayBirth >= 1 && monthBirth == 2)
                     {

                         image.setImageResource(R.drawable.aquario);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("ACUARIO \n\nAcuario es un signo regido por Urano, es un signo de aire y de naturaleza fija. Son personas sociables y pueden entablar lazos estables con personas de diversos grupos sociales, étnicos, religiosos, etc. \n" +
                                 "\n" +
                                 "Los nativos de este signo siempre están interesados por el bien común. Son creativos, bastante desapegados de las cosas materiales y buscan constantemente la libertad. ");
                     }else if(dayBirth >= 20 && dayBirth <= 28 && monthBirth == 2 || dayBirth <= 20 && dayBirth >= 1 && monthBirth == 3 )
                     {
                         image.setImageResource(R.drawable.piscis);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("PISCIS \n\nPiscis es un signo regido por Neptuno, que es un planeta que tiene que ver con la imaginación, la fantasía y con el ensueño. Los piscianos son muy emotivos, es un signo de agua, generalmente los piscianos aman mucho el arte y la música y poseen una fuerte conexión con su trabajo. \n" +
                                 "\n" +
                                 "A pesar de ser introvertidos, los hombres y mujeres de Piscis suelen tener muchos amigos. Tienen una alegría natural que contagia y una fuerte profundidad emocional. ");
                     }else if(dayBirth >= 21 && dayBirth <= 31 && monthBirth == 3  || dayBirth <= 20 && dayBirth >= 1 && monthBirth == 4)
                     {
                         image.setImageResource(R.drawable.aries);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("ARIES \n\nAries es el primer signo del zodíaco, los hombres y mujeres de este signo por lo general tienen las siguientes características: son transparentes y frontales, no les gusta guardarse nada, expresan con total claridad lo que piensan y lo que sienten. Poseen un temperamento muy fuere y es muy fácil para las personas que los rodean, conocer el estado anímico del ariano. \n" +
                                 "\n" +
                                 "Es un signo de fuego, lo que implica decisión, mucha energía e impulsividad. Las personas de Aries frecuentemente actúan sin pensar. ");
                     }else if(dayBirth >= 21 && dayBirth <= 30 && monthBirth == 4 || dayBirth <= 21 && dayBirth >= 1  && monthBirth == 5)
                     {
                         image.setImageResource(R.drawable.tauro);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("TAURO  \n\nTauro es un signo de tierra regido por Venus, por este motivo las personas de este signo poseen una naturaleza sensual, elegante y refinada. \n" +
                                 "\n" +
                                 "Los hombres y mujeres de Tauro sienten una gran inclinación hacia el confort, los lujos y hacia una vida material holgada. Disfrutan de la buena gastronomía y del aroma de los buenos perfumes. Les gusta que los traten con sumo cuidado y respeto y anhelan vivir en ambientes a armónicos y placenteros. ");
                     }else if(dayBirth >= 22 && dayBirth <= 31 && monthBirth == 5 || dayBirth <= 21 && dayBirth >= 1 && monthBirth == 6)
                     {
                         image.setImageResource(R.drawable.geminis);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("GËMINIS \n\nGéminis es un signo de aire regido por Mercurio. Los nativos de este signo son extremadamente comunicativos, gesticulan cuando hablan y pueden abarcar varios temas de una sola vez. \n" +
                                 "\n" +
                                 "Los hombres y mujeres de Géminis son curiosos e inquietos, les gusta estar bien informados y saber qué es lo que pasa a su alrededor. Son muy sociables y necesitan que su vida sea ágil y esté en constante movimiento. Poseen una gran capacidad para adaptarse a diversas situaciones. ");
                     }else  if(dayBirth >= 22 && dayBirth <= 30 && monthBirth == 6 || dayBirth <= 22 && dayBirth >= 1  && monthBirth == 7)
                     {
                         image.setImageResource(R.drawable.cancer);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("CANCER \n\nCáncer es un signo de agua de naturaleza emocional, regido por la luna. La luna está relacionada con el inconsciente y por lo tanto los nativos de este signo suelen poseer una fuerte memoria emotiva. \n" +
                                 "\n" +
                                 "En el ámbito del amor, el hombre de Cáncer suele ser sensible y muy sobreprotector con su pareja. Es romántico e idealista y buscará siempre una relación que le de seguridad afectiva. ");
                     }else if(dayBirth >= 23 && dayBirth <= 31 && monthBirth == 7 || dayBirth <= 22 && dayBirth >= 1  && monthBirth == 8)
                     {
                         image.setImageResource(R.drawable.leo);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("LEO \n\nLeo es un signo de fuego regido por el sol, naturalmente son personas sociables y extrovertidas. Disfrutan de relacionarse con mucha gente y de tener muchos amigos. Les gusta llamar la atención, son carismáticos y orgullosos. \n" +
                                 "\n" +
                                 "Normalmente se cree que personas de Leo son soberbias, pero en realidad no lo son. Lo que ocurre es que, por lo general, Leo siente que no tiene nada que ocultar y si tiene algo positivo para enseñar a los demás, lo hará sin problemas. ");
                     }else if(dayBirth >= 23 && dayBirth <= 31 && monthBirth == 8 || dayBirth <= 22 && dayBirth >= 1 && monthBirth == 9)
                     {
                         image.setImageResource(R.drawable.virgo);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("VIRGO \n\nVirgo es un signo de tierra, de naturaleza práctica, con un estilo metódico que le permite alcanzar sus objetivos. Están regidos por Mercurio y suelen ser muy claros en lo que quieren. \n" +
                                 "\n" +
                                 "En el ámbito laboral suelen ser muy eficientes y llegan a destacarse por dicha capacidad. Son capaces de analizar diversas situaciones y llegar a una conclusión acertada. ");

                     }else if(dayBirth >= 23 && dayBirth <= 30 && monthBirth == 9 || dayBirth <= 22 && dayBirth >= 1 && monthBirth == 10)
                     {
                         image.setImageResource(R.drawable.libra);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("LIBRA \n\nLibra es un signo de aire regido por Venus. Los hombres y mujeres de este signo poseen una naturaleza extrovertida, son comunicativos y sociables. Buscan constantemente el equilibrio y se sienten muy atraídos por los desafíos intelectuales. \n" +
                                 "\n" +
                                 "En el ámbito del amor, el hombre de Libra suele tener mucha elocuencia y la utiliza como arma de seducción. Son hombres con mucho encanto para comunicarse y poseen un gran dominio del lenguaje. ");
                     }else if(dayBirth >= 23 && dayBirth <= 31 && monthBirth == 10 || dayBirth <= 21 && dayBirth >= 1 && monthBirth == 11)
                     {
                         image.setImageResource(R.drawable.scorpio);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("ESCORPIÓN  \n\nEscorpio es un signo regido por Plutón, planeta de la intensidad y de las pasiones. \n" +
                                 "\n" +
                                 "Los hombres y mujeres de este signo tienen una personalidad absorbente y quieren abarcarlo todo. Son tenaces y muy exigentes sí mismos y también con los demás. Sin embargo, nunca exigirá a los demás, más de lo que se exige a sí mismo. ");
                     }else if(dayBirth >= 22 && dayBirth <= 30 && monthBirth == 11 || dayBirth <= 21 && dayBirth >= 1 && monthBirth == 12)
                     {
                         image.setImageResource(R.drawable.sagitario);
                         image.setVisibility(View.VISIBLE);
                         txtData.setVisibility(View.VISIBLE);
                         txtData.setText("SAGITARIO  \n\nEs un signo regido por Júpiter, planeta que se relaciona con la abundancia y la alegría. \n" +
                                 "\n" +
                                 "Sagitario es un signo de fuego, de naturaleza expansiva y alegre. Muy optimista y confiado en las posibilidades que pueda brindarle la vida. Por este motivo, en ocasiones suele plantearse metas exageradas. ");
                     }else
                     {
                         Toast.makeText(getContext(), "Error: datos invalidos", Toast.LENGTH_LONG).show();
                     }




                 }else
                 {
                     Toast.makeText(getContext(), "Ingrese los datos para que los astros bajen a la app.", Toast.LENGTH_LONG).show();
                 }

             }
         });
    }
}
