package s5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.voip.d0;
public final class g implements d, t5.c, c {
    public static final i5.c f48073f = new i5.c("proto");
    public final i f48074a;
    public final u5.a f48075b;
    public final u5.a f48076c;
    public final a d;
    public final zc.a e;

    public g(u5.a aVar, u5.a aVar2, a aVar3, i iVar, zc.a aVar4) {
        this.f48074a = iVar;
        this.f48075b = aVar;
        this.f48076c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, l5.i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f11664a, String.valueOf(v5.a.a(iVar.f11666c))));
        byte[] bArr = iVar.f11665b;
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
            sb2.append(((b) it.next()).f48068a);
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
        i iVar = this.f48074a;
        Objects.requireNonNull(iVar);
        u5.a aVar = this.f48076c;
        long g10 = aVar.g();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.g() < this.d.f48067c + g10) {
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
        this.f48074a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, l5.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i10)), new q5.a(this, (Object) arrayList, iVar, 3));
        return arrayList;
    }

    public final void e(long j10, o5.c cVar, String str) {
        c(new d0(str, cVar, j10, 9));
    }

    public final Object f(t5.b bVar) {
        SQLiteDatabase a2 = a();
        u5.a aVar = this.f48076c;
        long g10 = aVar.g();
        while (true) {
            try {
                a2.beginTransaction();
                try {
                    Object g11 = bVar.g();
                    a2.setTransactionSuccessful();
                    return g11;
                } finally {
                    a2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.g() < this.d.f48067c + g10) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }
}
