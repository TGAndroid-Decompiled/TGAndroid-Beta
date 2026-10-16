package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f47989k;
    public static final x f47990l;
    public final String f47991a;
    public final String f47992b;
    public final ca f47993c;
    public final rb.k d;
    public final Task e;
    public final Task f47994f;
    public final String f47995g;
    public final int h;
    public final HashMap f47996i = new HashMap();
    public final HashMap f47997j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f47990l = new x(objArr);
    }

    public fa(Context context, rb.k kVar, ca caVar) {
        int i10;
        this.f47991a = context.getPackageName();
        this.f47992b = rb.c.a(context);
        this.d = kVar;
        this.f47993c = caVar;
        ia.b();
        this.f47995g = "play-services-mlkit-image-labeling";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 8);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f47994f = rb.f.b(pVar);
        x xVar = f47990l;
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
        return n6.i.f15817c.a(this.f47995g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.f47996i;
        if (hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
