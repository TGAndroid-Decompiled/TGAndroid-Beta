package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import v5.n;
public final class d {
    public final n f50555a;
    public final v5.c f50556b;
    public final HashMap f50557c;

    public d(Context context, v5.c cVar) {
        n nVar = new n(context, 8);
        this.f50557c = new HashMap();
        this.f50555a = nVar;
        this.f50556b = cVar;
    }

    public final synchronized e a(String str) {
        if (this.f50557c.containsKey(str)) {
            return (e) this.f50557c.get(str);
        }
        CctBackendFactory n10 = this.f50555a.n(str);
        if (n10 == null) {
            return null;
        }
        v5.c cVar = this.f50556b;
        e create = n10.create(new b((Context) cVar.f49409b, (h3.a) cVar.f49410c, (h3.a) cVar.d, str));
        this.f50557c.put(str, create);
        return create;
    }
}
