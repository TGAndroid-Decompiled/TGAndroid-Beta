package qc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f41291a;
    public Object f41292b;

    @Override
    public final void b(String str) {
        switch (this.f41291a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f41292b) + ":" + str);
                return;
            default:
                ((Logger) this.f41292b).log(Level.FINE, str);
                return;
        }
    }
}
