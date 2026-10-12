package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f50463a;
    public final i f50464b;

    public j(s sVar, ba.c cVar) {
        this.f50463a = sVar;
        this.f50464b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f50464b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f50461b, str)) {
                return iVar.f50462c;
            }
            ba.c cVar = iVar.f50460a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3799c, str);
            file.mkdirs();
            List e7 = ba.c.e(file.listFiles(aVar));
            if (e7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e7, i.f50459e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f50464b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f50461b, str)) {
                i.a(iVar.f50460a, str, iVar.f50462c);
                iVar.f50461b = str;
            }
        }
    }
}
