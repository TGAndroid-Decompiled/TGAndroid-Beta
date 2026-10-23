package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f50133a;
    public final i f50134b;

    public j(r rVar, ca.c cVar) {
        this.f50133a = rVar;
        this.f50134b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f50134b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f50131b, str)) {
                return iVar.f50132c;
            }
            ca.c cVar = iVar.f50130a;
            ca.a aVar = i.d;
            File file = new File(cVar.f5052c, str);
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
        i iVar = this.f50134b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f50131b, str)) {
                i.a(iVar.f50130a, str, iVar.f50132c);
                iVar.f50131b = str;
            }
        }
    }
}
