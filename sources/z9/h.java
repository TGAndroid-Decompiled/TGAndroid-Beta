package z9;

import android.util.Log;
import java.io.IOException;
import vg.i1;
public final class h {
    public static final fa.a d = new fa.a(2);
    public static final i1 f60180e = new i1(10);
    public final fa.f f60181a;
    public String f60182b = null;
    public String f60183c = null;

    public h(fa.f fVar) {
        this.f60181a = fVar;
    }

    public static void a(fa.f fVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                fVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
            }
        }
    }
}
