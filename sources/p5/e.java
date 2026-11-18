package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.md0;
public final class e {
    public final k8.a f55470a;
    public final md0 f55471b;
    public final HashMap f55472c;

    public e(Context context, md0 md0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.f55472c = new HashMap();
        this.f55470a = aVar;
        this.f55471b = md0Var;
    }

    public final synchronized f a(String str) {
        if (this.f55472c.containsKey(str)) {
            return (f) this.f55472c.get(str);
        }
        CctBackendFactory x02 = this.f55470a.x0(str);
        if (x02 == null) {
            return null;
        }
        md0 md0Var = this.f55471b;
        f create = x02.create(new b((Context) md0Var.f49838b, (x5.a) md0Var.f49839c, (x5.a) md0Var.d, str));
        this.f55472c.put(str, create);
        return create;
    }
}
