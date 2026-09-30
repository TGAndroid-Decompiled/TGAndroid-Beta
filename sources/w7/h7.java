package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class h7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f44043b;
        eVar.getClass();
        v7.z8 z8Var = aVar.f44042a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, z8Var, (Executor) aVar.f44044c.f41623a.get());
        ?? obj = new Object();
        obj.f15778c = languageIdentifierImpl.f7377f;
        v7.l lVar = new v7.l(4, false);
        lVar.f44422c = LanguageIdentifierImpl.k();
        obj.d = new v7.h7(lVar);
        a5.a aVar2 = new a5.a((oi.f) obj, 1);
        Task task = z8Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f15292c.a(z8Var.f44591g);
        }
        qb.m.f41642a.execute(new com.google.android.gms.internal.cast.p(z8Var, aVar2, v7.k6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f41633b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
