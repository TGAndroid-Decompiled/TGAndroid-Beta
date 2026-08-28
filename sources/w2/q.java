package w2;

import android.content.Context;
import com.google.firebase.messaging.t;
import j$.util.DesugarCollections;
import j3.r0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
public final class q {
    public static volatile j f48473e;
    public final f3.a f48474a;
    public final f3.a f48475b;
    public final b3.c f48476c;
    public final c3.h d;

    public q(f3.a aVar, f3.a aVar2, b3.c cVar, c3.h hVar, t tVar) {
        this.f48474a = aVar;
        this.f48475b = aVar2;
        this.f48476c = cVar;
        this.d = hVar;
        ((Executor) tVar.f4177b).execute(new af.e(tVar, 19));
    }

    public static q a() {
        j jVar = f48473e;
        if (jVar != null) {
            return (q) jVar.f48461f.mo28get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f48473e == null) {
            synchronized (q.class) {
                try {
                    if (f48473e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f14435a = context;
                        f48473e = obj.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o c(k kVar) {
        Set singleton;
        byte[] bytes;
        if (kVar != null) {
            singleton = DesugarCollections.unmodifiableSet(u2.a.d);
        } else {
            singleton = Collections.singleton(new t2.c("proto"));
        }
        t5.c a2 = i.a();
        kVar.getClass();
        a2.f47683c = "cct";
        u2.a aVar = (u2.a) kVar;
        String str = aVar.f47965a;
        String str2 = aVar.f47966b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = r0.o("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f47682b = bytes;
        return new o(singleton, a2.b(), this);
    }
}
