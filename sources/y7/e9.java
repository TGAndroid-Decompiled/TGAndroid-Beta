package y7;

import a8.oa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class e9 {
    public static n9 f58893j;
    public static final d f58894k;
    public final String f58895a;
    public final String f58896b;
    public final c9 f58897c;
    public final pb.k d;
    public final Task f58898e;
    public final Task f58899f;
    public final String f58900g;
    public final int h;
    public final HashMap f58901i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f58894k = new d(objArr);
    }

    public e9(Context context, pb.k kVar, c9 c9Var, String str) {
        int i7;
        new HashMap();
        this.f58895a = context.getPackageName();
        this.f58896b = pb.c.a(context);
        this.d = kVar;
        this.f58897c = c9Var;
        h9.b();
        this.f58900g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.f58898e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        oa oaVar = new oa(kVar, 3);
        a11.getClass();
        this.f58899f = pb.f.b(oaVar);
        d dVar = f58894k;
        if (dVar.containsKey(str)) {
            i7 = b7.f.d(context, (String) dVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
