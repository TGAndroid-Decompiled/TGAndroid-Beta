package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f50761k;
    public static final x f50762l;
    public final String f50763a;
    public final String f50764b;
    public final ca f50765c;
    public final qb.k d;
    public final Task f50766e;
    public final Task f50767f;
    public final String f50768g;
    public final int h;
    public final HashMap f50769i = new HashMap();
    public final HashMap f50770j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f50762l = new x(objArr);
    }

    public fa(Context context, qb.k kVar, ca caVar) {
        int i10;
        this.f50763a = context.getPackageName();
        this.f50764b = qb.c.a(context);
        this.d = kVar;
        this.f50765c = caVar;
        ja.b();
        this.f50768g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 9);
        a2.getClass();
        this.f50766e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f50767f = qb.f.b(pVar);
        x xVar2 = f50762l;
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
        Task task = this.f50766e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16667c.a(this.f50768g);
    }

    public final boolean c(o7 o7Var, long j3) {
        HashMap hashMap = this.f50769i;
        if (hashMap.get(o7Var) == null || j3 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
