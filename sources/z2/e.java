package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.c0;
import s5.m;
public final class e {
    public final c0 f51000a;
    public final m f51001b;
    public final HashMap f51002c;

    public e(Context context, m mVar) {
        c0 c0Var = new c0(context);
        this.f51002c = new HashMap();
        this.f51000a = c0Var;
        this.f51001b = mVar;
    }

    public final synchronized f a(String str) {
        if (this.f51002c.containsKey(str)) {
            return (f) this.f51002c.get(str);
        }
        CctBackendFactory y10 = this.f51000a.y(str);
        if (y10 == null) {
            return null;
        }
        m mVar = this.f51001b;
        f create = y10.create(new b((Context) mVar.f47093b, (h3.a) mVar.f47094c, (h3.a) mVar.d, str));
        this.f51002c.put(str, create);
        return create;
    }
}
