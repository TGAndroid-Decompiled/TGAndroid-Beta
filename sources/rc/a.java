package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f45226a;
    public Object f45227b;

    @Override
    public final void b(String str) {
        switch (this.f45226a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f45227b) + ":" + str);
                return;
            default:
                ((Logger) this.f45227b).log(Level.FINE, str);
                return;
        }
    }
}
