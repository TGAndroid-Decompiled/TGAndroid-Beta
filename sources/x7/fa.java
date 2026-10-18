package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f49376k;
    public static final x f49377l;
    public final String f49378a;
    public final String f49379b;
    public final ca f49380c;
    public final rb.k d;
    public final Task e;
    public final Task f49381f;
    public final String f49382g;
    public final int h;
    public final HashMap f49383i = new HashMap();
    public final HashMap f49384j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f49377l = new x(objArr);
    }

    public fa(Context context, rb.k kVar, ca caVar) {
        int i10;
        this.f49378a = context.getPackageName();
        this.f49379b = rb.c.a(context);
        this.d = kVar;
        this.f49380c = caVar;
        ia.b();
        this.f49382g = "play-services-mlkit-image-labeling";
        rb.f a2 = rb.f.a();
        c5.x xVar = new c5.x(this, 8);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f49381f = rb.f.b(pVar);
        x xVar2 = f49377l;
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
        return n6.i.f17196c.a(this.f49382g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.f49383i;
        if (hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
