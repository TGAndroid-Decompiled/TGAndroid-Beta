package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44943a;
    public Object f44944b;

    @Override
    public final void b(String str) {
        switch (this.f44943a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44944b) + ":" + str);
                return;
            default:
                ((Logger) this.f44944b).log(Level.FINE, str);
                return;
        }
    }
}
