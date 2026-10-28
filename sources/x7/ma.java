package x7;

import a8.gg;
import a8.hg;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ma {
    public static va f51639j;
    public static final ab f51640k;
    public final String f51641a;
    public final String f51642b;
    public final la f51643c;
    public final sb.k d;
    public final Task e;
    public final Task f51644f;
    public final String f51645g;
    public final int h;
    public final HashMap f51646i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f51640k = new ab(objArr);
    }

    public ma(Context context, sb.k kVar, la laVar) {
        int i10;
        new HashMap();
        this.f51641a = context.getPackageName();
        this.f51642b = sb.c.a(context);
        this.d = kVar;
        this.f51643c = laVar;
        qa.b();
        this.f51645g = "vision-common";
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 8);
        a2.getClass();
        this.e = sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        kVar.getClass();
        hg hgVar = new hg(kVar, 3);
        a10.getClass();
        this.f51644f = sb.f.b(hgVar);
        ab abVar = f51640k;
        if (abVar.containsKey("vision-common")) {
            i10 = z6.e.d(context, (String) abVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
