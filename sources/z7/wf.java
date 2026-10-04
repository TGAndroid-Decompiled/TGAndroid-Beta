package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class wf {
    public static m f52982k;
    public static final r f52983l;
    public final String f52984a;
    public final String f52985b;
    public final uf f52986c;
    public final qb.k d;
    public final Task f52987e;
    public final Task f52988f;
    public final String f52989g;
    public final int h;
    public final HashMap f52990i = new HashMap();
    public final HashMap f52991j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f52983l = new r(objArr);
    }

    public wf(Context context, qb.k kVar, uf ufVar) {
        int i10;
        this.f52984a = context.getPackageName();
        this.f52985b = qb.c.a(context);
        this.d = kVar;
        this.f52986c = ufVar;
        zf.b();
        this.f52989g = "subject-segmentation";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 10);
        a2.getClass();
        this.f52987e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f52988f = qb.f.b(pVar);
        r rVar = f52983l;
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
        this.f52990i.put(hbVar, Long.valueOf(elapsedRealtime));
        qb.m.f44927a.execute(new com.google.android.gms.internal.cast.p(this, vfVar.zza(), hbVar, c(), 8));
    }

    public final String c() {
        Task task = this.f52987e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16702c.a(this.f52989g);
    }

    public final boolean d(hb hbVar, long j3) {
        HashMap hashMap = this.f52990i;
        if (hashMap.get(hbVar) == null || j3 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
