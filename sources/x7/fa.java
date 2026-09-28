package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f45698k;
    public static final x f45699l;
    public final String f45700a;
    public final String f45701b;
    public final ca f45702c;
    public final qb.k d;
    public final Task e;
    public final Task f45703f;
    public final String f45704g;
    public final int h;
    public final HashMap f45705i = new HashMap();
    public final HashMap f45706j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f45699l = new x(objArr);
    }

    public fa(Context context, qb.k kVar, ca caVar) {
        int i10;
        this.f45700a = context.getPackageName();
        this.f45701b = qb.c.a(context);
        this.d = kVar;
        this.f45702c = caVar;
        ia.b();
        this.f45704g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 9);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f45703f = qb.f.b(pVar);
        x xVar2 = f45699l;
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
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f15276c.a(this.f45704g);
    }

    public final boolean c(o7 o7Var, long j3) {
        HashMap hashMap = this.f45705i;
        if (hashMap.get(o7Var) == null || j3 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
