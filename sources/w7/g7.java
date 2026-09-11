package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class g7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f46982b;
        eVar.getClass();
        v7.y8 y8Var = aVar.f46981a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.f46983c.f44274a.get());
        ?? obj = new Object();
        obj.f9494c = languageIdentifierImpl.f6435f;
        v7.a6 a6Var = new v7.a6(1, false);
        a6Var.f47379c = LanguageIdentifierImpl.k();
        obj.d = new v7.g7(a6Var);
        a5.a aVar2 = new a5.a((fg.f) obj, 1);
        Task task = y8Var.f47671e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f16554c.a(y8Var.f47673g);
        }
        qb.m.f44293a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f44284b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
