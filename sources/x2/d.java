package x2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import w3.b0;

public final class d {

    public final b0 f49335a;

    public final u2.b f49336b;

    public final HashMap f49337c;

    public d(Context context, u2.b bVar) {
        b0 b0Var = new b0(context, 2);
        this.f49337c = new HashMap();
        this.f49335a = b0Var;
        this.f49336b = bVar;
    }

    public final synchronized e a(String str) {
        if (this.f49337c.containsKey(str)) {
            return (e) this.f49337c.get(str);
        }
        CctBackendFactory cctBackendFactoryJ = this.f49335a.j(str);
        if (cctBackendFactoryJ == null) {
            return null;
        }
        u2.b bVar = this.f49336b;
        e eVarCreate = cctBackendFactoryJ.create(new b((Context) bVar.f48263c, (f3.a) bVar.d, (f3.a) bVar.f48262b, str));
        this.f49337c.put(str, eVarCreate);
        return eVarCreate;
    }
}
