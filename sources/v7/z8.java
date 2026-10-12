package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class z8 {
    public static j9 f49657j;
    public static final d f49658k;
    public final String f49659a;
    public final String f49660b;
    public final x8 f49661c;
    public final qb.k d;
    public final Task f49662e;
    public final Task f49663f;
    public final String f49664g;
    public final int h;
    public final HashMap f49665i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f49658k = new d(objArr);
    }

    public z8(Context context, qb.k kVar, x8 x8Var, String str) {
        int i10;
        new HashMap();
        this.f49659a = context.getPackageName();
        this.f49660b = qb.c.a(context);
        this.d = kVar;
        this.f49661c = x8Var;
        d9.b();
        this.f49664g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.f49662e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f49663f = qb.f.b(pVar);
        d dVar = f49658k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
