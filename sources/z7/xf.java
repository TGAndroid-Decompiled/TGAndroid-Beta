package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class xf {
    public static m f51244k;
    public static final r f51245l;
    public final String f51246a;
    public final String f51247b;
    public final vf f51248c;
    public final rb.k d;
    public final Task e;
    public final Task f51249f;
    public final String f51250g;
    public final int h;
    public final HashMap f51251i = new HashMap();
    public final HashMap f51252j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f51245l = new r(objArr);
    }

    public xf(Context context, rb.k kVar, vf vfVar) {
        int i10;
        this.f51246a = context.getPackageName();
        this.f51247b = rb.c.a(context);
        this.d = kVar;
        this.f51248c = vfVar;
        ag.b();
        this.f51250g = "subject-segmentation";
        rb.f a2 = rb.f.a();
        c5.x xVar = new c5.x(this, 10);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f51249f = rb.f.b(pVar);
        r rVar = f51245l;
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

    public final void b(wf wfVar, ib ibVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(ibVar, elapsedRealtime)) {
            return;
        }
        this.f51251i.put(ibVar, Long.valueOf(elapsedRealtime));
        rb.m.f45199a.execute(new com.google.android.gms.internal.cast.p(this, wfVar.zza(), ibVar, c(), 8));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f17196c.a(this.f51250g);
    }

    public final boolean d(ib ibVar, long j10) {
        HashMap hashMap = this.f51251i;
        if (hashMap.get(ibVar) == null || j10 - ((Long) hashMap.get(ibVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
