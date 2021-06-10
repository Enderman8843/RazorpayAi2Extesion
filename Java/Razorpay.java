package io.sashi.razorpay;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
        version = 1,
        description = "An Extension For Razorpay by sashibhusan_coder(Shreyansh Sahoo) ",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://i.ibb.co/gvy3M9Q/Download.jpg")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class Razorpay extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public Razorpay(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }



    @SimpleFunction(description = "Creates Payment")
    public void IntiatePayment(String scriptUrl ,String key ,int phoneNo ,String userName ,int amount ,String iconUrl ,String title  ,String color ,String description
      ) {
       URLGenerated(scriptUrl + "?" + "amt" + "=" + amount + "&" + "name" + "=" + title +"&" + "des" + "=" +  description + "&" +"image" + "=" +  iconUrl + "&" +"username" + "=" +  userName
       + "&" + "phoneno" + "=" +  phoneNo + "&" + "color" + "=" + "#" + color +"&"+ "apikey" + "=" +  key +"&");
    }
  
    @SimpleEvent(description = "Generated URL")
    public void URLGenerated(String url) {
      EventDispatcher.dispatchEvent(this, "URLGenerated", url);
    }
}
