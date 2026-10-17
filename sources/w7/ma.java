package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final r9.n f48794a;
    public final ia f48795b;

    public ma(Context context, ia iaVar) {
        this.f48795b = iaVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 2));
        }
        this.f48794a = new r9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(n2.e eVar) {
        f fVar;
        ja.d dVar;
        ia iaVar = this.f48795b;
        iaVar.getClass();
        l5.s sVar = (l5.s) this.f48794a.get();
        iaVar.getClass();
        pa paVar = pa.f48817c;
        u2.c cVar = (u2.c) eVar.f17035b;
        ((v7.d8) eVar.f17036c).h = false;
        v7.d8 d8Var = (v7.d8) eVar.f17036c;
        d8Var.f48016f = Boolean.FALSE;
        cVar.f47282b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(cVar);
            u2.c cVar2 = new u2.c(6);
            paVar.a(cVar2);
            HashMap hashMap = new HashMap((HashMap) cVar2.f47282b);
            HashMap hashMap2 = new HashMap((HashMap) cVar2.f47283c);
            e eVar2 = (e) cVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar2);
                dVar = (ja.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                sVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f12713b, null), new k2.f0(4));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
