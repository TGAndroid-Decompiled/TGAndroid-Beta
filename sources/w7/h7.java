package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class h7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f43973b;
        eVar.getClass();
        v7.z8 z8Var = aVar.f43972a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, z8Var, (Executor) aVar.f43974c.f41559a.get());
        ?? obj = new Object();
        obj.f15765c = languageIdentifierImpl.f7381f;
        v7.s1 s1Var = new v7.s1(3, false);
        s1Var.d = LanguageIdentifierImpl.k();
        obj.d = new v7.h7(s1Var);
        a5.a aVar2 = new a5.a((oi.f) obj, 1);
        Task task = z8Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f15284c.a(z8Var.f44521g);
        }
        qb.m.f41578a.execute(new com.google.android.gms.internal.cast.p(z8Var, aVar2, v7.k6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f41569b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
