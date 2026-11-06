package wd;

import c8.u0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f57529a;
    public final Object f57530b;

    public e(Object obj, int i7) {
        this.f57529a = i7;
        this.f57530b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f57529a) {
            case 0:
                ?? obj = new Object();
                obj.f57528c = u0.a(obj, obj, (j1) this.f57530b);
                return obj;
            case 1:
                return (Iterator) this.f57530b;
            default:
                return new xd.b((CharSequence) this.f57530b);
        }
    }
}
