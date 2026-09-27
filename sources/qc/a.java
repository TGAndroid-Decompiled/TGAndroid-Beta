package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41588a;
    public Object f41589b;

    @Override
    public final void b(String str) {
        switch (this.f41588a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41589b) + ":" + str);
                return;
            default:
                ((Logger) this.f41589b).log(Level.FINE, str);
                return;
        }
    }
}
