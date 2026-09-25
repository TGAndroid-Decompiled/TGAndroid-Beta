package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f45210a;
    public final i f45211b;

    public j(r rVar, ba.c cVar) {
        this.f45210a = rVar;
        this.f45211b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f45211b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f45208b, str)) {
                return iVar.f45209c;
            }
            ba.c cVar = iVar.f45207a;
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
        i iVar = this.f45211b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f45208b, str)) {
                i.a(iVar.f45207a, str, iVar.f45209c);
                iVar.f45208b = str;
            }
        }
    }
}
