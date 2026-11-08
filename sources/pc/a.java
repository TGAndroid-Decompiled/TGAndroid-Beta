package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f53561a;
    public Object f53562b;

    @Override
    public final void b(String str) {
        switch (this.f53561a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f53562b) + ":" + str);
                return;
            default:
                ((Logger) this.f53562b).log(Level.FINE, str);
                return;
        }
    }
}
