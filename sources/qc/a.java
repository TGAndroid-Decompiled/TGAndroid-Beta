package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44950a;
    public Object f44951b;

    @Override
    public final void b(String str) {
        switch (this.f44950a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44951b) + ":" + str);
                return;
            default:
                ((Logger) this.f44951b).log(Level.FINE, str);
                return;
        }
    }
}
