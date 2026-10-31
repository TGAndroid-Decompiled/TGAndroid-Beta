package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class ka implements ha {
    public final r9.n f52619a;
    public final ga f52620b;

    public ka(Context context, ga gaVar) {
        this.f52620b = gaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.z8(c10, 2));
        }
        this.f52619a = new r9.n(new v7.z8(c10, 3));
    }

    @Override
    public final void a(m5.e eVar) {
        f fVar;
        ja.d dVar;
        ga gaVar = this.f52620b;
        gaVar.getClass();
        l5.r rVar = (l5.r) this.f52619a.get();
        gaVar.getClass();
        na naVar = na.f52659c;
        q5.d dVar2 = (q5.d) eVar.f13013b;
        ((v7.a8) eVar.f13014c).h = false;
        v7.a8 a8Var = (v7.a8) eVar.f13014c;
        a8Var.f50387f = Boolean.FALSE;
        dVar2.f45487b = new j9(a8Var);
        try {
            na.b();
            j7 j7Var = new j7(dVar2);
            q5.d dVar3 = new q5.d(16);
            naVar.a(dVar3);
            HashMap hashMap = new HashMap((HashMap) dVar3.f45487b);
            HashMap hashMap2 = new HashMap((HashMap) dVar3.f45488c);
            e eVar2 = (e) dVar3.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar2);
                dVar = (ja.d) hashMap.get(j7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(j7Var, fVar);
                rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.f8207b, null), new k2.k0(5));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(j7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
