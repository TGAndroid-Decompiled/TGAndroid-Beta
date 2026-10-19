package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f45212a;
    public Object f45213b;

    @Override
    public final void b(String str) {
        switch (this.f45212a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f45213b) + ":" + str);
                return;
            default:
                ((Logger) this.f45213b).log(Level.FINE, str);
                return;
        }
    }
}
