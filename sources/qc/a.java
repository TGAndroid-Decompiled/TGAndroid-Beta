package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41221a;
    public Object f41222b;

    @Override
    public final void b(String str) {
        switch (this.f41221a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41222b) + ":" + str);
                return;
            default:
                ((Logger) this.f41222b).log(Level.FINE, str);
                return;
        }
    }
}
