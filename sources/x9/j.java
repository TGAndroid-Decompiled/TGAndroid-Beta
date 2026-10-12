package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f48295a;
    public final i f48296b;

    public j(s sVar, ca.c cVar) {
        this.f48295a = sVar;
        this.f48296b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f48296b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f48293b, str)) {
                return iVar.f48294c;
            }
            ca.c cVar = iVar.f48292a;
            ca.a aVar = i.d;
            File file = new File(cVar.f4676c, str);
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
        i iVar = this.f48296b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f48293b, str)) {
                i.a(iVar.f48292a, str, iVar.f48294c);
                iVar.f48293b = str;
            }
        }
    }
}
