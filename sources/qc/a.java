package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f46185a;
    public Object f46186b;

    @Override
    public final void b(String str) {
        switch (this.f46185a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f46186b) + ":" + str);
                return;
            default:
                ((Logger) this.f46186b).log(Level.FINE, str);
                return;
        }
    }
}
