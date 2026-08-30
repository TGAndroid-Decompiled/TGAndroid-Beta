package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.g0;
import s5.m;
public final class d {
    public final g0 f47275a;
    public final m f47276b;
    public final HashMap f47277c;

    public d(Context context, m mVar) {
        g0 g0Var = new g0(context, 19);
        this.f47277c = new HashMap();
        this.f47275a = g0Var;
        this.f47276b = mVar;
    }

    public final synchronized e a(String str) {
        if (this.f47277c.containsKey(str)) {
            return (e) this.f47277c.get(str);
        }
        CctBackendFactory E = this.f47275a.E(str);
        if (E == null) {
            return null;
        }
        m mVar = this.f47276b;
        e create = E.create(new b((Context) mVar.f44088b, (h3.a) mVar.f44089c, (h3.a) mVar.d, str));
        this.f47277c.put(str, create);
        return create;
    }
}
