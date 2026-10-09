package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class z8 {
    public static j9 f49421j;
    public static final d f49422k;
    public final String f49423a;
    public final String f49424b;
    public final x8 f49425c;
    public final qb.k d;
    public final Task f49426e;
    public final Task f49427f;
    public final String f49428g;
    public final int h;
    public final HashMap f49429i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f49422k = new d(objArr);
    }

    public z8(Context context, qb.k kVar, x8 x8Var, String str) {
        int i10;
        new HashMap();
        this.f49423a = context.getPackageName();
        this.f49424b = qb.c.a(context);
        this.d = kVar;
        this.f49425c = x8Var;
        d9.b();
        this.f49428g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.f49426e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f49427f = qb.f.b(pVar);
        d dVar = f49422k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
