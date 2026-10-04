package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f48789a;
    public final ia f48790b;

    public ma(Context context, ia iaVar) {
        this.f48790b = iaVar;
        j5.a aVar = j5.a.f13985e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 2));
        }
        this.f48789a = new q9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(n7.z0 z0Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f48790b;
        iaVar.getClass();
        l5.s sVar = (l5.s) this.f48789a.get();
        iaVar.getClass();
        pa paVar = pa.f48815c;
        v7.k kVar = (v7.k) z0Var.f16851b;
        ((v7.d8) z0Var.f16852c).h = false;
        v7.d8 d8Var = (v7.d8) z0Var.f16852c;
        d8Var.f47904f = Boolean.FALSE;
        kVar.f47986b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(kVar);
            v7.k kVar2 = new v7.k(5);
            paVar.a(kVar2);
            HashMap hashMap = new HashMap((HashMap) kVar2.f47986b);
            HashMap hashMap2 = new HashMap((HashMap) kVar2.f47987c);
            e eVar = (e) kVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                sVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f11965b, null), new j2.e(20));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}
