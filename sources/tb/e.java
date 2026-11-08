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
    public final Context f55480e;
    public final sb.a f55481f;
    public final boolean f55482g;

    public e(Context context, sb.a aVar) {
        this.f55480e = context;
        this.f55481f = aVar;
        aVar.getClass();
        this.f55482g = true;
    }

    @Override
    public final void b() {
        m.j(Thread.currentThread().equals(((AtomicReference) this.f53535a.d).get()));
        if (this.d == null) {
            this.f55481f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.f55480e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        m.j(Thread.currentThread().equals(((AtomicReference) this.f53535a.d).get()));
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
            m.g(thickLanguageIdentifier);
            ArrayList a10 = thickLanguageIdentifier.a(str);
            int size = a10.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = a10.get(i7);
                    i7++;
                    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                    if (!"unknown".equals(identifiedLanguage.f7901a)) {
                        str2 = identifiedLanguage.f7901a;
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
