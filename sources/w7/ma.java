package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f43738a;
    public final ia f43739b;

    public ma(Context context, ia iaVar) {
        this.f43739b = iaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 2));
        }
        this.f43738a = new q9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(n7.a1 a1Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f43739b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.f43738a.get();
        iaVar.getClass();
        pa paVar = pa.f43767c;
        v7.a6 a6Var = (v7.a6) a1Var.f13938b;
        ((v7.d8) a1Var.f13939c).h = false;
        v7.d8 d8Var = (v7.d8) a1Var.f13939c;
        d8Var.f42970f = Boolean.FALSE;
        a6Var.f42934b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(a6Var);
            v7.a6 a6Var2 = new v7.a6(2);
            paVar.a(a6Var2);
            HashMap hashMap = new HashMap((HashMap) a6Var2.f42934b);
            HashMap hashMap2 = new HashMap((HashMap) a6Var2.f42935c);
            e eVar = (e) a6Var2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f10478b, null), new j2.h(10));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
