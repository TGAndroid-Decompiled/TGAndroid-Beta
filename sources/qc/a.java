package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f46052a;
    public Object f46053b;

    @Override
    public final void b(String str) {
        switch (this.f46052a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f46053b) + ":" + str);
                return;
            default:
                ((Logger) this.f46053b).log(Level.FINE, str);
                return;
        }
    }
}
