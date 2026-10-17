package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f48252j;
    public static final d f48253k;
    public final String f48254a;
    public final String f48255b;
    public final w8 f48256c;
    public final rb.k d;
    public final Task e;
    public final Task f48257f;
    public final String f48258g;
    public final int h;
    public final HashMap f48259i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48253k = new d(objArr);
    }

    public y8(Context context, rb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f48254a = context.getPackageName();
        this.f48255b = rb.c.a(context);
        this.d = kVar;
        this.f48256c = w8Var;
        d9.b();
        this.f48258g = str;
        rb.f a2 = rb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f48257f = rb.f.b(pVar);
        d dVar = f48253k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
