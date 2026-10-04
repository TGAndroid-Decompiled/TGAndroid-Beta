package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44936a;
    public Object f44937b;

    @Override
    public final void b(String str) {
        switch (this.f44936a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44937b) + ":" + str);
                return;
            default:
                ((Logger) this.f44937b).log(Level.FINE, str);
                return;
        }
    }
}
