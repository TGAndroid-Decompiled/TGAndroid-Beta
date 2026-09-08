package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f48236j;
    public static final za f48237k;
    public final String f48238a;
    public final String f48239b;
    public final ka f48240c;
    public final qb.k d;
    public final Task f48241e;
    public final Task f48242f;
    public final String f48243g;
    public final int h;
    public final HashMap f48244i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48237k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f48238a = context.getPackageName();
        this.f48239b = qb.c.a(context);
        this.d = kVar;
        this.f48240c = kaVar;
        pa.b();
        this.f48243g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.f48241e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f48242f = qb.f.b(pVar);
        za zaVar = f48237k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
