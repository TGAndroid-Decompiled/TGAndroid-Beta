package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f45208a;
    public final i f45209b;

    public j(r rVar, ba.c cVar) {
        this.f45208a = rVar;
        this.f45209b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f45209b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f45206b, str)) {
                return iVar.f45207c;
            }
            ba.c cVar = iVar.f45205a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3445c, str);
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
        i iVar = this.f45209b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f45206b, str)) {
                i.a(iVar.f45205a, str, iVar.f45207c);
                iVar.f45206b = str;
            }
        }
    }
}
