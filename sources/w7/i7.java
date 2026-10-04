package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class i7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f47581b;
        eVar.getClass();
        v7.y8 y8Var = aVar.f47580a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.f47582c.f44908a.get());
        ?? obj = new Object();
        obj.f45536c = languageIdentifierImpl.f7965f;
        v7.k kVar = new v7.k(4, false);
        kVar.f47987c = LanguageIdentifierImpl.k();
        obj.d = new v7.g7(kVar);
        a5.a aVar2 = new a5.a((qi.f) obj, 1);
        Task task = y8Var.f48160e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f16702c.a(y8Var.f48162g);
        }
        qb.m.f44927a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f44918b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
