package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f50132a;
    public final i f50133b;

    public j(r rVar, ca.c cVar) {
        this.f50132a = rVar;
        this.f50133b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f50133b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f50130b, str)) {
                return iVar.f50131c;
            }
            ca.c cVar = iVar.f50129a;
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
        i iVar = this.f50133b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f50130b, str)) {
                i.a(iVar.f50129a, str, iVar.f50131c);
                iVar.f50130b = str;
            }
        }
    }
}
