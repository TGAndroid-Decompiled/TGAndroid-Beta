package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f55601a;
    public Object f55602b;

    @Override
    public final void b(String str) {
        switch (this.f55601a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f55602b) + ":" + str);
                return;
            default:
                ((Logger) this.f55602b).log(Level.FINE, str);
                return;
        }
    }
}
