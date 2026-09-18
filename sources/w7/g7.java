package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class g7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.f43678b;
        eVar.getClass();
        v7.y8 y8Var = aVar.f43677a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.f43679c.f41262a.get());
        ?? obj = new Object();
        obj.f15269c = languageIdentifierImpl.f7383f;
        v7.r1 r1Var = new v7.r1(3, false);
        r1Var.d = LanguageIdentifierImpl.k();
        obj.d = new v7.g7(r1Var);
        a5.a aVar2 = new a5.a((ni.f) obj, 1);
        Task task = y8Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f15058c.a(y8Var.f44222g);
        }
        qb.m.f41281a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((ub.e) languageIdentifierImpl.d.get()).f41272b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
