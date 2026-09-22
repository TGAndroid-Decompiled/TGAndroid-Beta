package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class ga {
    public static s f45745k;
    public static final x f45746l;
    public final String f45747a;
    public final String f45748b;
    public final da f45749c;
    public final qb.k d;
    public final Task e;
    public final Task f45750f;
    public final String f45751g;
    public final int h;
    public final HashMap f45752i = new HashMap();
    public final HashMap f45753j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f45746l = new x(objArr);
    }

    public ga(Context context, qb.k kVar, da daVar) {
        int i10;
        this.f45747a = context.getPackageName();
        this.f45748b = qb.c.a(context);
        this.d = kVar;
        this.f45749c = daVar;
        ja.b();
        this.f45751g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.w wVar = new c5.w(this, 9);
        a2.getClass();
        this.e = qb.f.b(wVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f45750f = qb.f.b(pVar);
        x xVar = f45746l;
        if (xVar.containsKey("play-services-mlkit-image-labeling")) {
            i10 = y6.e.d(context, (String) xVar.get("play-services-mlkit-image-labeling"), false);
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
        return n6.i.f15284c.a(this.f45751g);
    }

    public final boolean c(p7 p7Var, long j3) {
        HashMap hashMap = this.f45752i;
        if (hashMap.get(p7Var) == null || j3 - ((Long) hashMap.get(p7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
