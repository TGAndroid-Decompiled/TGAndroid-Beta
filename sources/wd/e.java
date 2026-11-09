package wd;

import c8.u0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f57658a;
    public final Object f57659b;

    public e(Object obj, int i7) {
        this.f57658a = i7;
        this.f57659b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f57658a) {
            case 0:
                ?? obj = new Object();
                obj.f57657c = u0.a(obj, obj, (j1) this.f57659b);
                return obj;
            case 1:
                return (Iterator) this.f57659b;
            default:
                return new xd.b((CharSequence) this.f57659b);
        }
    }
}
