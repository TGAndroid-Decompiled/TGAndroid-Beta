package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f48162j;
    public static final d f48163k;
    public final String f48164a;
    public final String f48165b;
    public final w8 f48166c;
    public final qb.k d;
    public final Task f48167e;
    public final Task f48168f;
    public final String f48169g;
    public final int h;
    public final HashMap f48170i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48163k = new d(objArr);
    }

    public y8(Context context, qb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f48164a = context.getPackageName();
        this.f48165b = qb.c.a(context);
        this.d = kVar;
        this.f48166c = w8Var;
        d9.b();
        this.f48169g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.f48167e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f48168f = qb.f.b(pVar);
        d dVar = f48163k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
