package z7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class na implements ka {
    public final u9.m f59813a;
    public final ja f59814b;

    public na(Context context, ja jaVar) {
        this.f59814b = jaVar;
        m5.a aVar = m5.a.f19869e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new a8.xa(c10, 6));
        }
        this.f59813a = new u9.m(new a8.xa(c10, 7));
    }

    @Override
    public final void a(sg.i0 i0Var) {
        f fVar;
        na.d dVar;
        ja jaVar = this.f59814b;
        jaVar.getClass();
        o5.r rVar = (o5.r) this.f59813a.get();
        jaVar.getClass();
        qa qaVar = qa.f59836c;
        y7.d6 d6Var = (y7.d6) i0Var.f54975b;
        ((a8.s9) i0Var.f54976c).h = false;
        a8.s9 s9Var = (a8.s9) i0Var.f54976c;
        s9Var.f640f = Boolean.FALSE;
        d6Var.f58912a = new m9(s9Var);
        try {
            qa.b();
            l7 l7Var = new l7(d6Var);
            ?? obj = new Object();
            obj.f58912a = new HashMap();
            obj.f58913b = new HashMap();
            obj.f58914c = e.f59651c;
            qaVar.a(obj);
            HashMap hashMap = new HashMap((HashMap) obj.f58912a);
            HashMap hashMap2 = new HashMap((HashMap) obj.f58913b);
            e eVar = (e) obj.f58914c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (na.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(l7Var, fVar);
                rVar.a(new l5.a(null, byteArrayOutputStream.toByteArray(), l5.d.f18173b, null), new ni.a(3));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(l7.class)));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
