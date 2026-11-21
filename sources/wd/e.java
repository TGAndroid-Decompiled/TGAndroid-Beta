package wd;

import c8.x0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f59702a;
    public final Object f59703b;

    public e(Object obj, int i7) {
        this.f59702a = i7;
        this.f59703b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f59702a) {
            case 0:
                ?? obj = new Object();
                obj.f59701c = x0.a(obj, obj, (j1) this.f59703b);
                return obj;
            case 1:
                return (Iterator) this.f59703b;
            default:
                return new xd.b((CharSequence) this.f59703b);
        }
    }
}
