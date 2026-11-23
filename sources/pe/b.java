package pe;

import a4.k;
import ca.i;
import h2.o0;
import kotlin.jvm.internal.j;
import org.telegram.ui.ActionBar.i5;
import qe.f;
import qe.h;
import w7.s;
public final class b {
    public static final b d = new b();
    public final o0 f55695a = new o0();
    public final s f55696b = re.a.f56694a;
    public final i5 f55697c = new i5(17);

    public final Object a(ke.a deserializer, String str) {
        byte b10;
        j.e(deserializer, "deserializer");
        this.f55695a.getClass();
        k kVar = new k(str);
        Object l10 = new h2.c(this, qe.j.f56248c, kVar, deserializer.d()).l(deserializer);
        String str2 = (String) kVar.f194f;
        int i7 = kVar.f191b;
        while (true) {
            b10 = 10;
            if (i7 != -1 && i7 < str2.length()) {
                int i10 = i7 + 1;
                char charAt = str2.charAt(i7);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    kVar.f191b = i10;
                    b10 = f.b(charAt);
                    break;
                }
                i7 = i10;
            } else {
                break;
            }
        }
        kVar.f191b = str2.length();
        if (b10 == 10) {
            return l10;
        }
        k.n(kVar, "Expected EOF after parsing, but had " + str.charAt(kVar.f191b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(ke.a serializer, Object obj) {
        char[] cArr;
        Object removeLast;
        j.e(serializer, "serializer");
        mc.a aVar = new mc.a(1);
        qe.b bVar = qe.b.f56233c;
        synchronized (bVar) {
            hd.d dVar = (hd.d) bVar.f2124b;
            cArr = null;
            if (dVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = dVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                bVar.f2123a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.f21055b = cArr;
        try {
            this.f55695a.getClass();
            new h(new i(aVar, 8), this, qe.j.f56248c, new h[qe.j.f56251n.f()]).i(serializer, obj);
            return aVar.toString();
        } finally {
            aVar.b();
        }
    }
}
