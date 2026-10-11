package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import b2.l1;
import c3.o;
import e9.i0;
import e9.q;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.rd0;
import u2.d0;
import u2.x0;
public final class b implements s5.e, pa.a, q9.d, z1, rd0, d9.e, e2.h, q3.g {
    public final int f47669a;

    public b(int i10) {
        this.f47669a = i10;
    }

    @Override
    public void accept(Object obj) {
        ((x0) obj).f48826b.release();
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f47669a) {
            case 5:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        aa.a a2 = l5.i.a();
                        a2.t(rawQuery.getString(1));
                        a2.d = v5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f385c = decode;
                        arrayList.add(a2.d());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 16:
                return ((o) obj).c().getClass().getSimpleName();
            case 17:
                return i0.v(q.w(((d0) obj).p().f48739b, new b(19)));
            case 19:
                return Integer.valueOf(((l1) obj).f3417c);
            case 26:
                return Long.valueOf(((z3.a) obj).f53576b);
            case 27:
                return Long.valueOf(((z3.a) obj).f53577c);
            default:
                return (w3.q) obj;
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
    public String e(int i10) {
        switch (this.f47669a) {
            case 12:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f47669a) {
            case 11:
                return;
            case 14:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        switch (this.f47669a) {
            case 6:
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
    public java.lang.Object y0(ci.u5 r45) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.y0(ci.u5):java.lang.Object");
    }

    public b(Object obj, int i10) {
        this.f47669a = i10;
    }

    private final void a(a2 a2Var, int i10) {
    }
}
