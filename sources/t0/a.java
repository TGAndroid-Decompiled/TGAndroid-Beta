package t0;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import b2.q1;
import c3.o;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d9.k;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.qd0;
import u2.a1;
import u2.e0;
import u2.r1;
import w3.r;
import yh.f4;
public final class a implements qa.a, r9.d, k, e2.j, z1, qd0, q3.g, Continuation, GenericProvider {
    public final int f45497a;

    public a(int i10) {
        this.f45497a = i10;
    }

    private final java.lang.Object a(com.google.android.gms.internal.cast.z5 r45) {
        throw new UnsupportedOperationException("Method not decompiled: t0.a.a(com.google.android.gms.internal.cast.z5):java.lang.Object");
    }

    @Override
    public void accept(Object obj) {
        switch (this.f45497a) {
            case 5:
                ((a1) obj).f45865b.release();
                return;
            default:
                ((ExecutorService) obj).shutdown();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f45497a) {
            case 3:
                return ((o) obj).b().getClass().getSimpleName();
            case 4:
                return n0.u(s.x(((e0) obj).r().f46034b, new a(6)));
            case 6:
                return Integer.valueOf(((q1) obj).f2293c);
            case 19:
                return Long.valueOf(((z3.b) obj).f49253b);
            case 20:
                return Long.valueOf(((z3.b) obj).f49254c);
            case 21:
                return (r) obj;
            default:
                r1 r1Var = (r1) obj;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                String str = r1.e;
                x1 x1Var = r1Var.f46034b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x1Var.d);
                l0 listIterator = x1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((q1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
        }
    }

    @Override
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77 && i12 == 76 && i13 == 76) {
                if (i14 == 84 || i10 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public String e(int i10) {
        switch (this.f45497a) {
            case 9:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void f(qa.b bVar) {
        switch (this.f45497a) {
            case 1:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f45497a) {
            case 8:
                return;
            case 11:
                a2Var.dismiss();
                return;
            case 12:
                a2Var.dismiss();
                return;
            case 27:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f45497a) {
            case 2:
                return a(z5Var);
            default:
                Set v = z5Var.v(ya.a.class);
                ya.c cVar = ya.c.f48730c;
                if (cVar == null) {
                    synchronized (ya.c.class) {
                        try {
                            cVar = ya.c.f48730c;
                            if (cVar == null) {
                                cVar = new ya.c(0);
                                ya.c.f48730c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new ya.b(v, cVar);
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = f4.f48862k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            x9.b bVar = (x9.b) task.getResult();
            u9.b bVar2 = u9.b.f46235a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f48279b);
            z10 = true;
            if (bVar.f48280c.delete()) {
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

    public a(Object obj, int i10) {
        this.f45497a = i10;
    }

    private final void c(a2 a2Var, int i10) {
    }
}
