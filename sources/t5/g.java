package t5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.ui.Components.qy;
public final class g implements d, u5.c, c {
    public static final j5.c f48741f = new j5.c("proto");
    public final i f48742a;
    public final v5.a f48743b;
    public final v5.a f48744c;
    public final a d;
    public final id.a e;

    public g(v5.a aVar, v5.a aVar2, a aVar3, i iVar, id.a aVar4) {
        this.f48742a = iVar;
        this.f48743b = aVar;
        this.f48744c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, m5.i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f18332a, String.valueOf(w5.a.a(iVar.f18334c))));
        byte[] bArr = iVar.f18333b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f48736a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object h(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        i iVar = this.f48742a;
        Objects.requireNonNull(iVar);
        v5.a aVar = this.f48744c;
        long o10 = aVar.o();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.o() < this.d.f48735c + o10) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object c(e eVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            Object apply = eVar.apply(a2);
            a2.setTransactionSuccessful();
            return apply;
        } finally {
            a2.endTransaction();
        }
    }

    @Override
    public final void close() {
        this.f48742a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, m5.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i10)), new qy(this, arrayList, iVar, 9));
        return arrayList;
    }

    public final void e(long j10, p5.c cVar, String str) {
        c(new bi.i(str, cVar, j10, 10));
    }

    public final Object f(u5.b bVar) {
        SQLiteDatabase a2 = a();
        v5.a aVar = this.f48744c;
        long o10 = aVar.o();
        while (true) {
            try {
                a2.beginTransaction();
                try {
                    Object f7 = bVar.f();
                    a2.setTransactionSuccessful();
                    return f7;
                } finally {
                    a2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.o() < this.d.f48735c + o10) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }
}
