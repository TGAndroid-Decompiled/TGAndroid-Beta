package wb;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o6.l;
import sb.i;
public final class e extends i {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final vb.a f51156f;
    public final boolean f51157g;

    public e(Context context, vb.a aVar) {
        this.e = context;
        this.f51156f = aVar;
        aVar.getClass();
        this.f51157g = true;
    }

    @Override
    public final void b() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.f48054a.d).get()));
        if (this.d == null) {
            this.f51156f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.f48054a.d).get()));
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
            l.h(thickLanguageIdentifier);
            ArrayList a2 = thickLanguageIdentifier.a(str);
            int size = a2.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = a2.get(i10);
                    i10++;
                    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                    if (!"unknown".equals(identifiedLanguage.f7797a)) {
                        str2 = identifiedLanguage.f7797a;
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
