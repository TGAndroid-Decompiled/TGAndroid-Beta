package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.f11;
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final f11 f48418e = new f11(10);
    public final ba.c f48419a;
    public String f48420b = null;
    public String f48421c = null;

    public i(ba.c cVar) {
        this.f48419a = cVar;
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
