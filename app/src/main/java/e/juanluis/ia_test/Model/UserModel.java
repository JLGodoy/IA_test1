package e.juanluis.ia_test.Model;

public class UserModel {
    private String access_token, token_type, refresh_token, client_id, username, country_code, issued, expires ;
    private double expires_in;

    public UserModel(double expires_in, String access_token, String token_type, String refresh_token, String client_id,
                     String username, String country_code, String issued, String expires){

        this.access_token = access_token;
        this.token_type = token_type;
        this.refresh_token = refresh_token;
        this.client_id = client_id;
        this.username = username;
        this.country_code = country_code;
        this.issued = issued;
        this.expires = expires;
        this.expires_in = expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public String getUsername() {
        return username;
    }


    public String getIssued() {
        return issued;
    }

    public double getExpires_in() {
        return expires_in;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public void setExpires_in(double expires_in) {
        this.expires_in = expires_in;
    }


}
