package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44337a;
    public Object f44338b;

    @Override
    public final void b(String str) {
        switch (this.f44337a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44338b) + ":" + str);
                return;
            default:
                ((Logger) this.f44338b).log(Level.FINE, str);
                return;
        }
    }
}
