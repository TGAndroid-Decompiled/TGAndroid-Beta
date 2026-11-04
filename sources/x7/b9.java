package x7;

import android.content.Context;
import b8.dg;
import b8.eg;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class b9 {
    public static k9 f58244j;
    public static final d f58245k;
    public final String f58246a;
    public final String f58247b;
    public final z8 f58248c;
    public final mb.k d;
    public final Task f58249e;
    public final Task f58250f;
    public final String f58251g;
    public final int h;
    public final HashMap f58252i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f58245k = new d(objArr);
    }

    public b9(Context context, mb.k kVar, z8 z8Var, String str) {
        int i3;
        new HashMap();
        this.f58246a = context.getPackageName();
        this.f58247b = mb.c.a(context);
        this.d = kVar;
        this.f58248c = z8Var;
        e9.b();
        this.f58251g = str;
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 6);
        a10.getClass();
        this.f58249e = mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        kVar.getClass();
        eg egVar = new eg(kVar, 2);
        a11.getClass();
        this.f58250f = mb.f.b(egVar);
        d dVar = f58245k;
        if (dVar.containsKey(str)) {
            i3 = a7.f.d(context, (String) dVar.get(str), false);
        } else {
            i3 = -1;
        }
        this.h = i3;
    }
}
