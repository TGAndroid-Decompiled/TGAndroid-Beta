package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f53469a;
    public Object f53470b;

    @Override
    public final void b(String str) {
        switch (this.f53469a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f53470b) + ":" + str);
                return;
            default:
                ((Logger) this.f53470b).log(Level.FINE, str);
                return;
        }
    }
}
