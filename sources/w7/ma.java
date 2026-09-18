package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f44807a;
    public final ia f44808b;

    public ma(Context context, ia iaVar) {
        this.f44808b = iaVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 2));
        }
        this.f44807a = new q9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(n7.a1 a1Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f44808b;
        iaVar.getClass();
        l5.s sVar = (l5.s) this.f44807a.get();
        iaVar.getClass();
        pa paVar = pa.f44835c;
        v7.r1 r1Var = (v7.r1) a1Var.f15118b;
        ((v7.d8) a1Var.f15119c).h = false;
        v7.d8 d8Var = (v7.d8) a1Var.f15119c;
        d8Var.f43976f = Boolean.FALSE;
        r1Var.f44106b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(r1Var);
            v7.r1 r1Var2 = new v7.r1(4);
            paVar.a(r1Var2);
            HashMap hashMap = new HashMap((HashMap) r1Var2.f44106b);
            HashMap hashMap2 = new HashMap((HashMap) r1Var2.d);
            e eVar = (e) r1Var2.f44107c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                sVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f10997b, null), new j2.e(18));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
