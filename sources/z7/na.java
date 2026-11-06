package z7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class na implements ka {
    public final u9.m f59783a;
    public final ja f59784b;

    public na(Context context, ja jaVar) {
        this.f59784b = jaVar;
        m5.a aVar = m5.a.f19869e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new a8.xa(c10, 6));
        }
        this.f59783a = new u9.m(new a8.xa(c10, 7));
    }

    @Override
    public final void a(sg.i0 i0Var) {
        f fVar;
        na.d dVar;
        ja jaVar = this.f59784b;
        jaVar.getClass();
        o5.r rVar = (o5.r) this.f59783a.get();
        jaVar.getClass();
        qa qaVar = qa.f59806c;
        y7.d6 d6Var = (y7.d6) i0Var.f54951b;
        ((a8.s9) i0Var.f54952c).h = false;
        a8.s9 s9Var = (a8.s9) i0Var.f54952c;
        s9Var.f640f = Boolean.FALSE;
        d6Var.f58882a = new m9(s9Var);
        try {
            qa.b();
            l7 l7Var = new l7(d6Var);
            ?? obj = new Object();
            obj.f58882a = new HashMap();
            obj.f58883b = new HashMap();
            obj.f58884c = e.f59621c;
            qaVar.a(obj);
            HashMap hashMap = new HashMap((HashMap) obj.f58882a);
            HashMap hashMap2 = new HashMap((HashMap) obj.f58883b);
            e eVar = (e) obj.f58884c;
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
