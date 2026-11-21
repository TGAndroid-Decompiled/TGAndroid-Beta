package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f55597a;
    public Object f55598b;

    @Override
    public final void b(String str) {
        switch (this.f55597a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f55598b) + ":" + str);
                return;
            default:
                ((Logger) this.f55598b).log(Level.FINE, str);
                return;
        }
    }
}
