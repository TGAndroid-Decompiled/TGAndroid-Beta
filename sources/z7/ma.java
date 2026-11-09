package z7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ma {
    public static va f59901j;
    public static final ab f59902k;
    public final String f59903a;
    public final String f59904b;
    public final la f59905c;
    public final pb.k d;
    public final Task f59906e;
    public final Task f59907f;
    public final String f59908g;
    public final int h;
    public final HashMap f59909i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f59902k = new ab(objArr);
    }

    public ma(Context context, pb.k kVar, la laVar) {
        int i7;
        new HashMap();
        this.f59903a = context.getPackageName();
        this.f59904b = pb.c.a(context);
        this.d = kVar;
        this.f59905c = laVar;
        qa.b();
        this.f59908g = "vision-common";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 9);
        a10.getClass();
        this.f59906e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.oa oaVar = new a8.oa(kVar, 4);
        a11.getClass();
        this.f59907f = pb.f.b(oaVar);
        ab abVar = f59902k;
        if (abVar.containsKey("vision-common")) {
            i7 = b7.f.d(context, (String) abVar.get("vision-common"), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
