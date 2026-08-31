package y2;

import android.content.Context;
import com.google.firebase.messaging.s;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
public final class q {
    public static volatile j f50712e;
    public final h3.a f50713a;
    public final h3.a f50714b;
    public final d3.b f50715c;
    public final e3.g d;

    public q(h3.a aVar, h3.a aVar2, d3.b bVar, e3.g gVar, s sVar) {
        this.f50713a = aVar;
        this.f50714b = aVar2;
        this.f50715c = bVar;
        this.d = gVar;
        ((Executor) sVar.f4080a).execute(new ag.e(sVar, 22));
    }

    public static q a() {
        j jVar = f50712e;
        if (jVar != null) {
            return (q) jVar.f50700f.mo38get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f50712e == null) {
            synchronized (q.class) {
                try {
                    if (f50712e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f10247a = context;
                        f50712e = obj.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final o c(k kVar) {
        Set singleton;
        byte[] bytes;
        if (kVar != null) {
            singleton = DesugarCollections.unmodifiableSet(w2.a.d);
        } else {
            singleton = Collections.singleton(new v2.c("proto"));
        }
        s5.m a2 = i.a();
        kVar.getClass();
        a2.f47062b = "cct";
        w2.a aVar = (w2.a) kVar;
        String str = aVar.f49326a;
        String str2 = aVar.f49327b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.c.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f47063c = bytes;
        return new o(singleton, a2.f(), this);
    }
}
