package w7;

import a8.gg;
import a8.hg;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class d9 {
    public static m9 f50835j;
    public static final d f50836k;
    public final String f50837a;
    public final String f50838b;
    public final b9 f50839c;
    public final sb.k d;
    public final Task e;
    public final Task f50840f;
    public final String f50841g;
    public final int h;
    public final HashMap f50842i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f50836k = new d(objArr);
    }

    public d9(Context context, sb.k kVar, b9 b9Var, String str) {
        int i10;
        new HashMap();
        this.f50837a = context.getPackageName();
        this.f50838b = sb.c.a(context);
        this.d = kVar;
        this.f50839c = b9Var;
        g9.b();
        this.f50841g = str;
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 6);
        a2.getClass();
        this.e = sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        kVar.getClass();
        hg hgVar = new hg(kVar, 2);
        a10.getClass();
        this.f50840f = sb.f.b(hgVar);
        d dVar = f50836k;
        if (dVar.containsKey(str)) {
            i10 = z6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
