package y7;

import a8.pa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class d9 {
    public static m9 f60790j;
    public static final d f60791k;
    public final String f60792a;
    public final String f60793b;
    public final b9 f60794c;
    public final pb.k d;
    public final Task f60795e;
    public final Task f60796f;
    public final String f60797g;
    public final int h;
    public final HashMap f60798i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f60791k = new d(objArr);
    }

    public d9(Context context, pb.k kVar, b9 b9Var, String str) {
        int i7;
        new HashMap();
        this.f60792a = context.getPackageName();
        this.f60793b = pb.c.a(context);
        this.d = kVar;
        this.f60794c = b9Var;
        g9.b();
        this.f60797g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.f60795e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        pa paVar = new pa(kVar, 3);
        a11.getClass();
        this.f60796f = pb.f.b(paVar);
        d dVar = f60791k;
        if (dVar.containsKey(str)) {
            i7 = b7.f.d(context, (String) dVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
