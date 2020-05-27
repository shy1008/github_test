package cokr.rootlink.github_test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Dialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vibrator vib = (Vibrator) getSystemService(VIBRATOR_SERVICE);
//        vib.vibrate(1000); //1초동안 진동
//        vib.vibrate(new long[]{1000,500,1000,500},-1); //1초 대기 0.5초 진동

        // 시스템 알림
//        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//        Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(),notification);
//        ringtone.play();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        DialogInterface.OnClickListener dialogListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d("","취소누름");
            }
        };


        builder.setTitle("알림");
        builder.setMessage("종료?");
        builder.setPositiveButton("ok",null);
        builder.setNegativeButton("No", dialogListener);
        builder.setCancelable(false); //겉에 눌렀을떄 반응없게

        alertDialog = builder.create();
        alertDialog.show();



    }
}
