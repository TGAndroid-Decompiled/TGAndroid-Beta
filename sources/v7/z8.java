package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class z8 {
    public static k9 f44479j;
    public static final d f44480k;
    public final String f44481a;
    public final String f44482b;
    public final x8 f44483c;
    public final qb.k d;
    public final Task e;
    public final Task f44484f;
    public final String f44485g;
    public final int h;
    public final HashMap f44486i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f44480k = new d(objArr);
    }

    public z8(Context context, qb.k kVar, x8 x8Var, String str) {
        int i10;
        new HashMap();
        this.f44481a = context.getPackageName();
        this.f44482b = qb.c.a(context);
        this.d = kVar;
        this.f44483c = x8Var;
        e9.b();
        this.f44485g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f44484f = qb.f.b(pVar);
        d dVar = f44480k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
