package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f48747j;
    public static final za f48748k;
    public final String f48749a;
    public final String f48750b;
    public final ka f48751c;
    public final rb.k d;
    public final Task e;
    public final Task f48752f;
    public final String f48753g;
    public final int h;
    public final HashMap f48754i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48748k = new za(objArr);
    }

    public la(Context context, rb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f48749a = context.getPackageName();
        this.f48750b = rb.c.a(context);
        this.d = kVar;
        this.f48751c = kaVar;
        pa.b();
        this.f48753g = "vision-common";
        rb.f a2 = rb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f48752f = rb.f.b(pVar);
        za zaVar = f48748k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
