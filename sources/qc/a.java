package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41544a;
    public Object f41545b;

    @Override
    public final void b(String str) {
        switch (this.f41544a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41545b) + ":" + str);
                return;
            default:
                ((Logger) this.f41545b).log(Level.FINE, str);
                return;
        }
    }
}
