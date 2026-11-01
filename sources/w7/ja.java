package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ja {
    public static sa f52621j;
    public static final xa f52622k;
    public final String f52623a;
    public final String f52624b;
    public final ia f52625c;
    public final jb.k d;
    public final Task e;
    public final Task f52626f;
    public final String f52627g;
    public final int h;
    public final HashMap f52628i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f52622k = new xa(objArr);
    }

    public ja(Context context, jb.k kVar, ia iaVar) {
        int i10;
        new HashMap();
        this.f52623a = context.getPackageName();
        this.f52624b = jb.c.a(context);
        this.d = kVar;
        this.f52625c = iaVar;
        na.b();
        this.f52627g = "vision-common";
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 6);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f52626f = jb.f.b(pVar);
        xa xaVar = f52622k;
        if (xaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) xaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
