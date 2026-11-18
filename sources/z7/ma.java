package z7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ma {
    public static va f61663j;
    public static final ab f61664k;
    public final String f61665a;
    public final String f61666b;
    public final la f61667c;
    public final pb.k d;
    public final Task f61668e;
    public final Task f61669f;
    public final String f61670g;
    public final int h;
    public final HashMap f61671i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f61664k = new ab(objArr);
    }

    public ma(Context context, pb.k kVar, la laVar) {
        int i7;
        new HashMap();
        this.f61665a = context.getPackageName();
        this.f61666b = pb.c.a(context);
        this.d = kVar;
        this.f61667c = laVar;
        qa.b();
        this.f61670g = "vision-common";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 9);
        a10.getClass();
        this.f61668e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.pa paVar = new a8.pa(kVar, 4);
        a11.getClass();
        this.f61669f = pb.f.b(paVar);
        ab abVar = f61664k;
        if (abVar.containsKey("vision-common")) {
            i7 = b7.f.d(context, (String) abVar.get("vision-common"), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
