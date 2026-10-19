package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f49680a;
    public final i f49681b;

    public j(r rVar, ca.c cVar) {
        this.f49680a = rVar;
        this.f49681b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f49681b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f49678b, str)) {
                return iVar.f49679c;
            }
            ca.c cVar = iVar.f49677a;
            ca.a aVar = i.d;
            File file = new File(cVar.f5049c, str);
            file.mkdirs();
            List e = ca.c.e(file.listFiles(aVar));
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
        i iVar = this.f49681b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f49678b, str)) {
                i.a(iVar.f49677a, str, iVar.f49679c);
                iVar.f49678b = str;
            }
        }
    }
}
