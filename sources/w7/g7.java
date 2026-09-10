package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class g7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f42621b;
        eVar.getClass();
        v7.y8 y8Var = aVar.f42620a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.f42622c.f40612a.get());
        ?? obj = new Object();
        obj.f12540c = languageIdentifierImpl.f6156f;
        v7.a6 a6Var = new v7.a6(1, false);
        a6Var.f42935c = LanguageIdentifierImpl.k();
        obj.d = new v7.g7(a6Var);
        a5.a aVar2 = new a5.a((ki.f) obj, 1);
        Task task = y8Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f13878c.a(y8Var.f43213g);
        }
        qb.m.f40631a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f40622b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
