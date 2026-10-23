package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f45638a;
    public Object f45639b;

    @Override
    public final void b(String str) {
        switch (this.f45638a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f45639b) + ":" + str);
                return;
            default:
                ((Logger) this.f45639b).log(Level.FINE, str);
                return;
        }
    }
}
