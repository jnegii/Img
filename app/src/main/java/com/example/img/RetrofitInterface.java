package com.example.img;


import java.util.ArrayList;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitInterface {

    @Multipart
    @POST("Api.php?apicall=upload")
    Call<imageModel> imageupload(@Part MultipartBody.Part  file,
                                   @Part("desc") RequestBody desc);


}
