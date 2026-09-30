package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41657a;
    public Object f41658b;

    @Override
    public final void b(String str) {
        switch (this.f41657a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41658b) + ":" + str);
                return;
            default:
                ((Logger) this.f41658b).log(Level.FINE, str);
                return;
        }
    }
}
