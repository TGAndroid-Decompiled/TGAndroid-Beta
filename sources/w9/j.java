package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f48947a;
    public final i f48948b;

    public j(s sVar, ba.c cVar) {
        this.f48947a = sVar;
        this.f48948b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f48948b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f48945b, str)) {
                return iVar.f48946c;
            }
            ba.c cVar = iVar.f48944a;
            ba.a aVar = i.d;
            File file = new File(cVar.f3722c, str);
            file.mkdirs();
            List e7 = ba.c.e(file.listFiles(aVar));
            if (e7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e7, i.f48943e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f48948b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f48945b, str)) {
                i.a(iVar.f48944a, str, iVar.f48946c);
                iVar.f48945b = str;
            }
        }
    }
}
