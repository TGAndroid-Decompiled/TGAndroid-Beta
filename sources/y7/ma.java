package y7;

import android.content.Context;
import b8.dg;
import b8.eg;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ma {
    public static va f59216j;
    public static final ab f59217k;
    public final String f59218a;
    public final String f59219b;
    public final la f59220c;
    public final mb.k d;
    public final Task f59221e;
    public final Task f59222f;
    public final String f59223g;
    public final int h;
    public final HashMap f59224i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f59217k = new ab(objArr);
    }

    public ma(Context context, mb.k kVar, la laVar) {
        int i3;
        new HashMap();
        this.f59218a = context.getPackageName();
        this.f59219b = mb.c.a(context);
        this.d = kVar;
        this.f59220c = laVar;
        qa.b();
        this.f59223g = "vision-common";
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 7);
        a10.getClass();
        this.f59221e = mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        kVar.getClass();
        eg egVar = new eg(kVar, 3);
        a11.getClass();
        this.f59222f = mb.f.b(egVar);
        ab abVar = f59217k;
        if (abVar.containsKey("vision-common")) {
            i3 = a7.f.d(context, (String) abVar.get("vision-common"), false);
        } else {
            i3 = -1;
        }
        this.h = i3;
    }
}
