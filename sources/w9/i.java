package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.ob1;
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final ob1 e = new ob1(8);
    public final ba.c f44925a;
    public String f44926b = null;
    public String f44927c = null;

    public i(ba.c cVar) {
        this.f44925a = cVar;
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
