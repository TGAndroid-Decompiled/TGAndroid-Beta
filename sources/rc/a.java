package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44125a;
    public Object f44126b;

    @Override
    public final void b(String str) {
        switch (this.f44125a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44126b) + ":" + str);
                return;
            default:
                ((Logger) this.f44126b).log(Level.FINE, str);
                return;
        }
    }
}
