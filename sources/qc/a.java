package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41560a;
    public Object f41561b;

    @Override
    public final void b(String str) {
        switch (this.f41560a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41561b) + ":" + str);
                return;
            default:
                ((Logger) this.f41561b).log(Level.FINE, str);
                return;
        }
    }
}
