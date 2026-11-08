package y7;

import a8.oa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class e9 {
    public static n9 f59012j;
    public static final d f59013k;
    public final String f59014a;
    public final String f59015b;
    public final c9 f59016c;
    public final pb.k d;
    public final Task f59017e;
    public final Task f59018f;
    public final String f59019g;
    public final int h;
    public final HashMap f59020i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f59013k = new d(objArr);
    }

    public e9(Context context, pb.k kVar, c9 c9Var, String str) {
        int i7;
        new HashMap();
        this.f59014a = context.getPackageName();
        this.f59015b = pb.c.a(context);
        this.d = kVar;
        this.f59016c = c9Var;
        h9.b();
        this.f59019g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.f59017e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        oa oaVar = new oa(kVar, 3);
        a11.getClass();
        this.f59018f = pb.f.b(oaVar);
        d dVar = f59013k;
        if (dVar.containsKey(str)) {
            i7 = b7.f.d(context, (String) dVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
