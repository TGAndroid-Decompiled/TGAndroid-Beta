package xc;

import java.util.Locale;
public enum m extends a2 {
    public m() {
        super("RcdataLessthanSign", 10);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String str;
        if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.f53644w);
            return;
        }
        if (aVar.o() && kVar.f53673o != null) {
            String str2 = "</" + kVar.f53673o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = kVar.d(false);
                String str3 = kVar.f53673o;
                d.f53654c = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.d = str;
                kVar.f53667i = d;
                kVar.k();
                aVar.q();
                kVar.f53664c = a2.f53616a;
                return;
            }
        }
        kVar.h("<");
        kVar.f53664c = a2.f53620c;
    }
}
