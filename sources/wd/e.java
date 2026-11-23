package wd;

import c8.x0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f59706a;
    public final Object f59707b;

    public e(Object obj, int i7) {
        this.f59706a = i7;
        this.f59707b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f59706a) {
            case 0:
                ?? obj = new Object();
                obj.f59705c = x0.a(obj, obj, (j1) this.f59707b);
                return obj;
            case 1:
                return (Iterator) this.f59707b;
            default:
                return new xd.b((CharSequence) this.f59707b);
        }
    }
}
