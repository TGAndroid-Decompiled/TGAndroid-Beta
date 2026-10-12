package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f50319a;
    public final ia f50320b;

    public ma(Context context, ia iaVar) {
        this.f50320b = iaVar;
        j5.a aVar = j5.a.f14019e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 2));
        }
        this.f50319a = new q9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(n6.k kVar) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f50320b;
        iaVar.getClass();
        l5.s sVar = (l5.s) this.f50319a.get();
        iaVar.getClass();
        pa paVar = pa.f50342c;
        v7.k kVar2 = (v7.k) kVar.f16433b;
        ((v7.e8) kVar.f16434c).h = false;
        v7.e8 e8Var = (v7.e8) kVar.f16434c;
        e8Var.f49407f = Boolean.FALSE;
        kVar2.f49482b = new l9(e8Var);
        try {
            pa.b();
            k7 k7Var = new k7(kVar2);
            v7.k kVar3 = new v7.k(6);
            paVar.a(kVar3);
            HashMap hashMap = new HashMap((HashMap) kVar3.f49482b);
            HashMap hashMap2 = new HashMap((HashMap) kVar3.f49483c);
            e eVar = (e) kVar3.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                sVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f12013b, null), new j2.e(16));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}
