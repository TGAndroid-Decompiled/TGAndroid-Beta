package z9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class i {
    public final s f60184a;
    public final h f60185b;

    public i(s sVar, fa.f fVar) {
        this.f60184a = sVar;
        this.f60185b = new h(fVar);
    }

    public final String a(String str) {
        String substring;
        h hVar = this.f60185b;
        synchronized (hVar) {
            if (Objects.equals(hVar.f60182b, str)) {
                return hVar.f60183c;
            }
            fa.f fVar = hVar.f60181a;
            fa.a aVar = h.d;
            File file = new File((File) fVar.f11541e, str);
            file.mkdirs();
            List i3 = fa.f.i(file.listFiles(aVar));
            if (i3.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(i3, h.f60180e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        h hVar = this.f60185b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f60182b, str)) {
                h.a(hVar.f60181a, str, hVar.f60183c);
                hVar.f60182b = str;
            }
        }
    }
}
