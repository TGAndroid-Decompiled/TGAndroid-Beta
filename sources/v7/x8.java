package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class x8 {
    public static i9 f50637j;
    public static final d f50638k;
    public final String f50639a;
    public final String f50640b;
    public final v8 f50641c;
    public final jb.k d;
    public final Task e;
    public final Task f50642f;
    public final String f50643g;
    public final int h;
    public final HashMap f50644i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f50638k = new d(objArr);
    }

    public x8(Context context, jb.k kVar, v8 v8Var, String str) {
        int i10;
        new HashMap();
        this.f50639a = context.getPackageName();
        this.f50640b = jb.c.a(context);
        this.d = kVar;
        this.f50641c = v8Var;
        c9.b();
        this.f50643g = str;
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 5);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f50642f = jb.f.b(pVar);
        d dVar = f50638k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
