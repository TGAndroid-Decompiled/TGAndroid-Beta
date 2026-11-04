package qb;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import mb.i;
import p6.m;
public final class e extends i {
    public ThickLanguageIdentifier d;
    public final Context f53833e;
    public final pb.a f53834f;
    public final boolean f53835g;

    public e(Context context, pb.a aVar) {
        this.f53833e = context;
        this.f53834f = aVar;
        aVar.getClass();
        this.f53835g = true;
    }

    @Override
    public final void b() {
        m.j(Thread.currentThread().equals(((AtomicReference) this.f19235a.d).get()));
        if (this.d == null) {
            this.f53834f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.f53833e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        m.j(Thread.currentThread().equals(((AtomicReference) this.f19235a.d).get()));
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
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    Object obj = a10.get(i3);
                    i3++;
                    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                    if (!"unknown".equals(identifiedLanguage.f7956a)) {
                        str2 = identifiedLanguage.f7956a;
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
