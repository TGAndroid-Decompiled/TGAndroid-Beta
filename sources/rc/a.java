package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f43884a;
    public Object f43885b;

    @Override
    public final void b(String str) {
        switch (this.f43884a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f43885b) + ":" + str);
                return;
            default:
                ((Logger) this.f43885b).log(Level.FINE, str);
                return;
        }
    }
}
