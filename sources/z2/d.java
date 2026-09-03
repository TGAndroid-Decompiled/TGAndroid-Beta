package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.c0;
import s5.m;
public final class d {
    public final c0 f47339a;
    public final m f47340b;
    public final HashMap f47341c;

    public d(Context context, m mVar) {
        c0 c0Var = new c0(context);
        this.f47341c = new HashMap();
        this.f47339a = c0Var;
        this.f47340b = mVar;
    }

    public final synchronized e a(String str) {
        if (this.f47341c.containsKey(str)) {
            return (e) this.f47341c.get(str);
        }
        CctBackendFactory B = this.f47339a.B(str);
        if (B == null) {
            return null;
        }
        m mVar = this.f47340b;
        e create = B.create(new b((Context) mVar.f44153b, (h3.a) mVar.f44154c, (h3.a) mVar.d, str));
        this.f47341c.put(str, create);
        return create;
    }
}
