package wd;

import c8.u0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f57645a;
    public final Object f57646b;

    public e(Object obj, int i7) {
        this.f57645a = i7;
        this.f57646b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f57645a) {
            case 0:
                ?? obj = new Object();
                obj.f57644c = u0.a(obj, obj, (j1) this.f57646b);
                return obj;
            case 1:
                return (Iterator) this.f57646b;
            default:
                return new xd.b((CharSequence) this.f57646b);
        }
    }
}
