package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class xf {
    public static m f51246k;
    public static final r f51247l;
    public final String f51248a;
    public final String f51249b;
    public final vf f51250c;
    public final rb.k d;
    public final Task e;
    public final Task f51251f;
    public final String f51252g;
    public final int h;
    public final HashMap f51253i = new HashMap();
    public final HashMap f51254j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f51247l = new r(objArr);
    }

    public xf(Context context, rb.k kVar, vf vfVar) {
        int i10;
        this.f51248a = context.getPackageName();
        this.f51249b = rb.c.a(context);
        this.d = kVar;
        this.f51250c = vfVar;
        ag.b();
        this.f51252g = "subject-segmentation";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 10);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f51251f = rb.f.b(pVar);
        r rVar = f51247l;
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
        this.f51253i.put(ibVar, Long.valueOf(elapsedRealtime));
        rb.m.f45199a.execute(new com.google.android.gms.internal.cast.p(this, wfVar.zza(), ibVar, c(), 8));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f17198c.a(this.f51252g);
    }

    public final boolean d(ib ibVar, long j10) {
        HashMap hashMap = this.f51253i;
        if (hashMap.get(ibVar) == null || j10 - ((Long) hashMap.get(ibVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
