package sandyakakom.gmail.pert7_pem_mobile;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import java.io.IOException;

public class MyService extends Service {
    MediaPlayer musik;
    @Override
    public IBinder onBind(Intent intent) {
// TODO Auto-generated method stub
        return null;
    }
    @Override
    public void onCreate() {
// TODO Auto-generated method stub
    }
    @Override
    public void onStart(Intent intent, int startId) {
// TODO Auto-generated method stub
        musik = MediaPlayer.create(this, R.raw.perfect);
        try {
            musik.prepare();
        } catch (IllegalStateException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        musik.start();
    }
    @Override
    public void onDestroy() {
// TODO Auto-generated method stub
        musik.stop();
    }
}