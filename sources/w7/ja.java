package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ja {
    public static sa f52603j;
    public static final xa f52604k;
    public final String f52605a;
    public final String f52606b;
    public final ia f52607c;
    public final jb.k d;
    public final Task e;
    public final Task f52608f;
    public final String f52609g;
    public final int h;
    public final HashMap f52610i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f52604k = new xa(objArr);
    }

    public ja(Context context, jb.k kVar, ia iaVar) {
        int i10;
        new HashMap();
        this.f52605a = context.getPackageName();
        this.f52606b = jb.c.a(context);
        this.d = kVar;
        this.f52607c = iaVar;
        na.b();
        this.f52609g = "vision-common";
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 6);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f52608f = jb.f.b(pVar);
        xa xaVar = f52604k;
        if (xaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) xaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
