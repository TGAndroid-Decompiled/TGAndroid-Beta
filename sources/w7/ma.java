package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ma implements ja {
    public final r9.n f48819a;
    public final ia f48820b;

    public ma(Context context, ia iaVar) {
        this.f48820b = iaVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 2));
        }
        this.f48819a = new r9.n(new v7.a9(c10, 3));
    }

    @Override
    public final void a(n2.e eVar) {
        f fVar;
        ja.d dVar;
        ia iaVar = this.f48820b;
        iaVar.getClass();
        l5.s sVar = (l5.s) this.f48819a.get();
        iaVar.getClass();
        pa paVar = pa.f48842c;
        t0.h hVar = (t0.h) eVar.f17042b;
        ((v7.d8) eVar.f17043c).h = false;
        v7.d8 d8Var = (v7.d8) eVar.f17043c;
        d8Var.f48041f = Boolean.FALSE;
        hVar.f46911b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(hVar);
            t0.h hVar2 = new t0.h(7);
            paVar.a(hVar2);
            HashMap hashMap = new HashMap((HashMap) hVar2.f46911b);
            HashMap hashMap2 = new HashMap((HashMap) hVar2.f46912c);
            e eVar2 = (e) hVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar2);
                dVar = (ja.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                sVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f12711b, null), new k2.f0(4));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
