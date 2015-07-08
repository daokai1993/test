package cn.hhs.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class DataUtil {
	public static void Alert(Context context,String error) {
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setMessage(error)
         .setCancelable(false)
        .setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
         public void onClick(DialogInterface dialog, int id) {
      	   dialog.cancel();
         }
     });
		 builder.show();
	}
}
