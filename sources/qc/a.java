package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41269a;
    public Object f41270b;

    @Override
    public final void b(String str) {
        switch (this.f41269a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41270b) + ":" + str);
                return;
            default:
                ((Logger) this.f41270b).log(Level.FINE, str);
                return;
        }
    }
}
