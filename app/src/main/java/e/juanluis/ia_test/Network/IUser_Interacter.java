package e.juanluis.ia_test.Network;


import e.juanluis.ia_test.Model.UserModel;
import rx.Observable;

public interface IUser_Interacter {

    Observable<UserModel> getUserModel();
}
