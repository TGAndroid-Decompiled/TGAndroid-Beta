package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f48147j;
    public static final d f48148k;
    public final String f48149a;
    public final String f48150b;
    public final w8 f48151c;
    public final qb.k d;
    public final Task f48152e;
    public final Task f48153f;
    public final String f48154g;
    public final int h;
    public final HashMap f48155i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48148k = new d(objArr);
    }

    public y8(Context context, qb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f48149a = context.getPackageName();
        this.f48150b = qb.c.a(context);
        this.d = kVar;
        this.f48151c = w8Var;
        d9.b();
        this.f48154g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.f48152e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f48153f = qb.f.b(pVar);
        d dVar = f48148k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
