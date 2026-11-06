package wd;

import c8.u0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f57554a;
    public final Object f57555b;

    public e(Object obj, int i7) {
        this.f57554a = i7;
        this.f57555b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f57554a) {
            case 0:
                ?? obj = new Object();
                obj.f57553c = u0.a(obj, obj, (j1) this.f57555b);
                return obj;
            case 1:
                return (Iterator) this.f57555b;
            default:
                return new xd.b((CharSequence) this.f57555b);
        }
    }
}
