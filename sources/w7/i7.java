package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class i7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f47588b;
        eVar.getClass();
        v7.y8 y8Var = aVar.f47587a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.f47589c.f44915a.get());
        ?? obj = new Object();
        obj.f45543c = languageIdentifierImpl.f7965f;
        v7.k kVar = new v7.k(4, false);
        kVar.f47994c = LanguageIdentifierImpl.k();
        obj.d = new v7.g7(kVar);
        a5.a aVar2 = new a5.a((qi.f) obj, 1);
        Task task = y8Var.f48167e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f16707c.a(y8Var.f48169g);
        }
        qb.m.f44934a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f44925b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
