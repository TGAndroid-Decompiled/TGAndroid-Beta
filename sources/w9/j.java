package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f44924a;
    public final i f44925b;

    public j(r rVar, ba.c cVar) {
        this.f44924a = rVar;
        this.f44925b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f44925b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f44922b, str)) {
                return iVar.f44923c;
            }
            ba.c cVar = iVar.f44921a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3450c, str);
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
        i iVar = this.f44925b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f44922b, str)) {
                i.a(iVar.f44921a, str, iVar.f44923c);
                iVar.f44922b = str;
            }
        }
    }
}
