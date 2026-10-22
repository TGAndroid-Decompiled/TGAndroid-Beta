package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f48756j;
    public static final za f48757k;
    public final String f48758a;
    public final String f48759b;
    public final ka f48760c;
    public final rb.k d;
    public final Task e;
    public final Task f48761f;
    public final String f48762g;
    public final int h;
    public final HashMap f48763i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48757k = new za(objArr);
    }

    public la(Context context, rb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f48758a = context.getPackageName();
        this.f48759b = rb.c.a(context);
        this.d = kVar;
        this.f48760c = kaVar;
        pa.b();
        this.f48762g = "vision-common";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 6);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f48761f = rb.f.b(pVar);
        za zaVar = f48757k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
