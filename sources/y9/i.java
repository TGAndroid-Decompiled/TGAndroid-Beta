package y9;

import android.util.Log;
import java.io.IOException;
public final class i {
    public static final da.a d = new da.a(3);
    public static final y2.p e = new y2.p(1);
    public final da.c f52487a;
    public String f52488b = null;
    public String f52489c = null;

    public i(da.c cVar) {
        this.f52487a = cVar;
    }

    public static void a(da.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                cVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
            }
        }
    }
}
