package y7;

import android.content.Context;
import b8.df;
import b8.lg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class na implements ka {
    public final t9.n f59231a;
    public final ja f59232b;

    public na(Context context, ja jaVar) {
        this.f59232b = jaVar;
        l5.a aVar = l5.a.f18036e;
        n5.s.b(context);
        n5.q c2 = n5.s.a().c(aVar);
        if (l5.a.d.contains(new k5.c("json"))) {
            new t9.n(new lg(c2, 4));
        }
        this.f59231a = new t9.n(new lg(c2, 5));
    }

    @Override
    public final void a(w9.b bVar) {
        f fVar;
        ma.d dVar;
        ja jaVar = this.f59232b;
        jaVar.getClass();
        n5.r rVar = (n5.r) this.f59231a.get();
        jaVar.getClass();
        qa qaVar = qa.f59254c;
        p7.d dVar2 = (p7.d) bVar.f57424b;
        ((df) bVar.f57425c).h = false;
        df dfVar = (df) bVar.f57425c;
        dfVar.f2547f = Boolean.FALSE;
        dVar2.f53345b = new m9(dfVar);
        try {
            qa.b();
            l7 l7Var = new l7(dVar2);
            p7.d dVar3 = new p7.d(25);
            qaVar.a(dVar3);
            HashMap hashMap = new HashMap((HashMap) dVar3.f53345b);
            HashMap hashMap2 = new HashMap((HashMap) dVar3.d);
            e eVar = (e) dVar3.f53346c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ma.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(l7Var, fVar);
                rVar.a(new k5.a(null, byteArrayOutputStream.toByteArray(), k5.d.f16878b, null), new l2.d(27));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(l7.class)));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
