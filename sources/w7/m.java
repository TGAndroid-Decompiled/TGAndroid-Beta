package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class m {
    public static LanguageIdentifierImpl a() {
        String a2;
        nb.a aVar = (nb.a) jb.g.c().a(nb.a.class);
        nb.e eVar = aVar.f13737b;
        eVar.getClass();
        v7.x8 x8Var = aVar.f13736a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, x8Var, (Executor) aVar.f13738c.f9779a.get());
        ?? obj = new Object();
        obj.f53574c = languageIdentifierImpl.f5611f;
        q5.d dVar = new q5.d(13, false);
        dVar.f45499c = LanguageIdentifierImpl.k();
        obj.d = new v7.d7(dVar);
        a5.a aVar2 = new a5.a((xa.n) obj, 1);
        Task task = x8Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f13600c.a(x8Var.f50657g);
        }
        jb.m.f9798a.execute(new com.google.android.gms.internal.cast.o(x8Var, aVar2, v7.g6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((nb.e) languageIdentifierImpl.d.get()).f9789b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
