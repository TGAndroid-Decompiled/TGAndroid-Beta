package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f50280a;
    public final i f50281b;

    public j(r rVar, ba.c cVar) {
        this.f50280a = rVar;
        this.f50281b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f50281b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f50278b, str)) {
                return iVar.f50279c;
            }
            ba.c cVar = iVar.f50277a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3801c, str);
            file.mkdirs();
            List e7 = ba.c.e(file.listFiles(aVar));
            if (e7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e7, i.f50276e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f50281b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f50278b, str)) {
                i.a(iVar.f50277a, str, iVar.f50279c);
                iVar.f50278b = str;
            }
        }
    }
}
