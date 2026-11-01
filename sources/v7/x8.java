package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class x8 {
    public static i9 f50651j;
    public static final d f50652k;
    public final String f50653a;
    public final String f50654b;
    public final v8 f50655c;
    public final jb.k d;
    public final Task e;
    public final Task f50656f;
    public final String f50657g;
    public final int h;
    public final HashMap f50658i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f50652k = new d(objArr);
    }

    public x8(Context context, jb.k kVar, v8 v8Var, String str) {
        int i10;
        new HashMap();
        this.f50653a = context.getPackageName();
        this.f50654b = jb.c.a(context);
        this.d = kVar;
        this.f50655c = v8Var;
        c9.b();
        this.f50657g = str;
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 5);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f50656f = jb.f.b(pVar);
        d dVar = f50652k;
        if (dVar.containsKey(str)) {
            i10 = y6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
