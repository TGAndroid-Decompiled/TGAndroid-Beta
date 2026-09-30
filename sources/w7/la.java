package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f45038j;
    public static final za f45039k;
    public final String f45040a;
    public final String f45041b;
    public final ka f45042c;
    public final qb.k d;
    public final Task e;
    public final Task f45043f;
    public final String f45044g;
    public final int h;
    public final HashMap f45045i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f45039k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f45040a = context.getPackageName();
        this.f45041b = qb.c.a(context);
        this.d = kVar;
        this.f45042c = kaVar;
        pa.b();
        this.f45044g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f45043f = qb.f.b(pVar);
        za zaVar = f45039k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
