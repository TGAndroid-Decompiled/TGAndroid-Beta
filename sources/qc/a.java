package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f46107a;
    public Object f46108b;

    @Override
    public final void b(String str) {
        switch (this.f46107a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f46108b) + ":" + str);
                return;
            default:
                ((Logger) this.f46108b).log(Level.FINE, str);
                return;
        }
    }
}
