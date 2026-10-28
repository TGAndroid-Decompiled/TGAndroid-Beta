package y9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final s f52490a;
    public final i f52491b;

    public j(s sVar, da.c cVar) {
        this.f52490a = sVar;
        this.f52491b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f52491b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f52488b, str)) {
                return iVar.f52489c;
            }
            da.c cVar = iVar.f52487a;
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
        i iVar = this.f52491b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f52488b, str)) {
                i.a(iVar.f52487a, str, iVar.f52489c);
                iVar.f52488b = str;
            }
        }
    }
}
