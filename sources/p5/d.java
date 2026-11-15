package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.ld0;
public final class d {
    public final k8.a f54894a;
    public final ld0 f54895b;
    public final HashMap f54896c;

    public d(Context context, ld0 ld0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.f54896c = new HashMap();
        this.f54894a = aVar;
        this.f54895b = ld0Var;
    }

    public final synchronized e a(String str) {
        if (this.f54896c.containsKey(str)) {
            return (e) this.f54896c.get(str);
        }
        CctBackendFactory G0 = this.f54894a.G0(str);
        if (G0 == null) {
            return null;
        }
        ld0 ld0Var = this.f54895b;
        e create = G0.create(new b((Context) ld0Var.f48976b, (x5.a) ld0Var.f48977c, (x5.a) ld0Var.d, str));
        this.f54896c.put(str, create);
        return create;
    }
}
