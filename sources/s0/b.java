package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import b2.q1;
import c3.o;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import f9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import sg.o2;
import u2.a1;
import u2.e0;
public final class b implements s9.e, ra.a, s9.d, OnFailureListener, t5.e, b2, e9.k, e2.j, q3.g {
    public final int f47679a;

    public b(int i10) {
        this.f47679a = i10;
    }

    @Override
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void accept(Object obj) {
        ((a1) obj).f49280b.release();
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f47679a) {
            case 10:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        k6.c a2 = m5.i.a();
                        a2.H(rawQuery.getString(1));
                        a2.d = w5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f16405b = decode;
                        arrayList.add(a2.j());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 17:
                return ((o) obj).b().getClass().getSimpleName();
            case 18:
                return i0.u(f9.o.x(((e0) obj).p().f49451b, new b(20)));
            default:
                return Integer.valueOf(((q1) obj).f3360c);
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
    public java.lang.Object d1(a8.me r44) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.d1(a8.me):java.lang.Object");
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f47679a) {
            case 15:
                e2Var.dismiss();
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public void i(ra.b bVar) {
        switch (this.f47679a) {
            case 5:
                return;
            case 21:
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
    public void onFailure(Exception exc) {
        int i10 = o2.f48460r0;
    }

    public b(Object obj, int i10) {
        this.f47679a = i10;
    }

    private final void b(ra.b bVar) {
    }
}
