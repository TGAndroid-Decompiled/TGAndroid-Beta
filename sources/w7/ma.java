package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f48234a;
    public final ia f48235b;

    public ma(Context context, ia iaVar) {
        this.f48235b = iaVar;
        j5.a aVar = j5.a.f13508e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 2));
        }
        this.f48234a = new q9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(o0.a aVar) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f48235b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.f48234a.get();
        iaVar.getClass();
        pa paVar = pa.f48262c;
        v7.a6 a6Var = (v7.a6) aVar.f16769b;
        ((v7.c8) aVar.f16770c).h = false;
        v7.c8 c8Var = (v7.c8) aVar.f16770c;
        c8Var.f47410f = Boolean.FALSE;
        a6Var.f47378b = new l9(c8Var);
        try {
            pa.b();
            k7 k7Var = new k7(a6Var);
            v7.a6 a6Var2 = new v7.a6(2);
            paVar.a(a6Var2);
            HashMap hashMap = new HashMap((HashMap) a6Var2.f47378b);
            HashMap hashMap2 = new HashMap((HashMap) a6Var2.f47379c);
            e eVar = (e) a6Var2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f11860b, null), new j2.e(17));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}
