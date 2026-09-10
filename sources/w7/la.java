package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f43713j;
    public static final za f43714k;
    public final String f43715a;
    public final String f43716b;
    public final ka f43717c;
    public final qb.k d;
    public final Task e;
    public final Task f43718f;
    public final String f43719g;
    public final int h;
    public final HashMap f43720i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f43714k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f43715a = context.getPackageName();
        this.f43716b = qb.c.a(context);
        this.d = kVar;
        this.f43717c = kaVar;
        pa.b();
        this.f43719g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f43718f = qb.f.b(pVar);
        za zaVar = f43714k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
