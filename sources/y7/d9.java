package y7;

import a8.pa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class d9 {
    public static m9 f60832j;
    public static final d f60833k;
    public final String f60834a;
    public final String f60835b;
    public final b9 f60836c;
    public final pb.k d;
    public final Task f60837e;
    public final Task f60838f;
    public final String f60839g;
    public final int h;
    public final HashMap f60840i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f60833k = new d(objArr);
    }

    public d9(Context context, pb.k kVar, b9 b9Var, String str) {
        int i7;
        new HashMap();
        this.f60834a = context.getPackageName();
        this.f60835b = pb.c.a(context);
        this.d = kVar;
        this.f60836c = b9Var;
        g9.b();
        this.f60839g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.f60837e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        pa paVar = new pa(kVar, 3);
        a11.getClass();
        this.f60838f = pb.f.b(paVar);
        d dVar = f60833k;
        if (dVar.containsKey(str)) {
            i7 = b7.f.d(context, (String) dVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
