package sg;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.kd0;
public final class y implements org.telegram.ui.ActionBar.a2, qa.a, r9.d, d9.k, e2.j, kd0, q3.g, Continuation {
    public final int f46511a;

    public y(int i10) {
        this.f46511a = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f46511a) {
            case 9:
                ((u2.b1) obj).f47270b.release();
                return;
            default:
                ((ExecutorService) obj).shutdown();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f46511a) {
            case 7:
                return ((c3.o) obj).b().getClass().getSimpleName();
            case 8:
                return e9.n0.u(e9.s.x(((u2.e0) obj).r().f47434b, new y(10)));
            case 10:
                return Integer.valueOf(((b2.p1) obj).f3902c);
            case 23:
                return Long.valueOf(((z3.a) obj).f50645b);
            case 24:
                return Long.valueOf(((z3.a) obj).f50646c);
            case 25:
                return (w3.q) obj;
            default:
                u2.s1 s1Var = (u2.s1) obj;
                s1Var.getClass();
                Bundle bundle = new Bundle();
                String str = u2.s1.e;
                e9.x1 x1Var = s1Var.f47434b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x1Var.d);
                e9.l0 listIterator = x1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((b2.p1) listIterator.next()).c());
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
        switch (this.f46511a) {
            case 13:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f46511a) {
            case 0:
                b2Var.dismiss();
                return;
            case 12:
                return;
            case 15:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        switch (this.f46511a) {
            case 5:
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
    public java.lang.Object j2(com.google.android.gms.internal.cast.z5 r45) {
        throw new UnsupportedOperationException("Method not decompiled: sg.y.j2(com.google.android.gms.internal.cast.z5):java.lang.Object");
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            x9.b bVar = (x9.b) task.getResult();
            u9.b bVar2 = u9.b.f47632a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f49674b);
            z10 = true;
            if (bVar.f49675c.delete()) {
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

    public y(Object obj, int i10) {
        this.f46511a = i10;
    }

    private final void c(b2 b2Var, int i10) {
    }
}
