package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44935a;
    public Object f44936b;

    @Override
    public final void b(String str) {
        switch (this.f44935a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44936b) + ":" + str);
                return;
            default:
                ((Logger) this.f44936b).log(Level.FINE, str);
                return;
        }
    }
}
