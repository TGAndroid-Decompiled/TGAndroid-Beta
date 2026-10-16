package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final r9.n f47385a;
    public final ia f47386b;

    public ma(Context context, ia iaVar) {
        this.f47386b = iaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 2));
        }
        this.f47385a = new r9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(n3.b bVar) {
        f fVar;
        ja.d dVar;
        ia iaVar = this.f47386b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.f47385a.get();
        iaVar.getClass();
        pa paVar = pa.f47408c;
        u2.c cVar = (u2.c) bVar.f15703b;
        ((v7.d8) bVar.f15704c).h = false;
        v7.d8 d8Var = (v7.d8) bVar.f15704c;
        d8Var.f46609f = Boolean.FALSE;
        cVar.f45875b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(cVar);
            u2.c cVar2 = new u2.c(6);
            paVar.a(cVar2);
            HashMap hashMap = new HashMap((HashMap) cVar2.f45875b);
            HashMap hashMap2 = new HashMap((HashMap) cVar2.f45876c);
            e eVar = (e) cVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ja.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f11324b, null), new k2.y0(2));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
