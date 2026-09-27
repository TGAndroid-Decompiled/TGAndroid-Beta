package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f45107a;
    public final ia f45108b;

    public ma(Context context, ia iaVar) {
        this.f45108b = iaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 2));
        }
        this.f45107a = new q9.n(new v7.b9(c10, 3));
    }

    @Override
    public final void a(n7.z0 z0Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f45108b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.f45107a.get();
        iaVar.getClass();
        pa paVar = pa.f45132c;
        v7.k kVar = (v7.k) z0Var.f15445b;
        ((v7.e8) z0Var.f15446c).h = false;
        v7.e8 e8Var = (v7.e8) z0Var.f15446c;
        e8Var.f44284f = Boolean.FALSE;
        kVar.f44349b = new l9(e8Var);
        try {
            pa.b();
            k7 k7Var = new k7(kVar);
            v7.k kVar2 = new v7.k(5);
            paVar.a(kVar2);
            HashMap hashMap = new HashMap((HashMap) kVar2.f44349b);
            HashMap hashMap2 = new HashMap((HashMap) kVar2.f44350c);
            e eVar = (e) kVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f10987b, null), new j2.e(20));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
