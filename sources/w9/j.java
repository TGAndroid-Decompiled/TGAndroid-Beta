package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f44951a;
    public final i f44952b;

    public j(r rVar, ba.c cVar) {
        this.f44951a = rVar;
        this.f44952b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f44952b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f44949b, str)) {
                return iVar.f44950c;
            }
            ba.c cVar = iVar.f44948a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3453c, str);
            file.mkdirs();
            List e = ba.c.e(file.listFiles(aVar));
            if (e.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e, i.e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f44952b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f44949b, str)) {
                i.a(iVar.f44948a, str, iVar.f44950c);
                iVar.f44949b = str;
            }
        }
    }
}
