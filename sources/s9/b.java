package s9;

import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import b2.l1;
import c3.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.zc0;
import q3.g;
import u2.d0;
import u2.o1;
import w3.p;
import xh.h4;
public final class b implements pa.a, q9.d, a2, zc0, d9.e, g, Continuation, GenericProvider {
    public final int f43133a;

    public b(int i10) {
        this.f43133a = i10;
    }

    private final java.lang.Object a(cf.c r45) {
        throw new UnsupportedOperationException("Method not decompiled: s9.b.a(cf.c):java.lang.Object");
    }

    public static FingerprintManager b(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f43133a) {
            case 1:
                return a(cVar);
            default:
                Set x10 = cVar.x(xa.a.class);
                xa.c cVar2 = xa.c.f45986c;
                if (cVar2 == null) {
                    synchronized (xa.c.class) {
                        try {
                            cVar2 = xa.c.f45986c;
                            if (cVar2 == null) {
                                cVar2 = new xa.c(0);
                                xa.c.f45986c = cVar2;
                            }
                        } finally {
                        }
                    }
                }
                return new xa.b(x10, cVar2);
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f43133a) {
            case 10:
                return ((o) obj).c().getClass().getSimpleName();
            case 11:
                return i0.v(q.w(((d0) obj).r().f43713b, new b(12)));
            case 12:
                return Integer.valueOf(((l1) obj).f3093c);
            case 19:
                return Long.valueOf(((z3.a) obj).f48335b);
            case 20:
                return Long.valueOf(((z3.a) obj).f48336c);
            case 21:
                return (p) obj;
            default:
                o1 o1Var = (o1) obj;
                o1Var.getClass();
                Bundle bundle = new Bundle();
                String str = o1.e;
                a1 a1Var = o1Var.f43713b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(a1Var.d);
                g0 listIterator = a1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((l1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
        }
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
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
    public void f(b2 b2Var, int i10) {
        switch (this.f43133a) {
            case 5:
                return;
            case 8:
                b2Var.dismiss();
                return;
            case 9:
                b2Var.dismiss();
                return;
            case 27:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        switch (this.f43133a) {
            case 0:
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
    public String j(int i10) {
        switch (this.f43133a) {
            case 6:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = h4.f46140k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            t9.b bVar2 = t9.b.f43308a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f45166b);
            z10 = true;
            if (bVar.f45167c.delete()) {
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

    public b(Object obj, int i10) {
        this.f43133a = i10;
    }

    private final void d(b2 b2Var, int i10) {
    }
}
