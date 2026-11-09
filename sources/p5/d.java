package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m4.d0;
import org.telegram.ui.ky0;
public final class d {
    public final d0 f53489a;
    public final ky0 f53490b;
    public final HashMap f53491c;

    public d(Context context, ky0 ky0Var) {
        d0 d0Var = new d0(context);
        this.f53491c = new HashMap();
        this.f53489a = d0Var;
        this.f53490b = ky0Var;
    }

    public final synchronized e a(String str) {
        if (this.f53491c.containsKey(str)) {
            return (e) this.f53491c.get(str);
        }
        CctBackendFactory E = this.f53489a.E(str);
        if (E == null) {
            return null;
        }
        ky0 ky0Var = this.f53490b;
        e create = E.create(new b((Context) ky0Var.f47422b, (x5.a) ky0Var.f47423c, (x5.a) ky0Var.d, str));
        this.f53491c.put(str, create);
        return create;
    }
}
