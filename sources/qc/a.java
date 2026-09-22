package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41593a;
    public Object f41594b;

    @Override
    public final void b(String str) {
        switch (this.f41593a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41594b) + ":" + str);
                return;
            default:
                ((Logger) this.f41594b).log(Level.FINE, str);
                return;
        }
    }
}
