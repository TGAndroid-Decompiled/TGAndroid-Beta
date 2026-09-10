package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.zc0;
public final class b implements s5.e, pa.a, q9.d, c2, zc0 {
    public final int f41552a;

    public b(int i10) {
        this.f41552a = i10;
    }

    @Override
    public java.lang.Object P1(bi.u6 r45) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.P1(bi.u6):java.lang.Object");
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                aa.a a2 = l5.i.a();
                a2.w(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a2.f356c = decode;
                arrayList.add(a2.e());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f41552a) {
            case 22:
                return;
            case 25:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(pa.b bVar) {
        switch (this.f41552a) {
            case 20:
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
    public String k(int i10) {
        switch (this.f41552a) {
            case 23:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    public b(Object obj, int i10) {
        this.f41552a = i10;
    }

    private final void a(d2 d2Var, int i10) {
    }
}
