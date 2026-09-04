package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class wf {
    public static m f51304k;
    public static final r f51305l;
    public final String f51306a;
    public final String f51307b;
    public final uf f51308c;
    public final qb.k d;
    public final Task f51309e;
    public final Task f51310f;
    public final String f51311g;
    public final int h;
    public final HashMap f51312i = new HashMap();
    public final HashMap f51313j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f51305l = new r(objArr);
    }

    public wf(Context context, qb.k kVar, uf ufVar) {
        int i10;
        this.f51306a = context.getPackageName();
        this.f51307b = qb.c.a(context);
        this.d = kVar;
        this.f51308c = ufVar;
        zf.b();
        this.f51311g = "subject-segmentation";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 10);
        a2.getClass();
        this.f51309e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f51310f = qb.f.b(pVar);
        r rVar = f51305l;
        if (rVar.containsKey("subject-segmentation")) {
            i10 = y6.e.d(context, (String) rVar.get("subject-segmentation"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(vf vfVar, hb hbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(hbVar, elapsedRealtime)) {
            return;
        }
        this.f51312i.put(hbVar, Long.valueOf(elapsedRealtime));
        qb.m.f44293a.execute(new com.google.android.gms.internal.cast.p(this, vfVar.zza(), hbVar, c(), 8));
    }

    public final String c() {
        Task task = this.f51309e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16554c.a(this.f51311g);
    }

    public final boolean d(hb hbVar, long j3) {
        HashMap hashMap = this.f51312i;
        if (hashMap.get(hbVar) == null || j3 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
