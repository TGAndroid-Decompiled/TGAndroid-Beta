package x7;

import a8.ff;
import a8.og;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class na implements ka {
    public final s9.n f51592a;
    public final ja f51593b;

    public na(Context context, ja jaVar) {
        this.f51593b = jaVar;
        k5.a aVar = k5.a.e;
        m5.t.b(context);
        m5.r c10 = m5.t.a().c(aVar);
        if (k5.a.d.contains(new j5.c("json"))) {
            new s9.n(new og(c10, 4));
        }
        this.f51592a = new s9.n(new og(c10, 5));
    }

    @Override
    public final void a(m4.c cVar) {
        f fVar;
        ka.d dVar;
        ja jaVar = this.f51593b;
        jaVar.getClass();
        m5.s sVar = (m5.s) this.f51592a.get();
        jaVar.getClass();
        qa qaVar = qa.f51615c;
        s4.d dVar2 = (s4.d) cVar.f18009b;
        ((ff) cVar.f18010c).f461j = false;
        ff ffVar = (ff) cVar.f18010c;
        ffVar.h = Boolean.FALSE;
        dVar2.f47717b = new m9(ffVar);
        try {
            qa.b();
            l7 l7Var = new l7(dVar2);
            s4.d dVar3 = new s4.d(11);
            qaVar.a(dVar3);
            HashMap hashMap = new HashMap((HashMap) dVar3.f47717b);
            HashMap hashMap2 = new HashMap((HashMap) dVar3.f47718c);
            e eVar = (e) dVar3.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ka.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(l7Var, fVar);
                sVar.a(new j5.a(null, byteArrayOutputStream.toByteArray(), j5.d.f15514b, null), new m4.x0(11));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(l7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
