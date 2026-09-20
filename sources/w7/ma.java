package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final q9.n f45078a;
    public final ia f45079b;

    public ma(Context context, ia iaVar) {
        this.f45079b = iaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 2));
        }
        this.f45078a = new q9.n(new v7.b9(c10, 3));
    }

    @Override
    public final void a(org.telegram.ui.Cells.f3 f3Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.f45079b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.f45078a.get();
        iaVar.getClass();
        pa paVar = pa.f45104c;
        v7.s1 s1Var = (v7.s1) f3Var.f20269b;
        ((v7.e8) f3Var.f20270c).h = false;
        v7.e8 e8Var = (v7.e8) f3Var.f20270c;
        e8Var.f44254f = Boolean.FALSE;
        s1Var.f44383b = new l9(e8Var);
        try {
            pa.b();
            k7 k7Var = new k7(s1Var);
            v7.s1 s1Var2 = new v7.s1(4);
            paVar.a(s1Var2);
            HashMap hashMap = new HashMap((HashMap) s1Var2.f44383b);
            HashMap hashMap2 = new HashMap((HashMap) s1Var2.d);
            e eVar = (e) s1Var2.f44384c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f10998b, null), new j2.e(22));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
