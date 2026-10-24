package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import b2.p1;
import c3.q;
import e9.n0;
import e9.s;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.kd0;
import u2.c1;
import u2.f0;
public final class b implements s5.e, r9.d, z1, qa.a, d9.k, e2.j, kd0 {
    public final int f46292a;

    public b(int i10) {
        this.f46292a = i10;
    }

    @Override
    public void accept(Object obj) {
        ((c1) obj).f47722b.release();
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f46292a) {
            case 6:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        androidx.biometric.e a2 = l5.i.a();
                        a2.u(rawQuery.getString(1));
                        a2.d = v5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f2823c = decode;
                        arrayList.add(a2.e());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 19:
                return ((q) obj).b().getClass().getSimpleName();
            case 20:
                return n0.u(s.x(((f0) obj).r().f47888b, new b(22)));
            default:
                return Integer.valueOf(((p1) obj).f3909c);
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f46292a) {
            case 25:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f46292a) {
            case 11:
                c2Var.dismiss();
                return;
            case 12:
                c2Var.dismiss();
                return;
            case 24:
                return;
            case 27:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        switch (this.f46292a) {
            case 17:
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
    public java.lang.Object j2(com.google.android.gms.internal.cast.z5 r44) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.j2(com.google.android.gms.internal.cast.z5):java.lang.Object");
    }

    public b(Object obj, int i10) {
        this.f46292a = i10;
    }

    private final void b(c2 c2Var, int i10) {
    }
}
