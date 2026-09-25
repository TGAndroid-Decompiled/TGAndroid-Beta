package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41559a;
    public Object f41560b;

    @Override
    public final void b(String str) {
        switch (this.f41559a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41560b) + ":" + str);
                return;
            default:
                ((Logger) this.f41560b).log(Level.FINE, str);
                return;
        }
    }
}
