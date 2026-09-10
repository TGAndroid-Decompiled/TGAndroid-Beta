package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f40646a;
    public Object f40647b;

    @Override
    public final void b(String str) {
        switch (this.f40646a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f40647b) + ":" + str);
                return;
            default:
                ((Logger) this.f40647b).log(Level.FINE, str);
                return;
        }
    }
}
