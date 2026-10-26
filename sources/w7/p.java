package w7;

import a8.fg;
import a8.ng;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class p {
    public static LanguageIdentifierImpl a() {
        String a2;
        wb.a aVar = (wb.a) sb.g.c().a(wb.a.class);
        wb.e eVar = aVar.f51147b;
        eVar.getClass();
        d9 d9Var = aVar.f51146a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, d9Var, (Executor) aVar.f51148c.f48045a.get());
        ti.e eVar2 = new ti.e(13, false);
        eVar2.d = languageIdentifierImpl.f7805f;
        s4.d dVar = new s4.d(10, false);
        dVar.f47721c = LanguageIdentifierImpl.k();
        eVar2.e = new k7(dVar);
        ng ngVar = new ng(eVar2, 1);
        Task task = d9Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = o6.i.f19141c.a(d9Var.f50841g);
        }
        sb.m.f48064a.execute(new fg(d9Var, ngVar, m6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, 7));
        ((wb.e) languageIdentifierImpl.d.get()).f48055b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
