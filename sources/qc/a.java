package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f46219a;
    public Object f46220b;

    @Override
    public final void b(String str) {
        switch (this.f46219a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f46220b) + ":" + str);
                return;
            default:
                ((Logger) this.f46220b).log(Level.FINE, str);
                return;
        }
    }
}
