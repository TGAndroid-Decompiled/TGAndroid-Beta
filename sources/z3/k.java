package z3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.ArrayList;
public final class k implements r8.e, f3.f {
    public final int f51018a;

    public k(int i10) {
        this.f51018a = i10;
    }

    @Override
    public final Object apply(Object obj) {
        byte[] decode;
        switch (this.f51018a) {
            case 0:
                return (p) obj;
            default:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        s5.m a2 = y2.i.a();
                        a2.n(rawQuery.getString(1));
                        a2.d = i3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f47063c = decode;
                        arrayList.add(a2.f());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
        }
    }
}
