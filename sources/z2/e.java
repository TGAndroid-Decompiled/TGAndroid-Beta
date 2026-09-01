package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.g0;
import s5.m;
public final class e {
    public final g0 f50964a;
    public final m f50965b;
    public final HashMap f50966c;

    public e(Context context, m mVar) {
        g0 g0Var = new g0(context, 19);
        this.f50966c = new HashMap();
        this.f50964a = g0Var;
        this.f50965b = mVar;
    }

    public final synchronized f a(String str) {
        if (this.f50966c.containsKey(str)) {
            return (f) this.f50966c.get(str);
        }
        CctBackendFactory y10 = this.f50964a.y(str);
        if (y10 == null) {
            return null;
        }
        m mVar = this.f50965b;
        f create = y10.create(new b((Context) mVar.f47062b, (h3.a) mVar.f47063c, (h3.a) mVar.d, str));
        this.f50966c.put(str, create);
        return create;
    }
}
