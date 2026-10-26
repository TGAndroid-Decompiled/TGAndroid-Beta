package y9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f52432a;
    public final i f52433b;

    public j(s sVar, da.c cVar) {
        this.f52432a = sVar;
        this.f52433b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f52433b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f52430b, str)) {
                return iVar.f52431c;
            }
            da.c cVar = iVar.f52429a;
            da.a aVar = i.d;
            File file = new File(cVar.f8275c, str);
            file.mkdirs();
            List e = da.c.e(file.listFiles(aVar));
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
        i iVar = this.f52433b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f52430b, str)) {
                i.a(iVar.f52429a, str, iVar.f52431c);
                iVar.f52430b = str;
            }
        }
    }
}
