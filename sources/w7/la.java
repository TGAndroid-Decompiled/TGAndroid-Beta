package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f48769j;
    public static final za f48770k;
    public final String f48771a;
    public final String f48772b;
    public final ka f48773c;
    public final qb.k d;
    public final Task f48774e;
    public final Task f48775f;
    public final String f48776g;
    public final int h;
    public final HashMap f48777i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48770k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f48771a = context.getPackageName();
        this.f48772b = qb.c.a(context);
        this.d = kVar;
        this.f48773c = kaVar;
        pa.b();
        this.f48776g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.f48774e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f48775f = qb.f.b(pVar);
        za zaVar = f48770k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
