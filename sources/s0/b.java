package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import c3.o;
import e9.i0;
import e9.q;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.ad0;
import u2.d0;
import u2.o1;
import u2.y0;
public final class b implements s5.f, pa.a, q9.d, z1, ad0, d9.e, e2.h {
    public final int f42902a;

    public b(int i10) {
        this.f42902a = i10;
    }

    @Override
    public java.lang.Object G(cf.c r45) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.G(cf.c):java.lang.Object");
    }

    @Override
    public void accept(Object obj) {
        ((y0) obj).f43822b.release();
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f42902a) {
            case 16:
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
                        a2.f360c = decode;
                        arrayList.add(a2.e());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 27:
                return ((o) obj).c().getClass().getSimpleName();
            default:
                return i0.v(q.w(((d0) obj).r().f43751b, new o1(0)));
        }
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f42902a) {
            case 22:
                return;
            case 25:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        switch (this.f42902a) {
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
    public String j(int i10) {
        switch (this.f42902a) {
            case 23:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    public b(Object obj, int i10) {
        this.f42902a = i10;
    }

    private final void a(a2 a2Var, int i10) {
    }
}
