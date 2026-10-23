package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class r7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        vb.a aVar = (vb.a) rb.g.c().a(vb.a.class);
        vb.e eVar = aVar.f48332b;
        eVar.getClass();
        v7.y8 y8Var = aVar.f48331a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.f48333c.f45192a.get());
        ?? obj = new Object();
        obj.f44766c = languageIdentifierImpl.f7701f;
        u2.c cVar = new u2.c(5, false);
        cVar.f47274c = LanguageIdentifierImpl.k();
        obj.d = new v7.g7(cVar);
        a5.a aVar2 = new a5.a((qi.e) obj, 1);
        Task task = y8Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = n6.i.f17198c.a(y8Var.f48247g);
        }
        rb.m.f45211a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 6));
        ((vb.e) languageIdentifierImpl.d.get()).f45202b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
