package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41296a;
    public Object f41297b;

    @Override
    public final void b(String str) {
        switch (this.f41296a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41297b) + ":" + str);
                return;
            default:
                ((Logger) this.f41297b).log(Level.FINE, str);
                return;
        }
    }
}
