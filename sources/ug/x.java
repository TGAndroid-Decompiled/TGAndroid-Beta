package ug;

import a8.r7;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wt0;
public final class x implements org.telegram.ui.ActionBar.q1, v5.e, u9.d, ua.a, OnFailureListener, j2.g, pb0, vt0, wt0, g9.k {
    public final int f58951a;

    public x(int i7) {
        this.f58951a = i7;
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f58951a) {
            case 7:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        h6.m a10 = o5.i.a();
                        a10.I(rawQuery.getString(1));
                        a10.d = y5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a10.f13932c = decode;
                        arrayList.add(a10.j());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 28:
                return ((f3.o) obj).a().getClass().getSimpleName();
            default:
                return h9.i0.q(h9.o.y(((x2.e0) obj).q().f60224b, new x2.z0(1)));
        }
    }

    @Override
    public void b(ua.b bVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public void c(Object obj, float f10) {
        wi.h hVar = (wi.h) obj;
        switch (this.f58951a) {
            case 23:
                WindowManager.LayoutParams layoutParams = hVar.f59959e;
                hVar.B = f10;
                layoutParams.x = (int) f10;
                hVar.r();
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = hVar.f59959e;
                hVar.C = f10;
                layoutParams2.y = (int) f10;
                hVar.r();
                return;
        }
    }

    @Override
    public j2.h createDataSource() {
        return new j2.b(org.telegram.messenger.t0.f26895b);
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f58951a) {
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7542a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7544c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7543b.get();
            case 11:
                u9.m mVar = ExecutorsRegistrar.f7542a;
                return v9.j.f59336a;
            default:
                return FirebaseInstallationsRegistrar.a(r7Var);
        }
    }

    @Override
    public float get(Object obj) {
        wi.h hVar = (wi.h) obj;
        switch (this.f58951a) {
            case 22:
                return hVar.B;
            default:
                return hVar.C;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f58951a) {
            case 0:
                t1Var.dismiss();
                return;
            case 1:
                t1Var.dismiss();
                return;
            case 17:
                return;
            case 20:
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public String i(int i7) {
        switch (this.f58951a) {
            case 18:
                return String.valueOf(i7);
            default:
                return String.format("%02d", Integer.valueOf(i7 * 5));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public x(androidx.emoji2.text.f fVar) {
        this.f58951a = 13;
    }

    private final void a(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
    }
}
