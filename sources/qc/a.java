package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44310a;
    public Object f44311b;

    @Override
    public final void b(String str) {
        switch (this.f44310a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44311b) + ":" + str);
                return;
            default:
                ((Logger) this.f44311b).log(Level.FINE, str);
                return;
        }
    }
}
