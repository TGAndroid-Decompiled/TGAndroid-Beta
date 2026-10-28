package sc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f48117a;
    public Object f48118b;

    @Override
    public final void b(String str) {
        switch (this.f48117a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f48118b) + ":" + str);
                return;
            default:
                ((Logger) this.f48118b).log(Level.FINE, str);
                return;
        }
    }
}
