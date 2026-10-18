package r;

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
import l5.i;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import r9.e;
import r9.n;
import rg.m2;
import s9.k;
public final class a implements androidx.car.app.utils.b, e, qa.a, r9.d, OnFailureListener, s5.e, a2 {
    public final int f44827a;

    public a(int i10) {
        this.f44827a = i10;
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                androidx.biometric.e a2 = i.a();
                a2.v(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a2.f2820c = decode;
                arrayList.add(a2.g());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f44827a) {
            case 28:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f44827a) {
            case 7:
                return FirebaseInstallationsRegistrar.a(z5Var);
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7587a.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7589c.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7588b.get();
            default:
                n nVar = ExecutorsRegistrar.f7587a;
                return k.f46191a;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = m2.f45550r0;
    }

    @Override
    public List v(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void h(qa.b bVar) {
    }
}
