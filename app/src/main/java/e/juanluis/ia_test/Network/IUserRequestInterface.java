package e.juanluis.ia_test.Network;

import rx.Observable;

import e.juanluis.ia_test.Model.UserModel;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface IUserRequestInterface {


    @POST("oauth/token")
    Observable<UserModel>getUserModel();
}
