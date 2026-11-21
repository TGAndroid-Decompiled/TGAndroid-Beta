package z7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class na implements ka {
    public final u9.m f61720a;
    public final ja f61721b;

    public na(Context context, ja jaVar) {
        this.f61721b = jaVar;
        m5.a aVar = m5.a.f20855e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new a8.ya(c10, 6));
        }
        this.f61720a = new u9.m(new a8.ya(c10, 7));
    }

    @Override
    public final void a(sg.h0 h0Var) {
        f fVar;
        na.d dVar;
        ja jaVar = this.f61721b;
        jaVar.getClass();
        o5.r rVar = (o5.r) this.f61720a.get();
        jaVar.getClass();
        qa qaVar = qa.f61743c;
        y7.f7 f7Var = (y7.f7) h0Var.f57257b;
        ((a8.u9) h0Var.f57258c).h = false;
        a8.u9 u9Var = (a8.u9) h0Var.f57258c;
        u9Var.f661f = Boolean.FALSE;
        f7Var.f60852a = new m9(u9Var);
        try {
            qa.b();
            l7 l7Var = new l7(f7Var);
            y7.f7 f7Var2 = new y7.f7(1);
            qaVar.a(f7Var2);
            HashMap hashMap = new HashMap((HashMap) f7Var2.f60852a);
            HashMap hashMap2 = new HashMap((HashMap) f7Var2.f60853b);
            e eVar = (e) f7Var2.f60854c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (na.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(l7Var, fVar);
                rVar.a(new l5.a(null, byteArrayOutputStream.toByteArray(), l5.d.f19701b, null), new n2.a0(8));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(l7.class)));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
