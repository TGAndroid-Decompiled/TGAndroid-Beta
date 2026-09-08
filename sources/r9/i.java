package r9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import rg.o2;
public final class i implements q9.d, OnFailureListener, s5.e, pa.a, a2 {
    public final int f45080a;

    public i(int i10) {
        this.f45080a = i10;
    }

    @Override
    public java.lang.Object D(cf.c r45) {
        throw new UnsupportedOperationException("Method not decompiled: r9.i.D(cf.c):java.lang.Object");
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                aa.a a2 = l5.i.a();
                a2.B(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a2.f384c = decode;
                arrayList.add(a2.f());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f45080a) {
            case 27:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(pa.b bVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = o2.f45404r0;
    }

    public i(Object obj, int i10) {
        this.f45080a = i10;
    }
}
