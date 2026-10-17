package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class yf {
    public static m f51283k;
    public static final r f51284l;
    public final String f51285a;
    public final String f51286b;
    public final wf f51287c;
    public final rb.k d;
    public final Task e;
    public final Task f51288f;
    public final String f51289g;
    public final int h;
    public final HashMap f51290i = new HashMap();
    public final HashMap f51291j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f51284l = new r(objArr);
    }

    public yf(Context context, rb.k kVar, wf wfVar) {
        int i10;
        this.f51285a = context.getPackageName();
        this.f51286b = rb.c.a(context);
        this.d = kVar;
        this.f51287c = wfVar;
        bg.b();
        this.f51289g = "subject-segmentation";
        rb.f a2 = rb.f.a();
        c5.x xVar = new c5.x(this, 10);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f51288f = rb.f.b(pVar);
        r rVar = f51284l;
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

    public final void b(xf xfVar, jb jbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(jbVar, elapsedRealtime)) {
            return;
        }
        this.f51290i.put(jbVar, Long.valueOf(elapsedRealtime));
        rb.m.f45225a.execute(new com.google.android.gms.internal.cast.p(this, xfVar.zza(), jbVar, c(), 8));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f17193c.a(this.f51289g);
    }

    public final boolean d(jb jbVar, long j10) {
        HashMap hashMap = this.f51290i;
        if (hashMap.get(jbVar) == null || j10 - ((Long) hashMap.get(jbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
