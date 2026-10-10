package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f50128a;
    public final ia f50129b;

    public ma(Context context, ia iaVar) {
        this.f50129b = iaVar;
        j5.a aVar = j5.a.f14022e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 2));
        }
        this.f50128a = new q9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(n6.t tVar) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f50129b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.f50128a.get();
        iaVar.getClass();
        pa paVar = pa.f50151c;
        v7.k kVar = (v7.k) tVar.f16721b;
        ((v7.e8) tVar.f16722c).h = false;
        v7.e8 e8Var = (v7.e8) tVar.f16722c;
        e8Var.f49215f = Boolean.FALSE;
        kVar.f49290b = new l9(e8Var);
        try {
            pa.b();
            k7 k7Var = new k7(kVar);
            v7.k kVar2 = new v7.k(6);
            paVar.a(kVar2);
            HashMap hashMap = new HashMap((HashMap) kVar2.f49290b);
            HashMap hashMap2 = new HashMap((HashMap) kVar2.f49291c);
            e eVar = (e) kVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f12015b, null), new j2.e(16));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}
