package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import c3.o;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.cd0;
public final class b implements s5.e, pa.a, q9.d, a2, cd0, d9.e {
    public final int f46477a;

    public b(int i10) {
        this.f46477a = i10;
    }

    @Override
    public java.lang.Object E(cf.c r45) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.E(cf.c):java.lang.Object");
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f46477a) {
            case 18:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        aa.a a2 = l5.i.a();
                        a2.s(rawQuery.getString(1));
                        a2.d = v5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f387c = decode;
                        arrayList.add(a2.e());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                return ((o) obj).c().getClass().getSimpleName();
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f46477a) {
            case 25:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void f(pa.b bVar) {
        switch (this.f46477a) {
            case 19:
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
    public void g(b2 b2Var, int i10) {
        switch (this.f46477a) {
            case 24:
                return;
            case 27:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    public b(Object obj, int i10) {
        this.f46477a = i10;
    }

    private final void a(b2 b2Var, int i10) {
    }
}
