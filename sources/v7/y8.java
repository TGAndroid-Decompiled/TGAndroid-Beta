package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f47695j;
    public static final d f47696k;
    public final String f47697a;
    public final String f47698b;
    public final w8 f47699c;
    public final qb.k d;
    public final Task f47700e;
    public final Task f47701f;
    public final String f47702g;
    public final int h;
    public final HashMap f47703i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f47696k = new d(objArr);
    }

    public y8(Context context, qb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f47697a = context.getPackageName();
        this.f47698b = qb.c.a(context);
        this.d = kVar;
        this.f47699c = w8Var;
        d9.b();
        this.f47702g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.f47700e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f47701f = qb.f.b(pVar);
        d dVar = f47696k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
