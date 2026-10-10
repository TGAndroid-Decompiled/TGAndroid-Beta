package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f46151a;
    public Object f46152b;

    @Override
    public final void b(String str) {
        switch (this.f46151a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f46152b) + ":" + str);
                return;
            default:
                ((Logger) this.f46152b).log(Level.FINE, str);
                return;
        }
    }
}
