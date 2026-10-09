package ub;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import n6.l;
import qb.i;
public final class e extends i {
    public ThickLanguageIdentifier d;
    public final Context f48890e;
    public final tb.a f48891f;
    public final boolean f48892g;

    public e(Context context, tb.a aVar) {
        this.f48890e = context;
        this.f48891f = aVar;
        aVar.getClass();
        this.f48892g = true;
    }

    @Override
    public final void b() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.f46079a.d).get()));
        if (this.d == null) {
            this.f48891f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.f48890e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.f46079a.d).get()));
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
                    if (!"unknown".equals(identifiedLanguage.f8005a)) {
                        str2 = identifiedLanguage.f8005a;
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
