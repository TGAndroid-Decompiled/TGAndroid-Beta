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
            kVar.a(a2.f53626w);
            return;
        }
        if (aVar.o() && kVar.f53655o != null) {
            String str2 = "</" + kVar.f53655o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = kVar.d(false);
                String str3 = kVar.f53655o;
                d.f53636c = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.d = str;
                kVar.f53649i = d;
                kVar.k();
                aVar.q();
                kVar.f53646c = a2.f53598a;
                return;
            }
        }
        kVar.h("<");
        kVar.f53646c = a2.f53602c;
    }
}
