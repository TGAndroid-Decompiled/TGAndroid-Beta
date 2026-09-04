package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f48990k;
    public static final x f48991l;
    public final String f48992a;
    public final String f48993b;
    public final ca f48994c;
    public final qb.k d;
    public final Task f48995e;
    public final Task f48996f;
    public final String f48997g;
    public final int h;
    public final HashMap f48998i = new HashMap();
    public final HashMap f48999j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48991l = new x(objArr);
    }

    public fa(Context context, qb.k kVar, ca caVar) {
        int i10;
        this.f48992a = context.getPackageName();
        this.f48993b = qb.c.a(context);
        this.d = kVar;
        this.f48994c = caVar;
        ia.b();
        this.f48997g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 9);
        a2.getClass();
        this.f48995e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f48996f = qb.f.b(pVar);
        x xVar2 = f48991l;
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
        Task task = this.f48995e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16554c.a(this.f48997g);
    }

    public final boolean c(o7 o7Var, long j3) {
        HashMap hashMap = this.f48998i;
        if (hashMap.get(o7Var) == null || j3 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
