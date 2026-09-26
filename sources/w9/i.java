package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.db1;
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final db1 e = new db1(8);
    public final ba.c f45205a;
    public String f45206b = null;
    public String f45207c = null;

    public i(ba.c cVar) {
        this.f45205a = cVar;
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
