package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f44138j;
    public static final d f44139k;
    public final String f44140a;
    public final String f44141b;
    public final w8 f44142c;
    public final qb.k d;
    public final Task e;
    public final Task f44143f;
    public final String f44144g;
    public final int h;
    public final HashMap f44145i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f44139k = new d(objArr);
    }

    public y8(Context context, qb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f44140a = context.getPackageName();
        this.f44141b = qb.c.a(context);
        this.d = kVar;
        this.f44142c = w8Var;
        d9.b();
        this.f44144g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f44143f = qb.f.b(pVar);
        d dVar = f44139k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
