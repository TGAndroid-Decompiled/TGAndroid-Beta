package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class h7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f43936b;
        eVar.getClass();
        v7.z8 z8Var = aVar.f43935a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, z8Var, (Executor) aVar.f43937c.f41525a.get());
        ?? obj = new Object();
        obj.f15761c = languageIdentifierImpl.f7365f;
        v7.l lVar = new v7.l(4, false);
        lVar.f44315c = LanguageIdentifierImpl.k();
        obj.d = new v7.h7(lVar);
        a5.a aVar2 = new a5.a((oi.f) obj, 1);
        Task task = z8Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f15276c.a(z8Var.f44484g);
        }
        qb.m.f41544a.execute(new com.google.android.gms.internal.cast.p(z8Var, aVar2, v7.k6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f41535b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
