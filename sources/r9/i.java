package r9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
public final class i implements q9.d, b2, s5.e, pa.a {
    public final int f42195a;

    public i(int i10) {
        this.f42195a = i10;
    }

    @Override
    public java.lang.Object G(cf.c r45) {
        throw new UnsupportedOperationException("Method not decompiled: r9.i.G(cf.c):java.lang.Object");
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
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
    }

    @Override
    public void f(c2 c2Var, int i10) {
        switch (this.f42195a) {
            case 4:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(pa.b bVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    public i(Object obj, int i10) {
        this.f42195a = i10;
    }
}
