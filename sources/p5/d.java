package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m4.d0;
import org.telegram.ui.ly0;
public final class d {
    public final d0 f53488a;
    public final ly0 f53489b;
    public final HashMap f53490c;

    public d(Context context, ly0 ly0Var) {
        d0 d0Var = new d0(context);
        this.f53490c = new HashMap();
        this.f53488a = d0Var;
        this.f53489b = ly0Var;
    }

    public final synchronized e a(String str) {
        if (this.f53490c.containsKey(str)) {
            return (e) this.f53490c.get(str);
        }
        CctBackendFactory E = this.f53488a.E(str);
        if (E == null) {
            return null;
        }
        ly0 ly0Var = this.f53489b;
        e create = E.create(new b((Context) ly0Var.f47746b, (x5.a) ly0Var.f47747c, (x5.a) ly0Var.d, str));
        this.f53490c.put(str, create);
        return create;
    }
}
