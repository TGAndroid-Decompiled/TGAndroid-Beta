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
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.lt0;
public final class x implements org.telegram.ui.ActionBar.q1, v5.e, u9.d, ua.a, OnFailureListener, j2.g, eb0, kt0, lt0, g9.k, h2.j {
    public final int f58369a;

    public x(int i7) {
        this.f58369a = i7;
    }

    @Override
    public void accept(Object obj) {
        ((x2.y0) obj).f59727b.release();
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f58369a) {
            case 6:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        h6.m a10 = o5.i.a();
                        a10.F(rawQuery.getString(1));
                        a10.d = y5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a10.f13625c = decode;
                        arrayList.add(a10.j());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 27:
                return ((f3.o) obj).a().getClass().getSimpleName();
            default:
                return h9.i0.q(h9.o.y(((x2.d0) obj).p().f59641b, new x2.p1(0)));
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
        switch (this.f58369a) {
            case 22:
                WindowManager.LayoutParams layoutParams = hVar.f59384e;
                hVar.B = f10;
                layoutParams.x = (int) f10;
                hVar.r();
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = hVar.f59384e;
                hVar.C = f10;
                layoutParams2.y = (int) f10;
                hVar.r();
                return;
        }
    }

    @Override
    public j2.h createDataSource() {
        return new j2.b(org.telegram.messenger.t0.f26600b);
    }

    @Override
    public String e(int i7) {
        switch (this.f58369a) {
            case 17:
                return String.valueOf(i7);
            default:
                return String.format("%02d", Integer.valueOf(i7 * 5));
        }
    }

    @Override
    public float get(Object obj) {
        wi.h hVar = (wi.h) obj;
        switch (this.f58369a) {
            case 21:
                return hVar.B;
            default:
                return hVar.C;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f58369a) {
            case 0:
                t1Var.dismiss();
                return;
            case 16:
                return;
            case 19:
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public Object i(r7 r7Var) {
        switch (this.f58369a) {
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7264a.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7266c.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7265b.get();
            case 10:
                u9.m mVar = ExecutorsRegistrar.f7264a;
                return v9.j.f58761a;
            default:
                return FirebaseInstallationsRegistrar.a(r7Var);
        }
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public x(androidx.emoji2.text.f fVar) {
        this.f58369a = 12;
    }

    private final void a(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
    }
}
