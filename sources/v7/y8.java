package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class y8 {
    public static j9 f48678j;
    public static final d f48679k;
    public final String f48680a;
    public final String f48681b;
    public final w8 f48682c;
    public final rb.k d;
    public final Task e;
    public final Task f48683f;
    public final String f48684g;
    public final int h;
    public final HashMap f48685i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48679k = new d(objArr);
    }

    public y8(Context context, rb.k kVar, w8 w8Var, String str) {
        int i10;
        new HashMap();
        this.f48680a = context.getPackageName();
        this.f48681b = rb.c.a(context);
        this.d = kVar;
        this.f48682c = w8Var;
        d9.b();
        this.f48684g = str;
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 5);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f48683f = rb.f.b(pVar);
        d dVar = f48679k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
