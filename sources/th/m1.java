package th;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.l20;
import org.telegram.messenger.m9;
import org.telegram.messenger.t20;
import org.telegram.messenger.tc;
import org.telegram.messenger.xe;
import w7.b9;
public final class m1 implements org.telegram.ui.ActionBar.u1, d9.k, e2.j, qa.a, q3.g, m9, l20, t20, Continuation, r9.d, i5.e, wg.c {
    public final int f49248a;

    public m1(int i10) {
        this.f49248a = i10;
    }

    @Override
    public Object K(bh.d dVar) {
        return FirebaseMessagingRegistrar.a(dVar);
    }

    @Override
    public void accept(Object obj) {
        ((u2.a1) obj).f49837b.release();
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f49248a) {
            case 1:
                return ((c3.o) obj).b().getClass().getSimpleName();
            case 2:
                return e9.n0.u(e9.s.x(((u2.e0) obj).q().f50008b, new m1(4)));
            case 4:
                return Integer.valueOf(((b2.p1) obj).f2189c);
            case 16:
                return Long.valueOf(((z3.a) obj).f54571b);
            case 17:
                return Long.valueOf(((z3.a) obj).f54572c);
            case 18:
                return (w3.q) obj;
            case 19:
                u2.r1 r1Var = (u2.r1) obj;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                String str = u2.r1.e;
                e9.x1 x1Var = r1Var.f50008b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x1Var.d);
                e9.l0 listIterator = x1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((b2.p1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            default:
                ya.e eVar = (ya.e) obj;
                eVar.getClass();
                li.k kVar = xa.k.f53568a;
                kVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    kVar.q(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
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
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            if (num.intValue() == 0) {
                return dd.L0(2131748815, null);
            }
            return dd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public int g(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        float f7;
        float f10;
        switch (this.f49248a) {
            case 28:
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
                if (z10) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.825f;
                }
                return org.telegram.ui.ActionBar.t6.r1(f7, x02);
            default:
                if (tc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return b9.n(f10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Nl, p6Var));
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        x1Var.dismiss();
    }

    @Override
    public void i(qa.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public Object l(Object obj) {
        Integer num = (Integer) obj;
        xe xeVar = vh.k2.f51394j0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        int i10;
        switch (this.f49248a) {
            case 21:
                if (task.isSuccessful()) {
                    x9.b bVar = (x9.b) task.getResult();
                    u9.c cVar = u9.c.f50210a;
                    cVar.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f53459b);
                    z10 = true;
                    if (bVar.f53460c.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 22:
            default:
                i10 = -1;
                break;
            case 23:
                i10 = 403;
                break;
        }
        return Integer.valueOf(i10);
    }

    public m1(j2.f fVar) {
        this.f49248a = 21;
    }
}
