package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m4.d0;
import org.telegram.ui.hy0;
public final class d {
    public final d0 f53477a;
    public final hy0 f53478b;
    public final HashMap f53479c;

    public d(Context context, hy0 hy0Var) {
        d0 d0Var = new d0(context);
        this.f53479c = new HashMap();
        this.f53477a = d0Var;
        this.f53478b = hy0Var;
    }

    public final synchronized e a(String str) {
        if (this.f53479c.containsKey(str)) {
            return (e) this.f53479c.get(str);
        }
        CctBackendFactory E = this.f53477a.E(str);
        if (E == null) {
            return null;
        }
        hy0 hy0Var = this.f53478b;
        e create = E.create(new b((Context) hy0Var.f46526b, (x5.a) hy0Var.f46527c, (x5.a) hy0Var.d, str));
        this.f53479c.put(str, create);
        return create;
    }
}
