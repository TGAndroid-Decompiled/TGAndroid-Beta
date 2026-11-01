package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f53475a;
    public final i f53476b;

    public j(s sVar, ca.c cVar) {
        this.f53475a = sVar;
        this.f53476b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f53476b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f53473b, str)) {
                return iVar.f53474c;
            }
            ca.c cVar = iVar.f53472a;
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
        i iVar = this.f53476b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f53473b, str)) {
                i.a(iVar.f53472a, str, iVar.f53474c);
                iVar.f53473b = str;
            }
        }
    }
}
