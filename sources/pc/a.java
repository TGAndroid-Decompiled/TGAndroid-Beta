package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f54980a;
    public Object f54981b;

    @Override
    public final void b(String str) {
        switch (this.f54980a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f54981b) + ":" + str);
                return;
            default:
                ((Logger) this.f54981b).log(Level.FINE, str);
                return;
        }
    }
}
