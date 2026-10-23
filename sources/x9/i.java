package x9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.o70;
public final class i {
    public static final ca.a d = new ca.a(2);
    public static final o70 e = new o70(26);
    public final ca.c f50130a;
    public String f50131b = null;
    public String f50132c = null;

    public i(ca.c cVar) {
        this.f50130a = cVar;
    }

    public static void a(ca.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                cVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e7) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e7);
            }
        }
    }
}
