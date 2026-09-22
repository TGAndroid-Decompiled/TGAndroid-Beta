package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f44750j;
    public static final za f44751k;
    public final String f44752a;
    public final String f44753b;
    public final ka f44754c;
    public final qb.k d;
    public final Task e;
    public final Task f44755f;
    public final String f44756g;
    public final int h;
    public final HashMap f44757i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f44751k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f44752a = context.getPackageName();
        this.f44753b = qb.c.a(context);
        this.d = kVar;
        this.f44754c = kaVar;
        pa.b();
        this.f44756g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f44755f = qb.f.b(pVar);
        za zaVar = f44751k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
