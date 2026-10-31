package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class ga {
    public static s f53166k;
    public static final x f53167l;
    public final String f53168a;
    public final String f53169b;
    public final da f53170c;
    public final jb.k d;
    public final Task e;
    public final Task f53171f;
    public final String f53172g;
    public final int h;
    public final HashMap f53173i = new HashMap();
    public final HashMap f53174j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f53167l = new x(objArr);
    }

    public ga(Context context, jb.k kVar, da daVar) {
        int i10;
        this.f53168a = context.getPackageName();
        this.f53169b = jb.c.a(context);
        this.d = kVar;
        this.f53170c = daVar;
        ja.b();
        this.f53172g = "play-services-mlkit-image-labeling";
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 8);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f53171f = jb.f.b(pVar);
        x xVar = f53167l;
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
        return n6.i.f13599c.a(this.f53172g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.f53173i;
        if (hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
