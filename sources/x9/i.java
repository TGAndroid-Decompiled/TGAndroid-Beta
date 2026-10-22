package x9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.jg0;
public final class i {
    public static final ca.a d = new ca.a(2);
    public static final jg0 e = new jg0(25);
    public final ca.c f49687a;
    public String f49688b = null;
    public String f49689c = null;

    public i(ca.c cVar) {
        this.f49687a = cVar;
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
