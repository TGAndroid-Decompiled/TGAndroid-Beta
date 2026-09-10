package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f43887a;
    public final i f43888b;

    public j(r rVar, ba.c cVar) {
        this.f43887a = rVar;
        this.f43888b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f43888b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f43885b, str)) {
                return iVar.f43886c;
            }
            ba.c cVar = iVar.f43884a;
            ba.a aVar = i.d;
            File file = new File(cVar.f2146c, str);
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
        i iVar = this.f43888b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f43885b, str)) {
                i.a(iVar.f43884a, str, iVar.f43886c);
                iVar.f43885b = str;
            }
        }
    }
}
