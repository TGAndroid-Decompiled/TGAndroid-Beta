package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f50101j;
    public static final za f50102k;
    public final String f50103a;
    public final String f50104b;
    public final ka f50105c;
    public final qb.k d;
    public final Task f50106e;
    public final Task f50107f;
    public final String f50108g;
    public final int h;
    public final HashMap f50109i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f50102k = new za(objArr);
    }

    public la(Context context, qb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f50103a = context.getPackageName();
        this.f50104b = qb.c.a(context);
        this.d = kVar;
        this.f50105c = kaVar;
        pa.b();
        this.f50108g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.f50106e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f50107f = qb.f.b(pVar);
        za zaVar = f50102k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
