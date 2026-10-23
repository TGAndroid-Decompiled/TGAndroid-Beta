package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f49691a;
    public final i f49692b;

    public j(r rVar, ca.c cVar) {
        this.f49691a = rVar;
        this.f49692b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f49692b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f49689b, str)) {
                return iVar.f49690c;
            }
            ca.c cVar = iVar.f49688a;
            ca.a aVar = i.d;
            File file = new File(cVar.f5047c, str);
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
        i iVar = this.f49692b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f49689b, str)) {
                i.a(iVar.f49688a, str, iVar.f49690c);
                iVar.f49689b = str;
            }
        }
    }
}
