package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f48991k;
    public static final x f48992l;
    public final String f48993a;
    public final String f48994b;
    public final ca f48995c;
    public final qb.k d;
    public final Task f48996e;
    public final Task f48997f;
    public final String f48998g;
    public final int h;
    public final HashMap f48999i = new HashMap();
    public final HashMap f49000j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48992l = new x(objArr);
    }

    public fa(Context context, qb.k kVar, ca caVar) {
        int i10;
        this.f48993a = context.getPackageName();
        this.f48994b = qb.c.a(context);
        this.d = kVar;
        this.f48995c = caVar;
        ia.b();
        this.f48998g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 9);
        a2.getClass();
        this.f48996e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f48997f = qb.f.b(pVar);
        x xVar2 = f48992l;
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
        Task task = this.f48996e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16554c.a(this.f48998g);
    }

    public final boolean c(o7 o7Var, long j3) {
        HashMap hashMap = this.f48999i;
        if (hashMap.get(o7Var) == null || j3 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
