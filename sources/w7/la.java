package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f48753j;
    public static final za f48754k;
    public final String f48755a;
    public final String f48756b;
    public final ka f48757c;
    public final qb.k d;
    public final Task f48758e;
    public final Task f48759f;
    public final String f48760g;
    public final int h;
    public final HashMap f48761i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48754k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f48755a = context.getPackageName();
        this.f48756b = qb.c.a(context);
        this.d = kVar;
        this.f48757c = kaVar;
        pa.b();
        this.f48760g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.f48758e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f48759f = qb.f.b(pVar);
        za zaVar = f48754k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
