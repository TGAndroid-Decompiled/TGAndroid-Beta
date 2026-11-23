package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f55566a;
    public Object f55567b;

    @Override
    public final void b(String str) {
        switch (this.f55566a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f55567b) + ":" + str);
                return;
            default:
                ((Logger) this.f55567b).log(Level.FINE, str);
                return;
        }
    }
}
