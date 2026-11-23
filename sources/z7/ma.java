package z7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ma {
    public static va f61709j;
    public static final ab f61710k;
    public final String f61711a;
    public final String f61712b;
    public final la f61713c;
    public final pb.k d;
    public final Task f61714e;
    public final Task f61715f;
    public final String f61716g;
    public final int h;
    public final HashMap f61717i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f61710k = new ab(objArr);
    }

    public ma(Context context, pb.k kVar, la laVar) {
        int i7;
        new HashMap();
        this.f61711a = context.getPackageName();
        this.f61712b = pb.c.a(context);
        this.d = kVar;
        this.f61713c = laVar;
        qa.b();
        this.f61716g = "vision-common";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 9);
        a10.getClass();
        this.f61714e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.pa paVar = new a8.pa(kVar, 4);
        a11.getClass();
        this.f61715f = pb.f.b(paVar);
        ab abVar = f61710k;
        if (abVar.containsKey("vision-common")) {
            i7 = b7.f.d(context, (String) abVar.get("vision-common"), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
