package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f48423a;
    public final i f48424b;

    public j(r rVar, ba.c cVar) {
        this.f48423a = rVar;
        this.f48424b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f48424b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f48421b, str)) {
                return iVar.f48422c;
            }
            ba.c cVar = iVar.f48420a;
            ba.a aVar = i.d;
            File file = new File(cVar.f2555c, str);
            file.mkdirs();
            List e7 = ba.c.e(file.listFiles(aVar));
            if (e7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e7, i.f48419e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f48424b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f48421b, str)) {
                i.a(iVar.f48420a, str, iVar.f48422c);
                iVar.f48421b = str;
            }
        }
    }
}
