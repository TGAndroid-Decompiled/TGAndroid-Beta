package r0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import rg.p2;
public final class h implements r9.e, qa.a, r9.d, OnFailureListener, s5.e, z1 {
    public final int f43719a;

    public h(int i10) {
        this.f43719a = i10;
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                androidx.biometric.e a2 = l5.i.a();
                a2.v(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a2.f1197c = decode;
                arrayList.add(a2.g());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f43719a) {
            case 27:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f43719a) {
            case 6:
                return FirebaseInstallationsRegistrar.a(z5Var);
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6127a.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6129c.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6128b.get();
            default:
                r9.n nVar = ExecutorsRegistrar.f6127a;
                return s9.l.f45074a;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = p2.f44452r0;
    }

    @Override
    public List v(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void f(qa.b bVar) {
    }
}
