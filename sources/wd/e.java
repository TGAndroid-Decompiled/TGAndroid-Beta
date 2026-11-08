package wd;

import c8.u0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f57646a;
    public final Object f57647b;

    public e(Object obj, int i7) {
        this.f57646a = i7;
        this.f57647b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f57646a) {
            case 0:
                ?? obj = new Object();
                obj.f57645c = u0.a(obj, obj, (j1) this.f57647b);
                return obj;
            case 1:
                return (Iterator) this.f57647b;
            default:
                return new xd.b((CharSequence) this.f57647b);
        }
    }
}
