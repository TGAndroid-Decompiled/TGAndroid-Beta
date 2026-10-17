package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f45240a;
    public Object f45241b;

    @Override
    public final void b(String str) {
        switch (this.f45240a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f45241b) + ":" + str);
                return;
            default:
                ((Logger) this.f45241b).log(Level.FINE, str);
                return;
        }
    }
}
