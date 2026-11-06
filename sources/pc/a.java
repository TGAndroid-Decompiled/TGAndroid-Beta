package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f53467a;
    public Object f53468b;

    @Override
    public final void b(String str) {
        switch (this.f53467a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f53468b) + ":" + str);
                return;
            default:
                ((Logger) this.f53468b).log(Level.FINE, str);
                return;
        }
    }
}
