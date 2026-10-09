package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class l7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f48881b;
        eVar.getClass();
        v7.z8 z8Var = aVar.f48880a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, z8Var, (Executor) aVar.f48882c.f46070a.get());
        ?? obj = new Object();
        obj.f17177c = languageIdentifierImpl.f8014f;
        v7.k kVar = new v7.k(4, false);
        kVar.f49245c = LanguageIdentifierImpl.k();
        obj.d = new v7.h7(kVar);
        a5.a aVar2 = new a5.a((oi.f) obj, 1);
        Task task = z8Var.f49424e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f16667c.a(z8Var.f49426g);
        }
        qb.m.f46089a.execute(new com.google.android.gms.internal.cast.p(z8Var, aVar2, v7.k6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f46080b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
