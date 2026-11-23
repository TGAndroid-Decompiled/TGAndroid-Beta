package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f55679a;
    public Object f55680b;

    @Override
    public final void b(String str) {
        switch (this.f55679a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f55680b) + ":" + str);
                return;
            default:
                ((Logger) this.f55680b).log(Level.FINE, str);
                return;
        }
    }
}
