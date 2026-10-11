package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.lb1;
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final lb1 f50353e = new lb1(10);
    public final ba.c f50354a;
    public String f50355b = null;
    public String f50356c = null;

    public i(ba.c cVar) {
        this.f50354a = cVar;
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
