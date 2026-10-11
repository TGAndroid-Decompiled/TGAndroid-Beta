package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class l7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f49004b;
        eVar.getClass();
        v7.z8 z8Var = aVar.f49003a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, z8Var, (Executor) aVar.f49005c.f46184a.get());
        ?? obj = new Object();
        obj.f45974c = languageIdentifierImpl.f8013f;
        v7.k kVar = new v7.k(4, false);
        kVar.f49368c = LanguageIdentifierImpl.k();
        obj.d = new v7.h7(kVar);
        a5.a aVar2 = new a5.a((pi.f) obj, 1);
        Task task = z8Var.f49547e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f16749c.a(z8Var.f49549g);
        }
        qb.m.f46203a.execute(new com.google.android.gms.internal.cast.p(z8Var, aVar2, v7.k6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f46194b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
