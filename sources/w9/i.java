package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.eb1;
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final eb1 f48950e = new eb1(8);
    public final ba.c f48951a;
    public String f48952b = null;
    public String f48953c = null;

    public i(ba.c cVar) {
        this.f48951a = cVar;
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
