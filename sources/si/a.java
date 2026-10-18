package si;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import b2.p1;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.kd0;
import u2.q1;
import u2.z0;
public final class a implements qa.a, r9.d, d9.k, e2.j, a2, kd0, q3.g, Continuation {
    public final int f46592a;

    public a(int i10) {
        this.f46592a = i10;
    }

    private final java.lang.Object a(com.google.android.gms.internal.cast.z5 r45) {
        throw new UnsupportedOperationException("Method not decompiled: si.a.a(com.google.android.gms.internal.cast.z5):java.lang.Object");
    }

    @Override
    public void accept(Object obj) {
        switch (this.f46592a) {
            case 8:
                ((z0) obj).f47541b.release();
                return;
            default:
                ((ExecutorService) obj).shutdown();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f46592a) {
            case 6:
                return ((c3.o) obj).b().getClass().getSimpleName();
            case 7:
                return e9.n0.u(e9.s.x(((u2.d0) obj).r().f47461b, new a(9)));
            case 9:
                return Integer.valueOf(((p1) obj).f3906c);
            case 22:
                return Long.valueOf(((z3.a) obj).f50682b);
            case 23:
                return Long.valueOf(((z3.a) obj).f50683c);
            case 24:
                return (w3.q) obj;
            default:
                q1 q1Var = (q1) obj;
                q1Var.getClass();
                Bundle bundle = new Bundle();
                String str = q1.e;
                x1 x1Var = q1Var.f47461b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x1Var.d);
                e9.l0 listIterator = x1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((p1) listIterator.next()).c());
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
        switch (this.f46592a) {
            case 12:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f46592a) {
            case 11:
                return;
            case 14:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        switch (this.f46592a) {
            case 4:
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
    public Object j2(z5 z5Var) {
        switch (this.f46592a) {
            case 5:
                return a(z5Var);
            default:
                Set y3 = z5Var.y(ya.a.class);
                ya.c cVar = ya.c.f50159c;
                if (cVar == null) {
                    synchronized (ya.c.class) {
                        try {
                            cVar = ya.c.f50159c;
                            if (cVar == null) {
                                cVar = new ya.c();
                                ya.c.f50159c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new ya.b(y3, cVar);
        }
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            x9.b bVar = (x9.b) task.getResult();
            u9.b bVar2 = u9.b.f47665a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f49712b);
            z10 = true;
            if (bVar.f49713c.delete()) {
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
        this.f46592a = i10;
    }

    private final void d(b2 b2Var, int i10) {
    }
}
