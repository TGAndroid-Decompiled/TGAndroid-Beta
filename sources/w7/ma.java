package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f45062a;
    public final ia f45063b;

    public ma(Context context, ia iaVar) {
        this.f45063b = iaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 2));
        }
        this.f45062a = new q9.n(new v7.b9(c10, 3));
    }

    @Override
    public final void a(n7.z0 z0Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f45063b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.f45062a.get();
        iaVar.getClass();
        pa paVar = pa.f45087c;
        v7.l lVar = (v7.l) z0Var.f15410b;
        ((v7.e8) z0Var.f15411c).h = false;
        v7.e8 e8Var = (v7.e8) z0Var.f15411c;
        e8Var.f44238f = Boolean.FALSE;
        lVar.f44313b = new l9(e8Var);
        try {
            pa.b();
            k7 k7Var = new k7(lVar);
            v7.l lVar2 = new v7.l(5);
            paVar.a(lVar2);
            HashMap hashMap = new HashMap((HashMap) lVar2.f44313b);
            HashMap hashMap2 = new HashMap((HashMap) lVar2.f44314c);
            e eVar = (e) lVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f10984b, null), new j2.e(19));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
