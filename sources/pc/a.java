package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f53572a;
    public Object f53573b;

    @Override
    public final void b(String str) {
        switch (this.f53572a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f53573b) + ":" + str);
                return;
            default:
                ((Logger) this.f53573b).log(Level.FINE, str);
                return;
        }
    }
}
