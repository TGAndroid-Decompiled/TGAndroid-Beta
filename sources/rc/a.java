package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f45637a;
    public Object f45638b;

    @Override
    public final void b(String str) {
        switch (this.f45637a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f45638b) + ":" + str);
                return;
            default:
                ((Logger) this.f45638b).log(Level.FINE, str);
                return;
        }
    }
}
