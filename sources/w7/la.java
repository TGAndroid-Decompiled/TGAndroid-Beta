package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f47360j;
    public static final za f47361k;
    public final String f47362a;
    public final String f47363b;
    public final ka f47364c;
    public final rb.k d;
    public final Task e;
    public final Task f47365f;
    public final String f47366g;
    public final int h;
    public final HashMap f47367i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f47361k = new za(objArr);
    }

    public la(Context context, rb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f47362a = context.getPackageName();
        this.f47363b = rb.c.a(context);
        this.d = kVar;
        this.f47364c = kaVar;
        pa.b();
        this.f47366g = "vision-common";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 6);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f47365f = rb.f.b(pVar);
        za zaVar = f47361k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
