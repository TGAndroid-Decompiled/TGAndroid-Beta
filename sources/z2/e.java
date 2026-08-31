package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.g0;
import s5.m;
public final class e {
    public final g0 f50963a;
    public final m f50964b;
    public final HashMap f50965c;

    public e(Context context, m mVar) {
        g0 g0Var = new g0(context, 19);
        this.f50965c = new HashMap();
        this.f50963a = g0Var;
        this.f50964b = mVar;
    }

    public final synchronized f a(String str) {
        if (this.f50965c.containsKey(str)) {
            return (f) this.f50965c.get(str);
        }
        CctBackendFactory y10 = this.f50963a.y(str);
        if (y10 == null) {
            return null;
        }
        m mVar = this.f50964b;
        f create = y10.create(new b((Context) mVar.f47062b, (h3.a) mVar.f47063c, (h3.a) mVar.d, str));
        this.f50965c.put(str, create);
        return create;
    }
}
