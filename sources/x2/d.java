package x2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
public final class d {
    public final w4.e f48855a;
    public final t5.c f48856b;
    public final HashMap f48857c;

    public d(Context context, t5.c cVar) {
        w4.e eVar = new w4.e(context, 1);
        this.f48857c = new HashMap();
        this.f48855a = eVar;
        this.f48856b = cVar;
    }

    public final synchronized e a(String str) {
        if (this.f48857c.containsKey(str)) {
            return (e) this.f48857c.get(str);
        }
        CctBackendFactory f10 = this.f48855a.f(str);
        if (f10 == null) {
            return null;
        }
        t5.c cVar = this.f48856b;
        e create = f10.create(new b((Context) cVar.f47682b, (f3.a) cVar.f47683c, (f3.a) cVar.d, str));
        this.f48857c.put(str, create);
        return create;
    }
}
