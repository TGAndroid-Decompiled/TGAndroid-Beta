package v0;

import a8.r7;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import e2.m1;
import h9.i0;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.db0;
import x2.d0;
import x2.y0;
public final class j implements v5.e, u9.d, ua.a, OnFailureListener, j2.g, r1, db0, g9.k, h2.j, t3.g {
    public final int f56978a;

    public j(int i7) {
        this.f56978a = i7;
    }

    @Override
    public void accept(Object obj) {
        ((y0) obj).f58544b.release();
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f56978a) {
            case 5:
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
                        a10.f14267c = decode;
                        arrayList.add(a10.h());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 22:
                return ((f3.o) obj).a().getClass().getSimpleName();
            case 23:
                return i0.q(h9.o.y(((d0) obj).o().f58456b, new j(25)));
            case 25:
                return Integer.valueOf(((m1) obj).f10380c);
            case 28:
                return Long.valueOf(((c4.a) obj).f5273b);
            default:
                return Long.valueOf(((c4.a) obj).f5274c);
        }
    }

    @Override
    public boolean b(int i7, int i10, int i11, int i12, int i13) {
        if (i10 != 67 || i11 != 79 || i12 != 77 || (i13 != 77 && i7 != 2)) {
            if (i10 == 77 && i11 == 76 && i12 == 76) {
                if (i13 == 84 || i7 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public void c(ua.b bVar) {
        switch (this.f56978a) {
            case 11:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public j2.h createDataSource() {
        return new j2.b(t0.f25570b);
    }

    @Override
    public Object e(r7 r7Var) {
        va.d lambda$getComponents$0;
        switch (this.f56978a) {
            case 6:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7880a.get();
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7882c.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7881b.get();
            case 9:
                u9.n nVar = ExecutorsRegistrar.f7880a;
                return v9.j.f57288a;
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
        }
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f56978a) {
            case 15:
                return;
            case 18:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public String h(int i7) {
        switch (this.f56978a) {
            case 16:
                return String.valueOf(i7);
            default:
                return String.format("%02d", Integer.valueOf(i7 * 5));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public j(androidx.emoji2.text.f fVar) {
        this.f56978a = 11;
    }

    private final void d(u1 u1Var, int i7) {
    }
}
