package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f50885k;
    public static final x f50886l;
    public final String f50887a;
    public final String f50888b;
    public final ca f50889c;
    public final qb.k d;
    public final Task f50890e;
    public final Task f50891f;
    public final String f50892g;
    public final int h;
    public final HashMap f50893i = new HashMap();
    public final HashMap f50894j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f50886l = new x(objArr);
    }

    public fa(Context context, qb.k kVar, ca caVar) {
        int i10;
        this.f50887a = context.getPackageName();
        this.f50888b = qb.c.a(context);
        this.d = kVar;
        this.f50889c = caVar;
        ja.b();
        this.f50892g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 9);
        a2.getClass();
        this.f50890e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f50891f = qb.f.b(pVar);
        x xVar2 = f50886l;
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
        Task task = this.f50890e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.f16749c.a(this.f50892g);
    }

    public final boolean c(o7 o7Var, long j3) {
        HashMap hashMap = this.f50893i;
        if (hashMap.get(o7Var) == null || j3 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
