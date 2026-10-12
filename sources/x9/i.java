package x9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.es0;
public final class i {
    public static final ca.a d = new ca.a(2);
    public static final es0 e = new es0(22);
    public final ca.c f48292a;
    public String f48293b = null;
    public String f48294c = null;

    public i(ca.c cVar) {
        this.f48292a = cVar;
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
