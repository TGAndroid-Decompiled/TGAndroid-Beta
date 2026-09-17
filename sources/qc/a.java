package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f44338a;
    public Object f44339b;

    @Override
    public final void b(String str) {
        switch (this.f44338a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f44339b) + ":" + str);
                return;
            default:
                ((Logger) this.f44339b).log(Level.FINE, str);
                return;
        }
    }
}
