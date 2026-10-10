package s5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ci.q9;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.ui.Components.sz;
public final class g implements d, t5.c, c {
    public static final i5.c f47887f = new i5.c("proto");
    public final i f47888a;
    public final u5.a f47889b;
    public final u5.a f47890c;
    public final a d;
    public final gd.a f47891e;

    public g(u5.a aVar, u5.a aVar2, a aVar3, i iVar, gd.a aVar4) {
        this.f47888a = iVar;
        this.f47889b = aVar;
        this.f47890c = aVar2;
        this.d = aVar3;
        this.f47891e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, l5.i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f15415a, String.valueOf(v5.a.a(iVar.f15417c))));
        byte[] bArr = iVar.f15416b;
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
            sb2.append(((b) it.next()).f47882a);
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
        i iVar = this.f47888a;
        Objects.requireNonNull(iVar);
        u5.a aVar = this.f47890c;
        long Z = aVar.Z();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.Z() < this.d.f47880c + Z) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e7);
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
        this.f47888a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, l5.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i10)), new sz(this, arrayList, iVar, 9));
        return arrayList;
    }

    public final void e(long j3, o5.c cVar, String str) {
        c(new q9(str, cVar, j3, 8));
    }

    public final Object f(t5.b bVar) {
        SQLiteDatabase a2 = a();
        u5.a aVar = this.f47890c;
        long Z = aVar.Z();
        while (true) {
            try {
                a2.beginTransaction();
                try {
                    Object i10 = bVar.i();
                    a2.setTransactionSuccessful();
                    return i10;
                } finally {
                    a2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.Z() < this.d.f47880c + Z) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e7);
                }
            }
        }
    }
}
