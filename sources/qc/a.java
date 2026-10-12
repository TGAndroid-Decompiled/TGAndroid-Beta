package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f46044a;
    public Object f46045b;

    @Override
    public final void b(String str) {
        switch (this.f46044a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f46045b) + ":" + str);
                return;
            default:
                ((Logger) this.f46045b).log(Level.FINE, str);
                return;
        }
    }
}
