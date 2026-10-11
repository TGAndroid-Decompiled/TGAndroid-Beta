package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f50178j;
    public static final za f50179k;
    public final String f50180a;
    public final String f50181b;
    public final ka f50182c;
    public final qb.k d;
    public final Task f50183e;
    public final Task f50184f;
    public final String f50185g;
    public final int h;
    public final HashMap f50186i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f50179k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f50180a = context.getPackageName();
        this.f50181b = qb.c.a(context);
        this.d = kVar;
        this.f50182c = kaVar;
        pa.b();
        this.f50185g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.f50183e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f50184f = qb.f.b(pVar);
        za zaVar = f50179k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
