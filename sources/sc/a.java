package sc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f48079a;
    public Object f48080b;

    @Override
    public final void b(String str) {
        switch (this.f48079a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f48080b) + ":" + str);
                return;
            default:
                ((Logger) this.f48080b).log(Level.FINE, str);
                return;
        }
    }
}
