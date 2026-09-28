package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class z8 {
    public static k9 f44478j;
    public static final d f44479k;
    public final String f44480a;
    public final String f44481b;
    public final x8 f44482c;
    public final qb.k d;
    public final Task e;
    public final Task f44483f;
    public final String f44484g;
    public final int h;
    public final HashMap f44485i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f44479k = new d(objArr);
    }

    public z8(Context context, qb.k kVar, x8 x8Var, String str) {
        int i10;
        new HashMap();
        this.f44480a = context.getPackageName();
        this.f44481b = qb.c.a(context);
        this.d = kVar;
        this.f44482c = x8Var;
        e9.b();
        this.f44484g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f44483f = qb.f.b(pVar);
        d dVar = f44479k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
