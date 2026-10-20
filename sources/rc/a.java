package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f45222a;
    public Object f45223b;

    @Override
    public final void b(String str) {
        switch (this.f45222a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f45223b) + ":" + str);
                return;
            default:
                ((Logger) this.f45223b).log(Level.FINE, str);
                return;
        }
    }
}
