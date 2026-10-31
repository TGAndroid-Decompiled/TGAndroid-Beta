package x9;

import android.util.Log;
import java.io.IOException;
public final class i {
    public static final ca.a d = new ca.a(2);
    public static final x2.e e = new x2.e(5);
    public final ca.c f53454a;
    public String f53455b = null;
    public String f53456c = null;

    public i(ca.c cVar) {
        this.f53454a = cVar;
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
