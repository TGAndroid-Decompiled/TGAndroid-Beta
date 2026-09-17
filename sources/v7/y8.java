package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f44211j;
    public static final d f44212k;
    public final String f44213a;
    public final String f44214b;
    public final w8 f44215c;
    public final qb.k d;
    public final Task e;
    public final Task f44216f;
    public final String f44217g;
    public final int h;
    public final HashMap f44218i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f44212k = new d(objArr);
    }

    public y8(Context context, qb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f44213a = context.getPackageName();
        this.f44214b = qb.c.a(context);
        this.d = kVar;
        this.f44215c = w8Var;
        d9.b();
        this.f44217g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f44216f = qb.f.b(pVar);
        d dVar = f44212k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
