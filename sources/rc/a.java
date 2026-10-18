package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f45260a;
    public Object f45261b;

    @Override
    public final void b(String str) {
        switch (this.f45260a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f45261b) + ":" + str);
                return;
            default:
                ((Logger) this.f45261b).log(Level.FINE, str);
                return;
        }
    }
}
