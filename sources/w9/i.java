package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.lb1;
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final lb1 e = new lb1(8);
    public final ba.c f44948a;
    public String f44949b = null;
    public String f44950c = null;

    public i(ba.c cVar) {
        this.f44948a = cVar;
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
