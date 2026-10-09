package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f46105a;
    public Object f46106b;

    @Override
    public final void b(String str) {
        switch (this.f46105a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f46106b) + ":" + str);
                return;
            default:
                ((Logger) this.f46106b).log(Level.FINE, str);
                return;
        }
    }
}
