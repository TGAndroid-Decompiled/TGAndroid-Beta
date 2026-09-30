package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f45144j;
    public static final za f45145k;
    public final String f45146a;
    public final String f45147b;
    public final ka f45148c;
    public final qb.k d;
    public final Task e;
    public final Task f45149f;
    public final String f45150g;
    public final int h;
    public final HashMap f45151i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f45145k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f45146a = context.getPackageName();
        this.f45147b = qb.c.a(context);
        this.d = kVar;
        this.f45148c = kaVar;
        pa.b();
        this.f45150g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f45149f = qb.f.b(pVar);
        za zaVar = f45145k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
