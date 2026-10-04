package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f49472k;
    public static final x f49473l;
    public final String f49474a;
    public final String f49475b;
    public final ca f49476c;
    public final qb.k d;
    public final Task f49477e;
    public final Task f49478f;
    public final String f49479g;
    public final int h;
    public final HashMap f49480i = new HashMap();
    public final HashMap f49481j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f49473l = new x(objArr);
    }

    public fa(Context context, qb.k kVar, ca caVar) {
        int i10;
        this.f49474a = context.getPackageName();
        this.f49475b = qb.c.a(context);
        this.d = kVar;
        this.f49476c = caVar;
        ia.b();
        this.f49479g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 9);
        a2.getClass();
        this.f49477e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f49478f = qb.f.b(pVar);
        x xVar2 = f49473l;
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
        Task task = this.f49477e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16698c.a(this.f49479g);
    }

    public final boolean c(o7 o7Var, long j3) {
        HashMap hashMap = this.f49480i;
        if (hashMap.get(o7Var) == null || j3 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
