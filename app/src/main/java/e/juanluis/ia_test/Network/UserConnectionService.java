package e.juanluis.ia_test.Network;

import e.juanluis.ia_test.Model.UserModel;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

public class UserConnectionService {

    private static Retrofit userRetrofit;
    private static OkHttpClient userHttpClient;

    public UserConnectionService(){getConnection();}

    private IUserRequestInterface getConnection() {

        userRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(UserRequest.USER_BASE_URL)
                .build();

        return userRetrofit.create(IUserRequestInterface.class);
    }

    @Override
    public Observable<UserModel> getUserModel(){
        return getConnection().getUserModel();
    }

}
