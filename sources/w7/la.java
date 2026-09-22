package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f45073j;
    public static final za f45074k;
    public final String f45075a;
    public final String f45076b;
    public final ka f45077c;
    public final qb.k d;
    public final Task e;
    public final Task f45078f;
    public final String f45079g;
    public final int h;
    public final HashMap f45080i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f45074k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f45075a = context.getPackageName();
        this.f45076b = qb.c.a(context);
        this.d = kVar;
        this.f45077c = kaVar;
        pa.b();
        this.f45079g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.w wVar = new c5.w(this, 6);
        a2.getClass();
        this.e = qb.f.b(wVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f45078f = qb.f.b(pVar);
        za zaVar = f45074k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
