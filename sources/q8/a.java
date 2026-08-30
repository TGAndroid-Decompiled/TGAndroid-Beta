package q8;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
public abstract class a extends Activity {
    public abstract Class getServiceClass();

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, getServiceClass());
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        finish();
    }
}
