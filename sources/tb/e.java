package tb;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import pb.i;
import q6.m;
public final class e extends i {
    public ThickLanguageIdentifier d;
    public final Context f57689e;
    public final sb.a f57690f;
    public final boolean f57691g;

    public e(Context context, sb.a aVar) {
        this.f57689e = context;
        this.f57690f = aVar;
        aVar.getClass();
        this.f57691g = true;
    }

    @Override
    public final void b() {
        m.k(Thread.currentThread().equals(((AtomicReference) this.f55568a.d).get()));
        if (this.d == null) {
            this.f57690f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.f57689e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        m.k(Thread.currentThread().equals(((AtomicReference) this.f55568a.d).get()));
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        if (thickLanguageIdentifier != null) {
            thickLanguageIdentifier.c();
            this.d = null;
        }
    }

    public final String e(String str) {
        String str2;
        if (this.d == null) {
            b();
        }
        if (!str.isEmpty()) {
            ThickLanguageIdentifier thickLanguageIdentifier = this.d;
            m.h(thickLanguageIdentifier);
            ArrayList a10 = thickLanguageIdentifier.a(str);
            int size = a10.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = a10.get(i7);
                    i7++;
                    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                    if (!"unknown".equals(identifiedLanguage.f7600a)) {
                        str2 = identifiedLanguage.f7600a;
                        break;
                    }
                } else {
                    str2 = "";
                    break;
                }
            }
            if (str2.isEmpty()) {
                return "und";
            }
            if ("iw".equals(str2)) {
                return "he";
            }
            return str2;
        }
        return "und";
    }
}
