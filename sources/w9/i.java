package w9;

import android.util.Log;
import java.io.IOException;
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final sg.p e = new sg.p(1);
    public final ba.c f43884a;
    public String f43885b = null;
    public String f43886c = null;

    public i(ba.c cVar) {
        this.f43884a = cVar;
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
