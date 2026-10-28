package vg;

import a8.me;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.jd0;
import zh.g4;
public final class d implements b2, jd0, e9.k, e2.j, Continuation, s9.d, GenericProvider {
    public final int f50192a;

    public d(int i10) {
        this.f50192a = i10;
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: vg.d.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public Object d1(me meVar) {
        Set x9 = meVar.x(za.a.class);
        za.c cVar = za.c.f52900c;
        if (cVar == null) {
            synchronized (za.c.class) {
                try {
                    cVar = za.c.f52900c;
                    if (cVar == null) {
                        cVar = new za.c(0);
                        za.c.f52900c = cVar;
                    }
                } finally {
                }
            }
        }
        return new za.b(x9, cVar);
    }

    @Override
    public String f(int i10) {
        switch (this.f50192a) {
            case 1:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f50192a) {
            case 0:
                return;
            case 3:
                e2Var.dismiss();
                return;
            case 4:
                e2Var.dismiss();
                return;
            case 17:
                e2Var.dismiss();
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = g4.f53070k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            y9.b bVar = (y9.b) task.getResult();
            v9.b bVar2 = v9.b.f50135a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f52474b);
            z10 = true;
            if (bVar.f52475c.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public d(aa.m0 m0Var) {
        this.f50192a = 13;
    }

    private final void b(e2 e2Var, int i10) {
    }
}
