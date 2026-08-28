package yb;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f49722a;
    public Object f49723b;

    @Override
    public final void b(String str) {
        switch (this.f49722a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f49723b) + ":" + str);
                return;
            default:
                ((Logger) this.f49723b).log(Level.FINE, str);
                return;
        }
    }
}
