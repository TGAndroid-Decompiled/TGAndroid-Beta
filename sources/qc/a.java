package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41572a;
    public Object f41573b;

    @Override
    public final void b(String str) {
        switch (this.f41572a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41573b) + ":" + str);
                return;
            default:
                ((Logger) this.f41573b).log(Level.FINE, str);
                return;
        }
    }
}
