package ro.magdamiu.myapplication.module8.github;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GithubApi {
    @GET("/users")
    Call<List<User>> getAllUsers();
}