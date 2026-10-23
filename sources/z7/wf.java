package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class wf {
    public static m f51700k;
    public static final r f51701l;
    public final String f51702a;
    public final String f51703b;
    public final uf f51704c;
    public final rb.k d;
    public final Task e;
    public final Task f51705f;
    public final String f51706g;
    public final int h;
    public final HashMap f51707i = new HashMap();
    public final HashMap f51708j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f51701l = new r(objArr);
    }

    public wf(Context context, rb.k kVar, uf ufVar) {
        int i10;
        this.f51702a = context.getPackageName();
        this.f51703b = rb.c.a(context);
        this.d = kVar;
        this.f51704c = ufVar;
        ag.b();
        this.f51706g = "subject-segmentation";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 10);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f51705f = rb.f.b(pVar);
        r rVar = f51701l;
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
        this.f51707i.put(hbVar, Long.valueOf(elapsedRealtime));
        rb.m.f45623a.execute(new com.google.android.gms.internal.cast.p(this, vfVar.zza(), hbVar, c(), 8));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f17261c.a(this.f51706g);
    }

    public final boolean d(hb hbVar, long j10) {
        HashMap hashMap = this.f51707i;
        if (hashMap.get(hbVar) == null || j10 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
