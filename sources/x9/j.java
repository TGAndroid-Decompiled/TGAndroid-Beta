package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f53457a;
    public final i f53458b;

    public j(s sVar, ca.c cVar) {
        this.f53457a = sVar;
        this.f53458b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f53458b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f53455b, str)) {
                return iVar.f53456c;
            }
            ca.c cVar = iVar.f53454a;
            ca.a aVar = i.d;
            File file = new File(cVar.f4085c, str);
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
        i iVar = this.f53458b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f53455b, str)) {
                i.a(iVar.f53454a, str, iVar.f53456c);
                iVar.f53455b = str;
            }
        }
    }
}
