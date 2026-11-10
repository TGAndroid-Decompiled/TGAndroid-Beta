package wd;

import c8.u0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f57657a;
    public final Object f57658b;

    public e(Object obj, int i7) {
        this.f57657a = i7;
        this.f57658b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f57657a) {
            case 0:
                ?? obj = new Object();
                obj.f57656c = u0.a(obj, obj, (j1) this.f57658b);
                return obj;
            case 1:
                return (Iterator) this.f57658b;
            default:
                return new xd.b((CharSequence) this.f57658b);
        }
    }
}
