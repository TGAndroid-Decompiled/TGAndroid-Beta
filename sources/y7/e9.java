package y7;

import a8.pa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class e9 {
    public static n9 f60925j;
    public static final d f60926k;
    public final String f60927a;
    public final String f60928b;
    public final c9 f60929c;
    public final pb.k d;
    public final Task f60930e;
    public final Task f60931f;
    public final String f60932g;
    public final int h;
    public final HashMap f60933i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f60926k = new d(objArr);
    }

    public e9(Context context, pb.k kVar, c9 c9Var, String str) {
        int i7;
        new HashMap();
        this.f60927a = context.getPackageName();
        this.f60928b = pb.c.a(context);
        this.d = kVar;
        this.f60929c = c9Var;
        h9.b();
        this.f60932g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.f60930e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        pa paVar = new pa(kVar, 3);
        a11.getClass();
        this.f60931f = pb.f.b(paVar);
        d dVar = f60926k;
        if (dVar.containsKey(str)) {
            i7 = b7.f.d(context, (String) dVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
