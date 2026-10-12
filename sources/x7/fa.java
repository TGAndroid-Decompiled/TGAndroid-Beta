package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f47990k;
    public static final x f47991l;
    public final String f47992a;
    public final String f47993b;
    public final ca f47994c;
    public final rb.k d;
    public final Task e;
    public final Task f47995f;
    public final String f47996g;
    public final int h;
    public final HashMap f47997i = new HashMap();
    public final HashMap f47998j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f47991l = new x(objArr);
    }

    public fa(Context context, rb.k kVar, ca caVar) {
        int i10;
        this.f47992a = context.getPackageName();
        this.f47993b = rb.c.a(context);
        this.d = kVar;
        this.f47994c = caVar;
        ia.b();
        this.f47996g = "play-services-mlkit-image-labeling";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 8);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f47995f = rb.f.b(pVar);
        x xVar = f47991l;
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
        return n6.i.f16101c.a(this.f47996g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.f47997i;
        if (hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
