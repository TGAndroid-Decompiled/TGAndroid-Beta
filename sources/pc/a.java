package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f53443a;
    public Object f53444b;

    @Override
    public final void b(String str) {
        switch (this.f53443a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f53444b) + ":" + str);
                return;
            default:
                ((Logger) this.f53444b).log(Level.FINE, str);
                return;
        }
    }
}
