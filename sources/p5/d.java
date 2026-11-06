package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m4.d0;
import org.telegram.ui.hy0;
public final class d {
    public final d0 f53383a;
    public final hy0 f53384b;
    public final HashMap f53385c;

    public d(Context context, hy0 hy0Var) {
        d0 d0Var = new d0(context);
        this.f53385c = new HashMap();
        this.f53383a = d0Var;
        this.f53384b = hy0Var;
    }

    public final synchronized e a(String str) {
        if (this.f53385c.containsKey(str)) {
            return (e) this.f53385c.get(str);
        }
        CctBackendFactory E = this.f53383a.E(str);
        if (E == null) {
            return null;
        }
        hy0 hy0Var = this.f53384b;
        e create = E.create(new b((Context) hy0Var.f46527b, (x5.a) hy0Var.f46528c, (x5.a) hy0Var.d, str));
        this.f53385c.put(str, create);
        return create;
    }
}
