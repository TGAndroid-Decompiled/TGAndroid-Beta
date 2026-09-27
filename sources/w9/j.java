package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f45254a;
    public final i f45255b;

    public j(s sVar, ba.c cVar) {
        this.f45254a = sVar;
        this.f45255b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f45255b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f45252b, str)) {
                return iVar.f45253c;
            }
            ba.c cVar = iVar.f45251a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3447c, str);
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
        i iVar = this.f45255b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f45252b, str)) {
                i.a(iVar.f45251a, str, iVar.f45253c);
                iVar.f45252b = str;
            }
        }
    }
}
