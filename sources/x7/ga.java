package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class ga {
    public static s f53184k;
    public static final x f53185l;
    public final String f53186a;
    public final String f53187b;
    public final da f53188c;
    public final jb.k d;
    public final Task e;
    public final Task f53189f;
    public final String f53190g;
    public final int h;
    public final HashMap f53191i = new HashMap();
    public final HashMap f53192j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f53185l = new x(objArr);
    }

    public ga(Context context, jb.k kVar, da daVar) {
        int i10;
        this.f53186a = context.getPackageName();
        this.f53187b = jb.c.a(context);
        this.d = kVar;
        this.f53188c = daVar;
        ja.b();
        this.f53190g = "play-services-mlkit-image-labeling";
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 8);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f53189f = jb.f.b(pVar);
        x xVar = f53185l;
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
        return n6.i.f13600c.a(this.f53190g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.f53191i;
        if (hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
