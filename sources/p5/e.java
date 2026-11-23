package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.md0;
public final class e {
    public final k8.a f55515a;
    public final md0 f55516b;
    public final HashMap f55517c;

    public e(Context context, md0 md0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.f55517c = new HashMap();
        this.f55515a = aVar;
        this.f55516b = md0Var;
    }

    public final synchronized f a(String str) {
        if (this.f55517c.containsKey(str)) {
            return (f) this.f55517c.get(str);
        }
        CctBackendFactory x02 = this.f55515a.x0(str);
        if (x02 == null) {
            return null;
        }
        md0 md0Var = this.f55516b;
        f create = x02.create(new b((Context) md0Var.f49857b, (x5.a) md0Var.f49858c, (x5.a) md0Var.d, str));
        this.f55517c.put(str, create);
        return create;
    }
}
