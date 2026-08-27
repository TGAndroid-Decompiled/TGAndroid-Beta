package w2;

import android.content.Context;
import com.google.firebase.messaging.t;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class q {

    public static volatile j f48976e;

    public final f3.a f48977a;

    public final f3.a f48978b;

    public final b3.b f48979c;
    public final c3.g d;

    public q(f3.a aVar, f3.a aVar2, b3.b bVar, c3.g gVar, t tVar) {
        this.f48977a = aVar;
        this.f48978b = aVar2;
        this.f48979c = bVar;
        this.d = gVar;
        ((Executor) tVar.f4619b).execute(new af.e(tVar, 19));
    }

    public static q a() {
        j jVar = f48976e;
        if (jVar != null) {
            return (q) jVar.f48964f.mo28get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f48976e == null) {
            synchronized (q.class) {
                try {
                    if (f48976e == null) {
                        v0.j jVar = new v0.j();
                        context.getClass();
                        jVar.f48662a = context;
                        f48976e = jVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o c(k kVar) {
        byte[] bytes;
        Set setUnmodifiableSet = kVar != null ? DesugarCollections.unmodifiableSet(u2.a.d) : Collections.singleton(new t2.c("proto"));
        u2.b bVarA = i.a();
        kVar.getClass();
        bVarA.f48262b = "cct";
        u2.a aVar = (u2.a) kVar;
        String str = aVar.f48259a;
        String str2 = aVar.f48260b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = i0.a.n("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        bVarA.f48263c = bytes;
        return new o(setUnmodifiableSet, bVarA.d(), this);
    }
}
