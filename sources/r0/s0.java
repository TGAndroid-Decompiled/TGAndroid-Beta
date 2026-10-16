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
public final class s0 implements r9.e, qa.a, r9.d, OnFailureListener, s5.e, z1 {
    public final int f43510a;

    public s0(int i10) {
        this.f43510a = i10;
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
                a2.f1201c = decode;
                arrayList.add(a2.e());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f43510a) {
            case 27:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public Object n2(z5 z5Var) {
        switch (this.f43510a) {
            case 4:
                return FirebaseInstallationsRegistrar.a(z5Var);
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6130a.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6132c.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6131b.get();
            default:
                r9.n nVar = ExecutorsRegistrar.f6130a;
                return s9.l.f45074a;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = p2.f44211r0;
    }

    @Override
    public List w(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void h(qa.b bVar) {
    }
}
