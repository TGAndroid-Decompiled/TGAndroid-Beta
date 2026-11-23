package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.md0;
public final class e {
    public final k8.a f55480a;
    public final md0 f55481b;
    public final HashMap f55482c;

    public e(Context context, md0 md0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.f55482c = new HashMap();
        this.f55480a = aVar;
        this.f55481b = md0Var;
    }

    public final synchronized f a(String str) {
        if (this.f55482c.containsKey(str)) {
            return (f) this.f55482c.get(str);
        }
        CctBackendFactory x02 = this.f55480a.x0(str);
        if (x02 == null) {
            return null;
        }
        md0 md0Var = this.f55481b;
        f create = x02.create(new b((Context) md0Var.f49830b, (x5.a) md0Var.f49831c, (x5.a) md0Var.d, str));
        this.f55482c.put(str, create);
        return create;
    }
}
