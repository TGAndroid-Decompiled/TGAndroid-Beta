package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.nd0;
public final class e {
    public final k8.a f55470a;
    public final nd0 f55471b;
    public final HashMap f55472c;

    public e(Context context, nd0 nd0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.f55472c = new HashMap();
        this.f55470a = aVar;
        this.f55471b = nd0Var;
    }

    public final synchronized f a(String str) {
        if (this.f55472c.containsKey(str)) {
            return (f) this.f55472c.get(str);
        }
        CctBackendFactory x02 = this.f55470a.x0(str);
        if (x02 == null) {
            return null;
        }
        nd0 nd0Var = this.f55471b;
        f create = x02.create(new b((Context) nd0Var.f50148b, (x5.a) nd0Var.f50149c, (x5.a) nd0Var.d, str));
        this.f55472c.put(str, create);
        return create;
    }
}
