package zb;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class a extends c {

    public final int f50317a;

    public Object f50318b;

    @Override
    public final void b(String str) {
        switch (this.f50317a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f50318b) + ":" + str);
                break;
            default:
                ((Logger) this.f50318b).log(Level.FINE, str);
                break;
        }
    }
}
