package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class xf {
    public static m f54217k;
    public static final r f54218l;
    public final String f54219a;
    public final String f54220b;
    public final vf f54221c;
    public final qb.k d;
    public final Task f54222e;
    public final Task f54223f;
    public final String f54224g;
    public final int h;
    public final HashMap f54225i = new HashMap();
    public final HashMap f54226j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f54218l = new r(objArr);
    }

    public xf(Context context, qb.k kVar, vf vfVar) {
        int i10;
        this.f54219a = context.getPackageName();
        this.f54220b = qb.c.a(context);
        this.d = kVar;
        this.f54221c = vfVar;
        ag.b();
        this.f54224g = "subject-segmentation";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 10);
        a2.getClass();
        this.f54222e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f54223f = qb.f.b(pVar);
        r rVar = f54218l;
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
        this.f54225i.put(hbVar, Long.valueOf(elapsedRealtime));
        qb.m.f46169a.execute(new com.google.android.gms.internal.cast.p(this, wfVar.zza(), hbVar, c(), 8));
    }

    public final String c() {
        Task task = this.f54222e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16713c.a(this.f54224g);
    }

    public final boolean d(hb hbVar, long j3) {
        HashMap hashMap = this.f54225i;
        if (hashMap.get(hbVar) == null || j3 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
