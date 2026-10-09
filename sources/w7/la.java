package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f50057j;
    public static final za f50058k;
    public final String f50059a;
    public final String f50060b;
    public final ka f50061c;
    public final qb.k d;
    public final Task f50062e;
    public final Task f50063f;
    public final String f50064g;
    public final int h;
    public final HashMap f50065i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f50058k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f50059a = context.getPackageName();
        this.f50060b = qb.c.a(context);
        this.d = kVar;
        this.f50061c = kaVar;
        pa.b();
        this.f50064g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.f50062e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f50063f = qb.f.b(pVar);
        za zaVar = f50058k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
