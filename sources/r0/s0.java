package r0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.WindowInsets;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
public final class s0 implements q9.d, a2, s5.f {
    public final int f42122a;

    public s0(int i10) {
        this.f42122a = i10;
    }

    public static WindowInsets a() {
        return WindowInsets.CONSUMED;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f42122a) {
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7260a.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7262c.get();
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7261b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.f7260a;
                return r9.j.f42427a;
        }
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
    public void f(b2 b2Var, int i10) {
        switch (this.f42122a) {
            case 6:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }
}
