package y7;

import a8.pa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class d9 {
    public static m9 f60836j;
    public static final d f60837k;
    public final String f60838a;
    public final String f60839b;
    public final b9 f60840c;
    public final pb.k d;
    public final Task f60841e;
    public final Task f60842f;
    public final String f60843g;
    public final int h;
    public final HashMap f60844i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f60837k = new d(objArr);
    }

    public d9(Context context, pb.k kVar, b9 b9Var, String str) {
        int i7;
        new HashMap();
        this.f60838a = context.getPackageName();
        this.f60839b = pb.c.a(context);
        this.d = kVar;
        this.f60840c = b9Var;
        g9.b();
        this.f60843g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.f60841e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        pa paVar = new pa(kVar, 3);
        a11.getClass();
        this.f60842f = pb.f.b(paVar);
        d dVar = f60837k;
        if (dVar.containsKey(str)) {
            i7 = b7.f.d(context, (String) dVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
