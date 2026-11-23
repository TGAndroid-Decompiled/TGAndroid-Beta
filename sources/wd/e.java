package wd;

import c8.y0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f59791a;
    public final Object f59792b;

    public e(Object obj, int i7) {
        this.f59791a = i7;
        this.f59792b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f59791a) {
            case 0:
                ?? obj = new Object();
                obj.f59790c = y0.a(obj, obj, (j1) this.f59792b);
                return obj;
            case 1:
                return (Iterator) this.f59792b;
            default:
                return new xd.b((CharSequence) this.f59792b);
        }
    }
}
