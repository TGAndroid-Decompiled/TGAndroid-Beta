package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41265a;
    public Object f41266b;

    @Override
    public final void b(String str) {
        switch (this.f41265a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41266b) + ":" + str);
                return;
            default:
                ((Logger) this.f41266b).log(Level.FINE, str);
                return;
        }
    }
}
