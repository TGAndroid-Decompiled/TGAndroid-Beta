package u9;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import b8.ke;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import d2.o1;
import e3.o;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.ya0;
import t9.n;
import ug.c2;
import w2.a1;
import w2.e0;
import w2.r1;
import y3.r;
public final class j implements t9.d, OnFailureListener, ta.a, p1, f9.k, g2.k, s3.g, ya0 {
    public final int f55767a;

    public j(int i3) {
        this.f55767a = i3;
    }

    @Override
    public void accept(Object obj) {
        ((a1) obj).f57025b.release();
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f55767a) {
            case 12:
                return ((o) obj).a().getClass().getSimpleName();
            case 13:
                return i0.q(g9.o.y(((e0) obj).p().f57207b, new j(15)));
            case 15:
                return Integer.valueOf(((o1) obj).f8254c);
            case 25:
                return Long.valueOf(((b4.a) obj).f2353b);
            case 26:
                return Long.valueOf(((b4.a) obj).f2354c);
            case 27:
                return (r) obj;
            default:
                r1 r1Var = (r1) obj;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                String str = r1.f57205e;
                s1 s1Var = r1Var.f57207b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(s1Var.d);
                g0 listIterator = s1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((o1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
        }
    }

    @Override
    public void c(ta.b bVar) {
        switch (this.f55767a) {
            case 8:
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
    public boolean d(int i3, int i10, int i11, int i12, int i13) {
        if (i10 != 67 || i11 != 79 || i12 != 77 || (i13 != 77 && i3 != 2)) {
            if (i10 == 77 && i11 == 76 && i12 == 76) {
                if (i13 == 84 || i3 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public String e(int i3) {
        switch (this.f55767a) {
            case 21:
                return String.valueOf(i3);
            default:
                return String.format("%02d", Integer.valueOf(i3 * 5));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f55767a) {
            case 10:
                s1Var.dismiss();
                return;
            case 11:
                s1Var.dismiss();
                return;
            case 20:
                return;
            case 23:
                s1Var.dismiss();
                return;
            default:
                s1Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        switch (this.f55767a) {
            case 2:
                int i3 = c2.f55894s0;
                return;
            default:
                Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
                return;
        }
    }

    @Override
    public Object q1(ke keVar) {
        switch (this.f55767a) {
            case 0:
                n nVar = ExecutorsRegistrar.f7932a;
                return m.f55776a;
            default:
                return FirebaseInstallationsRegistrar.a(keVar);
        }
    }

    public j(androidx.emoji2.text.f fVar) {
        this.f55767a = 8;
    }

    private final void b(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
    }
}
