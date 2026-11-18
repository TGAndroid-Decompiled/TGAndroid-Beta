package pc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class a extends c {
    public final int f55556a;
    public Object f55557b;

    @Override
    public final void b(String str) {
        switch (this.f55556a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.f55557b) + ":" + str);
                return;
            default:
                ((Logger) this.f55557b).log(Level.FINE, str);
                return;
        }
    }
}
