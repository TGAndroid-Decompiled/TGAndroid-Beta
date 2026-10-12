package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f46845j;
    public static final d f46846k;
    public final String f46847a;
    public final String f46848b;
    public final w8 f46849c;
    public final rb.k d;
    public final Task e;
    public final Task f46850f;
    public final String f46851g;
    public final int h;
    public final HashMap f46852i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f46846k = new d(objArr);
    }

    public y8(Context context, rb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f46847a = context.getPackageName();
        this.f46848b = rb.c.a(context);
        this.d = kVar;
        this.f46849c = w8Var;
        d9.b();
        this.f46851g = str;
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 5);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f46850f = rb.f.b(pVar);
        d dVar = f46846k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
