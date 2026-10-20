package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final r f49687a;
    public final i f49688b;

    public j(r rVar, ca.c cVar) {
        this.f49687a = rVar;
        this.f49688b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f49688b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f49685b, str)) {
                return iVar.f49686c;
            }
            ca.c cVar = iVar.f49684a;
            ca.a aVar = i.d;
            File file = new File(cVar.f5047c, str);
            file.mkdirs();
            List e = ca.c.e(file.listFiles(aVar));
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
        i iVar = this.f49688b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f49685b, str)) {
                i.a(iVar.f49684a, str, iVar.f49686c);
                iVar.f49685b = str;
            }
        }
    }
}
