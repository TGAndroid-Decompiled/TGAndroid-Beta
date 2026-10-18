package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f49728a;
    public final i f49729b;

    public j(r rVar, ca.c cVar) {
        this.f49728a = rVar;
        this.f49729b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f49729b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f49726b, str)) {
                return iVar.f49727c;
            }
            ca.c cVar = iVar.f49725a;
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
        i iVar = this.f49729b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f49726b, str)) {
                i.a(iVar.f49725a, str, iVar.f49727c);
                iVar.f49726b = str;
            }
        }
    }
}
