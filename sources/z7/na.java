package z7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class na implements ka {
    public final u9.m f61808a;
    public final ja f61809b;

    public na(Context context, ja jaVar) {
        this.f61809b = jaVar;
        m5.a aVar = m5.a.f20920e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new a8.ya(c10, 6));
        }
        this.f61808a = new u9.m(new a8.ya(c10, 7));
    }

    @Override
    public final void a(s2.e eVar) {
        f fVar;
        na.d dVar;
        ja jaVar = this.f61809b;
        jaVar.getClass();
        o5.s sVar = (o5.s) this.f61808a.get();
        jaVar.getClass();
        qa qaVar = qa.f61831c;
        y7.s2 s2Var = (y7.s2) eVar.f56892b;
        ((a8.u9) eVar.f56893c).h = false;
        a8.u9 u9Var = (a8.u9) eVar.f56893c;
        u9Var.f660f = Boolean.FALSE;
        s2Var.f61063b = new m9(u9Var);
        try {
            qa.b();
            l7 l7Var = new l7(s2Var);
            y7.s2 s2Var2 = new y7.s2(3);
            qaVar.a(s2Var2);
            HashMap hashMap = new HashMap((HashMap) s2Var2.f61063b);
            HashMap hashMap2 = new HashMap((HashMap) s2Var2.f61064c);
            e eVar2 = (e) s2Var2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar2);
                dVar = (na.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(l7Var, fVar);
                sVar.a(new l5.a(null, byteArrayOutputStream.toByteArray(), l5.d.f19770b, null), new n2.a0(8));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(l7.class)));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
