package v5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.ui.Components.hr;
public final class g implements d, w5.c, c {
    public static final l5.c f57112f = new l5.c("proto");
    public final i f57113a;
    public final x5.a f57114b;
    public final x5.a f57115c;
    public final a d;
    public final fd.a f57116e;

    public g(x5.a aVar, x5.a aVar2, a aVar3, i iVar, fd.a aVar4) {
        this.f57113a = iVar;
        this.f57114b = aVar;
        this.f57115c = aVar2;
        this.d = aVar3;
        this.f57116e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, o5.i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f20823a, String.valueOf(y5.a.a(iVar.f20825c))));
        byte[] bArr = iVar.f20824b;
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
            sb2.append(((b) it.next()).f57107a);
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
        i iVar = this.f57113a;
        Objects.requireNonNull(iVar);
        x5.a aVar = this.f57115c;
        long s5 = aVar.s();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.s() < this.d.f57105c + s5) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e10);
                }
            }
        }
    }

    public final Object c(e eVar) {
        SQLiteDatabase a10 = a();
        a10.beginTransaction();
        try {
            Object apply = eVar.apply(a10);
            a10.setTransactionSuccessful();
            return apply;
        } finally {
            a10.endTransaction();
        }
    }

    @Override
    public final void close() {
        this.f57113a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, o5.i iVar, int i7) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i7)), new hr(this, arrayList, iVar, 14));
        return arrayList;
    }

    public final void e(long j3, r5.c cVar, String str) {
        c(new bi.i(str, cVar, j3, 10));
    }

    public final Object f(w5.b bVar) {
        SQLiteDatabase a10 = a();
        x5.a aVar = this.f57115c;
        long s5 = aVar.s();
        while (true) {
            try {
                a10.beginTransaction();
                try {
                    Object h = bVar.h();
                    a10.setTransactionSuccessful();
                    return h;
                } finally {
                    a10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.s() < this.d.f57105c + s5) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e10);
                }
            }
        }
    }
}
