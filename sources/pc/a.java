package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f53560a;
    public Object f53561b;

    @Override
    public final void b(String str) {
        switch (this.f53560a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f53561b) + ":" + str);
                return;
            default:
                ((Logger) this.f53561b).log(Level.FINE, str);
                return;
        }
    }
}
