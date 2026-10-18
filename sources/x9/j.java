package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f49681a;
    public final i f49682b;

    public j(r rVar, ca.c cVar) {
        this.f49681a = rVar;
        this.f49682b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f49682b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f49679b, str)) {
                return iVar.f49680c;
            }
            ca.c cVar = iVar.f49678a;
            ca.a aVar = i.d;
            File file = new File(cVar.f5050c, str);
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
        i iVar = this.f49682b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f49679b, str)) {
                i.a(iVar.f49678a, str, iVar.f49680c);
                iVar.f49679b = str;
            }
        }
    }
}
