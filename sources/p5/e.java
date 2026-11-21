package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.md0;
public final class e {
    public final k8.a f55511a;
    public final md0 f55512b;
    public final HashMap f55513c;

    public e(Context context, md0 md0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.f55513c = new HashMap();
        this.f55511a = aVar;
        this.f55512b = md0Var;
    }

    public final synchronized f a(String str) {
        if (this.f55513c.containsKey(str)) {
            return (f) this.f55513c.get(str);
        }
        CctBackendFactory x02 = this.f55511a.x0(str);
        if (x02 == null) {
            return null;
        }
        md0 md0Var = this.f55512b;
        f create = x02.create(new b((Context) md0Var.f49853b, (x5.a) md0Var.f49854c, (x5.a) md0Var.d, str));
        this.f55513c.put(str, create);
        return create;
    }
}
