package y7;

import a8.oa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class e9 {
    public static n9 f58923j;
    public static final d f58924k;
    public final String f58925a;
    public final String f58926b;
    public final c9 f58927c;
    public final pb.k d;
    public final Task f58928e;
    public final Task f58929f;
    public final String f58930g;
    public final int h;
    public final HashMap f58931i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f58924k = new d(objArr);
    }

    public e9(Context context, pb.k kVar, c9 c9Var, String str) {
        int i7;
        new HashMap();
        this.f58925a = context.getPackageName();
        this.f58926b = pb.c.a(context);
        this.d = kVar;
        this.f58927c = c9Var;
        h9.b();
        this.f58930g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.f58928e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        oa oaVar = new oa(kVar, 3);
        a11.getClass();
        this.f58929f = pb.f.b(oaVar);
        d dVar = f58924k;
        if (dVar.containsKey(str)) {
            i7 = b7.f.d(context, (String) dVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }
}
