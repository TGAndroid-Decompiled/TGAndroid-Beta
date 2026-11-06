package sa;

import android.content.Context;
import android.os.Build;
import c8.a1;
import c8.pb;
import gb.b1;
import gb.p;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import rd.l;
import zd.b0;
public final class h {
    public static final q1.e f54878b = new q1.e("fire-global");
    public static final q1.e f54879c = new q1.e("fire-count");
    public static final q1.e d = pb.a("last-used-date");
    public final ka.d f54880a;

    public h(Context context, String str) {
        this.f54880a = new ka.d(context, rf.b.i("FirebaseHeartBeat", str));
    }

    public static String c(long j3) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j3)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j3));
    }

    public static q1.e d(q1.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return pb.b(((q1.e) entry.getKey()).f53569a);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void f(q1.b bVar, String str) {
        q1.e d2 = d(bVar, str);
        if (d2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) a1.a(bVar, d2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            bVar.c(d2);
        } else {
            bVar.e(d2, hashSet);
        }
    }

    public final synchronized void a() {
        this.f54880a.a(new p(this));
    }

    public final synchronized ArrayList b() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String c10 = c(System.currentTimeMillis());
            ka.d dVar = this.f54880a;
            dVar.getClass();
            for (Map.Entry entry : ((Map) b0.u(new b1(dVar, null, 2))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(c10);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((q1.e) entry.getKey()).f53569a, new ArrayList(hashSet)));
                    }
                }
            }
            j(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized void e() {
        this.f54880a.a(new c1.b(this, c(System.currentTimeMillis())));
    }

    public final synchronized boolean g(long j3) {
        return h(f54878b, j3);
    }

    public final synchronized boolean h(q1.e eVar, long j3) {
        if (c(((Long) this.f54880a.b(eVar, -1L)).longValue()).equals(c(j3))) {
            return false;
        }
        ka.d dVar = this.f54880a;
        Long valueOf = Long.valueOf(j3);
        dVar.getClass();
        q1.b bVar = (q1.b) b0.u(new de.c(dVar, eVar, valueOf, (id.c) null));
        return true;
    }

    public final synchronized void i(long j3, String str) {
        try {
            try {
                String c10 = c(j3);
                q1.e b10 = pb.b(str);
                this.f54880a.a(new e1.b(this, c10, str, b10, 2));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void j(final long j3) {
        this.f54880a.a(new l() {
            @Override
            public final Object invoke(Object obj) {
                ((q1.b) obj).d(h.f54878b, Long.valueOf(j3));
                return null;
            }
        });
    }
}
