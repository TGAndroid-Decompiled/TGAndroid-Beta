package pc;

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
            kVar.a(a2.v);
            return;
        }
        if (aVar.o() && kVar.f41183o != null) {
            String str2 = "</" + kVar.f41183o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = kVar.d(false);
                String str3 = kVar.f41183o;
                d.f41165c = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.d = str;
                kVar.f41177i = d;
                kVar.k();
                aVar.q();
                kVar.f41174c = a2.f41127a;
                return;
            }
        }
        kVar.g("<");
        kVar.f41174c = a2.f41131c;
    }
}
