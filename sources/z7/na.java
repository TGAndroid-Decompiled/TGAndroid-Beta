package z7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class na implements ka {
    public final u9.n f59907a;
    public final ja f59908b;

    public na(Context context, ja jaVar) {
        this.f59908b = jaVar;
        m5.a aVar = m5.a.f19872e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.n(new a8.xa(c10, 6));
        }
        this.f59907a = new u9.n(new a8.xa(c10, 7));
    }

    @Override
    public final void a(sg.i0 i0Var) {
        f fVar;
        na.d dVar;
        ja jaVar = this.f59908b;
        jaVar.getClass();
        o5.r rVar = (o5.r) this.f59907a.get();
        jaVar.getClass();
        qa qaVar = qa.f59930c;
        y7.d6 d6Var = (y7.d6) i0Var.f55068b;
        ((a8.s9) i0Var.f55069c).h = false;
        a8.s9 s9Var = (a8.s9) i0Var.f55069c;
        s9Var.f640f = Boolean.FALSE;
        d6Var.f59002a = new m9(s9Var);
        try {
            qa.b();
            l7 l7Var = new l7(d6Var);
            ?? obj = new Object();
            obj.f59002a = new HashMap();
            obj.f59003b = new HashMap();
            obj.f59004c = e.f59745c;
            qaVar.a(obj);
            HashMap hashMap = new HashMap((HashMap) obj.f59002a);
            HashMap hashMap2 = new HashMap((HashMap) obj.f59003b);
            e eVar = (e) obj.f59004c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (na.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(l7Var, fVar);
                rVar.a(new l5.a(null, byteArrayOutputStream.toByteArray(), l5.d.f18176b, null), new ni.a(3));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(l7.class)));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
