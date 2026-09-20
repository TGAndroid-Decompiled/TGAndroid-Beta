package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f45226a;
    public final i f45227b;

    public j(r rVar, ba.c cVar) {
        this.f45226a = rVar;
        this.f45227b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f45227b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f45224b, str)) {
                return iVar.f45225c;
            }
            ba.c cVar = iVar.f45223a;
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
        i iVar = this.f45227b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f45224b, str)) {
                i.a(iVar.f45223a, str, iVar.f45225c);
                iVar.f45224b = str;
            }
        }
    }
}
