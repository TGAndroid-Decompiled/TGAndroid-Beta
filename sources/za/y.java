package za;

import android.content.Context;
import android.content.res.Resources;
public final class y implements ce.b {
    public final Object f47958a;
    public final Object f47959b;

    public y(Context context) {
        n6.l.h(context);
        Resources resources = context.getResources();
        this.f47958a = resources;
        this.f47959b = resources.getResourcePackageName(2131689566);
    }

    public String a(String str) {
        Resources resources = (Resources) this.f47958a;
        int identifier = resources.getIdentifier(str, "string", (String) this.f47959b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public Object u(ce.c cVar, kd.c cVar2) {
        Object u10 = ((of.b) this.f47958a).u(new k1.p(cVar, (z) this.f47959b), cVar2);
        if (u10 == jd.a.f11861a) {
            return u10;
        }
        return gd.i.f8748a;
    }

    public y(of.b bVar, z zVar) {
        this.f47958a = bVar;
        this.f47959b = zVar;
    }
}
