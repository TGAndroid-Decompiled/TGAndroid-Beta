package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f49382k;
    public static final x f49383l;
    public final String f49384a;
    public final String f49385b;
    public final ca f49386c;
    public final rb.k d;
    public final Task e;
    public final Task f49387f;
    public final String f49388g;
    public final int h;
    public final HashMap f49389i = new HashMap();
    public final HashMap f49390j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f49383l = new x(objArr);
    }

    public fa(Context context, rb.k kVar, ca caVar) {
        int i10;
        this.f49384a = context.getPackageName();
        this.f49385b = rb.c.a(context);
        this.d = kVar;
        this.f49386c = caVar;
        ia.b();
        this.f49388g = "play-services-mlkit-image-labeling";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 8);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f49387f = rb.f.b(pVar);
        x xVar = f49383l;
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
        return n6.i.f17198c.a(this.f49388g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.f49389i;
        if (hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
