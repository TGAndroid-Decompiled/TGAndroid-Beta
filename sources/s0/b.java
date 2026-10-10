package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import b2.l1;
import c3.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.q;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.rd0;
import u2.d0;
import u2.o1;
import u2.y0;
public final class b implements s5.e, pa.a, q9.d, a2, rd0, d9.e, e2.h, q3.g, Continuation {
    public final int f47623a;

    public b(int i10) {
        this.f47623a = i10;
    }

    @Override
    public void accept(Object obj) {
        ((y0) obj).f48808b.release();
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f47623a) {
            case 3:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        aa.a a2 = l5.i.a();
                        a2.t(rawQuery.getString(1));
                        a2.d = v5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f385c = decode;
                        arrayList.add(a2.d());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 14:
                return ((o) obj).c().getClass().getSimpleName();
            case 15:
                return i0.v(q.w(((d0) obj).p().f48721b, new b(17)));
            case 17:
                return Integer.valueOf(((l1) obj).f3417c);
            case 24:
                return Long.valueOf(((z3.a) obj).f53533b);
            case 25:
                return Long.valueOf(((z3.a) obj).f53534c);
            case 26:
                return (w3.q) obj;
            default:
                o1 o1Var = (o1) obj;
                o1Var.getClass();
                Bundle bundle = new Bundle();
                String str = o1.f48719e;
                a1 a1Var = o1Var.f48721b;
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(a1Var.d);
                g0 listIterator = a1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList2.add(((l1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList2);
                return bundle;
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
    public void f(b2 b2Var, int i10) {
        switch (this.f47623a) {
            case 9:
                return;
            case 12:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        switch (this.f47623a) {
            case 4:
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
    public String i(int i10) {
        switch (this.f47623a) {
            case 10:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            t9.b bVar2 = t9.b.f48289a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f50263b);
            z10 = true;
            if (bVar.f50264c.delete()) {
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

    @Override
    public java.lang.Object y0(ci.u5 r45) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.y0(ci.u5):java.lang.Object");
    }

    public b(Object obj, int i10) {
        this.f47623a = i10;
    }

    private final void a(b2 b2Var, int i10) {
    }
}
