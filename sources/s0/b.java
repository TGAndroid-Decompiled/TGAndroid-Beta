package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import b2.l1;
import c3.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.i0;
import e9.q;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.yc0;
import u2.d0;
import w3.p;
public final class b implements s5.f, pa.a, q9.d, a2, yc0, d9.e, q3.g, Continuation {
    public final int f42916a;

    public b(int i10) {
        this.f42916a = i10;
    }

    @Override
    public java.lang.Object G(cf.c r45) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.G(cf.c):java.lang.Object");
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f42916a) {
            case 5:
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
            case 16:
                return ((o) obj).c().getClass().getSimpleName();
            case 17:
                return i0.v(q.w(((d0) obj).r().f43766b, new b(18)));
            case 18:
                return Integer.valueOf(((l1) obj).f3093c);
            case 25:
                return Long.valueOf(((z3.a) obj).f48381b);
            case 26:
                return Long.valueOf(((z3.a) obj).f48382c);
            default:
                return (p) obj;
        }
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77 && i12 == 76 && i13 == 76) {
                if (i14 == 84 || i10 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public String e(int i10) {
        switch (this.f42916a) {
            case 12:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void f(pa.b bVar) {
        switch (this.f42916a) {
            case 6:
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
    public void k(b2 b2Var, int i10) {
        switch (this.f42916a) {
            case 11:
                return;
            case 14:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            t9.b bVar2 = t9.b.f43352a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f45210b);
            z10 = true;
            if (bVar.f45211c.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public b(Object obj, int i10) {
        this.f42916a = i10;
    }

    private final void a(b2 b2Var, int i10) {
    }
}
