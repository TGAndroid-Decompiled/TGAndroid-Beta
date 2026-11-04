package ra;

import android.content.Context;
import android.os.Build;
import b8.gd;
import b8.yf;
import db.a1;
import db.o;
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
import od.l;
import wd.b0;
public final class i {
    public static final p1.e f54465b = new p1.e("fire-global");
    public static final p1.e f54466c = new p1.e("fire-count");
    public static final p1.e d = yf.a("last-used-date");
    public final ja.d f54467a;

    public i(Context context, String str) {
        this.f54467a = new ja.d(context, t4.c.f("FirebaseHeartBeat", str));
    }

    public static String c(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public static p1.e d(p1.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return yf.b(((p1.e) entry.getKey()).f53065a);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void f(p1.b bVar, String str) {
        p1.e d10 = d(bVar, str);
        if (d10 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) gd.a(bVar, d10, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            bVar.c(d10);
        } else {
            bVar.e(d10, hashSet);
        }
    }

    public final synchronized void a() {
        this.f54467a.a(new o(this));
    }

    public final synchronized ArrayList b() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String c2 = c(System.currentTimeMillis());
            ja.d dVar = this.f54467a;
            dVar.getClass();
            for (Map.Entry entry : ((Map) b0.u(new a1(dVar, null, 2))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(c2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((p1.e) entry.getKey()).f53065a, new ArrayList(hashSet)));
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
        this.f54467a.a(new c1.b(this, c(System.currentTimeMillis())));
    }

    public final synchronized boolean g(long j10) {
        return h(f54465b, j10);
    }

    public final synchronized boolean h(p1.e eVar, long j10) {
        if (c(((Long) this.f54467a.b(eVar, -1L)).longValue()).equals(c(j10))) {
            return false;
        }
        ja.d dVar = this.f54467a;
        Long valueOf = Long.valueOf(j10);
        dVar.getClass();
        p1.b bVar = (p1.b) b0.u(new ae.c(dVar, eVar, valueOf, (fd.c) null));
        return true;
    }

    public final synchronized void i(long j10, String str) {
        try {
            try {
                String c2 = c(j10);
                p1.e b10 = yf.b(str);
                this.f54467a.a(new e1.b(this, c2, str, b10, 2));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void j(final long j10) {
        this.f54467a.a(new l() {
            @Override
            public final Object invoke(Object obj) {
                ((p1.b) obj).d(i.f54465b, Long.valueOf(j10));
                return null;
            }
        });
    }
}
