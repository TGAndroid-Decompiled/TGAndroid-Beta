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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.pc0;
import u2.d0;
import u2.x0;
public final class b implements s5.e, pa.a, q9.d, a2, pc0, d9.e, e2.h {
    public final int f42569a;

    public b(int i10) {
        this.f42569a = i10;
    }

    @Override
    public java.lang.Object G(cf.c r45) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.G(cf.c):java.lang.Object");
    }

    @Override
    public void accept(Object obj) {
        ((x0) obj).f43461b.release();
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f42569a) {
            case 10:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        aa.a a2 = l5.i.a();
                        a2.u(rawQuery.getString(1));
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
            case 21:
                return ((o) obj).c().getClass().getSimpleName();
            case 22:
                return i0.v(q.w(((d0) obj).r().f43381b, new b(24)));
            default:
                return Integer.valueOf(((l1) obj).f3085c);
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f42569a) {
            case 17:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f42569a) {
            case 16:
                return;
            case 19:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        switch (this.f42569a) {
            case 11:
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

    public b(Object obj, int i10) {
        this.f42569a = i10;
    }

    private final void a(b2 b2Var, int i10) {
    }
}
