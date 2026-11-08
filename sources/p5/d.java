package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m4.d0;
import org.telegram.ui.hy0;
public final class d {
    public final d0 f53476a;
    public final hy0 f53477b;
    public final HashMap f53478c;

    public d(Context context, hy0 hy0Var) {
        d0 d0Var = new d0(context);
        this.f53478c = new HashMap();
        this.f53476a = d0Var;
        this.f53477b = hy0Var;
    }

    public final synchronized e a(String str) {
        if (this.f53478c.containsKey(str)) {
            return (e) this.f53478c.get(str);
        }
        CctBackendFactory E = this.f53476a.E(str);
        if (E == null) {
            return null;
        }
        hy0 hy0Var = this.f53477b;
        e create = E.create(new b((Context) hy0Var.f46526b, (x5.a) hy0Var.f46527c, (x5.a) hy0Var.d, str));
        this.f53478c.put(str, create);
        return create;
    }
}
