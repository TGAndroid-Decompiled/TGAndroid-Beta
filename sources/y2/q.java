package y2;

import android.content.Context;
import com.google.firebase.messaging.r;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
public final class q {
    public static volatile j e;
    public final h3.a f47125a;
    public final h3.a f47126b;
    public final d3.b f47127c;
    public final e3.g d;

    public q(h3.a aVar, h3.a aVar2, d3.b bVar, e3.g gVar, r rVar) {
        this.f47125a = aVar;
        this.f47126b = aVar2;
        this.f47127c = bVar;
        this.d = gVar;
        ((Executor) rVar.f4004a).execute(new e3.h(rVar, 0));
    }

    public static q a() {
        j jVar = e;
        if (jVar != null) {
            return (q) jVar.f47114f.mo28get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (q.class) {
                try {
                    if (e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f498a = context;
                        e = obj.b();
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
        a2.f44153b = "cct";
        w2.a aVar = (w2.a) kVar;
        String str = aVar.f46442a;
        String str2 = aVar.f46443b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.c.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f44154c = bytes;
        return new o(singleton, a2.f(), this);
    }
}
