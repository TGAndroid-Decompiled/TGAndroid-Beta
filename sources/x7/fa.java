package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f49398k;
    public static final x f49399l;
    public final String f49400a;
    public final String f49401b;
    public final ca f49402c;
    public final rb.k d;
    public final Task e;
    public final Task f49403f;
    public final String f49404g;
    public final int h;
    public final HashMap f49405i = new HashMap();
    public final HashMap f49406j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f49399l = new x(objArr);
    }

    public fa(Context context, rb.k kVar, ca caVar) {
        int i10;
        this.f49400a = context.getPackageName();
        this.f49401b = rb.c.a(context);
        this.d = kVar;
        this.f49402c = caVar;
        ia.b();
        this.f49404g = "play-services-mlkit-image-labeling";
        rb.f a2 = rb.f.a();
        c5.x xVar = new c5.x(this, 8);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f49403f = rb.f.b(pVar);
        x xVar2 = f49399l;
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
        return n6.i.f17193c.a(this.f49404g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.f49405i;
        if (hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
