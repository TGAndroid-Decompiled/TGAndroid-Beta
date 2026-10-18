package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class fa {
    public static s f49423k;
    public static final x f49424l;
    public final String f49425a;
    public final String f49426b;
    public final ca f49427c;
    public final rb.k d;
    public final Task e;
    public final Task f49428f;
    public final String f49429g;
    public final int h;
    public final HashMap f49430i = new HashMap();
    public final HashMap f49431j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f49424l = new x(objArr);
    }

    public fa(Context context, rb.k kVar, ca caVar) {
        int i10;
        this.f49425a = context.getPackageName();
        this.f49426b = rb.c.a(context);
        this.d = kVar;
        this.f49427c = caVar;
        ia.b();
        this.f49429g = "play-services-mlkit-image-labeling";
        rb.f a2 = rb.f.a();
        c5.x xVar = new c5.x(this, 8);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f49428f = rb.f.b(pVar);
        x xVar2 = f49424l;
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
        return n6.i.f17200c.a(this.f49429g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.f49430i;
        if (hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
