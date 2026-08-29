package y2;

import android.content.Context;
import cg.m2;
import com.google.firebase.messaging.s;
import j$.util.DesugarCollections;
import j7.l1;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
public final class q {
    public static volatile j f50206e;
    public final h3.a f50207a;
    public final h3.a f50208b;
    public final d3.b f50209c;
    public final e3.f d;

    public q(h3.a aVar, h3.a aVar2, d3.b bVar, e3.f fVar, s sVar) {
        this.f50207a = aVar;
        this.f50208b = aVar2;
        this.f50209c = bVar;
        this.d = fVar;
        ((Executor) sVar.f5185b).execute(new m2(sVar, 6));
    }

    public static q a() {
        j jVar = f50206e;
        if (jVar != null) {
            return (q) jVar.f50194f.mo18get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f50206e == null) {
            synchronized (q.class) {
                try {
                    if (f50206e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f13245a = context;
                        f50206e = obj.b();
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
        v5.c a2 = i.a();
        kVar.getClass();
        a2.f49410c = "cct";
        w2.a aVar = (w2.a) kVar;
        String str = aVar.f49624a;
        String str2 = aVar.f49625b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = l1.n("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f49409b = bytes;
        return new o(singleton, a2.d(), this);
    }
}
