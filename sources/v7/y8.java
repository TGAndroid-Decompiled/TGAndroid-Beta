package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f47694j;
    public static final d f47695k;
    public final String f47696a;
    public final String f47697b;
    public final w8 f47698c;
    public final qb.k d;
    public final Task f47699e;
    public final Task f47700f;
    public final String f47701g;
    public final int h;
    public final HashMap f47702i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f47695k = new d(objArr);
    }

    public y8(Context context, qb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f47696a = context.getPackageName();
        this.f47697b = qb.c.a(context);
        this.d = kVar;
        this.f47698c = w8Var;
        d9.b();
        this.f47701g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.f47699e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f47700f = qb.f.b(pVar);
        d dVar = f47695k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
