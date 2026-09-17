package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f48394a;
    public final i f48395b;

    public j(r rVar, ba.c cVar) {
        this.f48394a = rVar;
        this.f48395b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f48395b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f48392b, str)) {
                return iVar.f48393c;
            }
            ba.c cVar = iVar.f48391a;
            ba.a aVar = i.d;
            File file = new File(cVar.f2528c, str);
            file.mkdirs();
            List e7 = ba.c.e(file.listFiles(aVar));
            if (e7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e7, i.f48390e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f48395b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f48392b, str)) {
                i.a(iVar.f48391a, str, iVar.f48393c);
                iVar.f48392b = str;
            }
        }
    }
}
