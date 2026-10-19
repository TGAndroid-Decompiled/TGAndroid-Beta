package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class la {
    public static ua f48748j;
    public static final za f48749k;
    public final String f48750a;
    public final String f48751b;
    public final ka f48752c;
    public final rb.k d;
    public final Task e;
    public final Task f48753f;
    public final String f48754g;
    public final int h;
    public final HashMap f48755i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f48749k = new za(objArr);
    }

    public la(Context context, rb.k kVar, ka kaVar) {
        int i10;
        new HashMap();
        this.f48750a = context.getPackageName();
        this.f48751b = rb.c.a(context);
        this.d = kVar;
        this.f48752c = kaVar;
        pa.b();
        this.f48754g = "vision-common";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 6);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f48753f = rb.f.b(pVar);
        za zaVar = f48749k;
        if (zaVar.containsKey("vision-common")) {
            i10 = y6.e.d(context, (String) zaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
