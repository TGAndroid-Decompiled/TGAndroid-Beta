package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f45246a;
    public final i f45247b;

    public j(s sVar, ba.c cVar) {
        this.f45246a = sVar;
        this.f45247b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f45247b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f45244b, str)) {
                return iVar.f45245c;
            }
            ba.c cVar = iVar.f45243a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3452c, str);
            file.mkdirs();
            List e = ba.c.e(file.listFiles(aVar));
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
        i iVar = this.f45247b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f45244b, str)) {
                i.a(iVar.f45243a, str, iVar.f45245c);
                iVar.f45244b = str;
            }
        }
    }
}
