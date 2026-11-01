package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class xf {
    public static m f55181k;
    public static final r f55182l;
    public final String f55183a;
    public final String f55184b;
    public final vf f55185c;
    public final jb.k d;
    public final Task e;
    public final Task f55186f;
    public final String f55187g;
    public final int h;
    public final HashMap f55188i = new HashMap();
    public final HashMap f55189j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f55182l = new r(objArr);
    }

    public xf(Context context, jb.k kVar, vf vfVar) {
        int i10;
        this.f55183a = context.getPackageName();
        this.f55184b = jb.c.a(context);
        this.d = kVar;
        this.f55185c = vfVar;
        ag.b();
        this.f55187g = "subject-segmentation";
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 10);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f55186f = jb.f.b(pVar);
        r rVar = f55182l;
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

    public final void b(wf wfVar, hb hbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(hbVar, elapsedRealtime)) {
            return;
        }
        this.f55188i.put(hbVar, Long.valueOf(elapsedRealtime));
        jb.m.f9798a.execute(new com.google.android.gms.internal.cast.o(this, wfVar.zza(), hbVar, c(), 8));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f13600c.a(this.f55187g);
    }

    public final boolean d(hb hbVar, long j10) {
        HashMap hashMap = this.f55188i;
        if (hashMap.get(hbVar) == null || j10 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
