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
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tt0;
public final class x implements org.telegram.ui.ActionBar.r1, v5.e, u9.d, ua.a, OnFailureListener, j2.g, ob0, st0, tt0, g9.k {
    public final int f58932a;

    public x(int i7) {
        this.f58932a = i7;
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f58932a) {
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
                        a10.f13937c = decode;
                        arrayList.add(a10.j());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 28:
                return ((f3.o) obj).a().getClass().getSimpleName();
            default:
                return h9.i0.q(h9.o.y(((x2.e0) obj).q().f60214b, new x2.z0(1)));
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
        switch (this.f58932a) {
            case 23:
                WindowManager.LayoutParams layoutParams = hVar.f59949e;
                hVar.B = f10;
                layoutParams.x = (int) f10;
                hVar.r();
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = hVar.f59949e;
                hVar.C = f10;
                layoutParams2.y = (int) f10;
                hVar.r();
                return;
        }
    }

    @Override
    public j2.h createDataSource() {
        return new j2.b(org.telegram.messenger.t0.f26913b);
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f58932a) {
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7547a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7549c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7548b.get();
            case 11:
                u9.m mVar = ExecutorsRegistrar.f7547a;
                return v9.j.f59331a;
            default:
                return FirebaseInstallationsRegistrar.a(r7Var);
        }
    }

    @Override
    public float get(Object obj) {
        wi.h hVar = (wi.h) obj;
        switch (this.f58932a) {
            case 22:
                return hVar.B;
            default:
                return hVar.C;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f58932a) {
            case 0:
                u1Var.dismiss();
                return;
            case 1:
                u1Var.dismiss();
                return;
            case 17:
                return;
            case 20:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public String i(int i7) {
        switch (this.f58932a) {
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
        this.f58932a = 13;
    }

    private final void a(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
    }
}
