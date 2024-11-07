package views;

import models.EspeceDetail;
import models.Observation;
import java.util.List;


public interface IViewForController {

    void start();

    void afficheListeEspeces(List<EspeceDetail> listEspeceDetails);

    void afficheListeObservations(List<Observation> listObservations);

    void messageInfo(String message);

    void messageErreur(String message);

}
