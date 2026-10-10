package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.mb1;
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final mb1 f50276e = new mb1(10);
    public final ba.c f50277a;
    public String f50278b = null;
    public String f50279c = null;

    public i(ba.c cVar) {
        this.f50277a = cVar;
    }

    public static void a(ba.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                cVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e7) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e7);
            }
        }
    }
}
