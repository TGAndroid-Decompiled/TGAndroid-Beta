package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41558a;
    public Object f41559b;

    @Override
    public final void b(String str) {
        switch (this.f41558a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41559b) + ":" + str);
                return;
            default:
                ((Logger) this.f41559b).log(Level.FINE, str);
                return;
        }
    }
}
