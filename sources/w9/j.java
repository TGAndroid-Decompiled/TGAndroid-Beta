package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f48939a;
    public final i f48940b;

    public j(s sVar, ba.c cVar) {
        this.f48939a = sVar;
        this.f48940b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f48940b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f48937b, str)) {
                return iVar.f48938c;
            }
            ba.c cVar = iVar.f48936a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3722c, str);
            file.mkdirs();
            List e7 = ba.c.e(file.listFiles(aVar));
            if (e7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e7, i.f48935e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f48940b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f48937b, str)) {
                i.a(iVar.f48936a, str, iVar.f48938c);
                iVar.f48937b = str;
            }
        }
    }
}
