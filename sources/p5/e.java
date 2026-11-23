package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import jb.m;
import org.telegram.ui.Components.i61;
public final class e {
    public final m f55593a;
    public final i61 f55594b;
    public final HashMap f55595c;

    public e(Context context, i61 i61Var) {
        m mVar = new m(context, 23);
        this.f55595c = new HashMap();
        this.f55593a = mVar;
        this.f55594b = i61Var;
    }

    public final synchronized f a(String str) {
        if (this.f55595c.containsKey(str)) {
            return (f) this.f55595c.get(str);
        }
        CctBackendFactory u02 = this.f55593a.u0(str);
        if (u02 == null) {
            return null;
        }
        i61 i61Var = this.f55594b;
        f create = u02.create(new b((Context) i61Var.f35958b, (x5.a) i61Var.f35959c, (x5.a) i61Var.d, str));
        this.f55595c.put(str, create);
        return create;
    }
}
