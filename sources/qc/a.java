package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44309a;
    public Object f44310b;

    @Override
    public final void b(String str) {
        switch (this.f44309a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44310b) + ":" + str);
                return;
            default:
                ((Logger) this.f44310b).log(Level.FINE, str);
                return;
        }
    }
}
