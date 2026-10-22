package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f45225a;
    public Object f45226b;

    @Override
    public final void b(String str) {
        switch (this.f45225a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f45226b) + ":" + str);
                return;
            default:
                ((Logger) this.f45226b).log(Level.FINE, str);
                return;
        }
    }
}
