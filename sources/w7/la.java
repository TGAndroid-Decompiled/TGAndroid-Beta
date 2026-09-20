package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f45053j;
    public static final za f45054k;
    public final String f45055a;
    public final String f45056b;
    public final ka f45057c;
    public final qb.k d;
    public final Task e;
    public final Task f45058f;
    public final String f45059g;
    public final int h;
    public final HashMap f45060i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f45054k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f45055a = context.getPackageName();
        this.f45056b = qb.c.a(context);
        this.d = kVar;
        this.f45057c = kaVar;
        pa.b();
        this.f45059g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f45058f = qb.f.b(pVar);
        za zaVar = f45054k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
