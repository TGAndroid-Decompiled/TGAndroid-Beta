package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f49487k;
    public static final x f49488l;
    public final String f49489a;
    public final String f49490b;
    public final ca f49491c;
    public final qb.k d;
    public final Task f49492e;
    public final Task f49493f;
    public final String f49494g;
    public final int h;
    public final HashMap f49495i = new HashMap();
    public final HashMap f49496j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f49488l = new x(objArr);
    }

    public fa(Context context, qb.k kVar, ca caVar) {
        int i10;
        this.f49489a = context.getPackageName();
        this.f49490b = qb.c.a(context);
        this.d = kVar;
        this.f49491c = caVar;
        ia.b();
        this.f49494g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 9);
        a2.getClass();
        this.f49492e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f49493f = qb.f.b(pVar);
        x xVar2 = f49488l;
        if (xVar2.containsKey("play-services-mlkit-image-labeling")) {
            i10 = y6.e.d(context, (String) xVar2.get("play-services-mlkit-image-labeling"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.f49492e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16707c.a(this.f49494g);
    }

    public final boolean c(o7 o7Var, long j3) {
        HashMap hashMap = this.f49495i;
        if (hashMap.get(o7Var) == null || j3 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
