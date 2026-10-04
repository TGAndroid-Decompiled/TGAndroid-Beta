package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f49043a;
    public final Object f49044b;

    public e(Object obj, int i10) {
        this.f49043a = i10;
        this.f49044b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f49043a) {
            case 0:
                ?? obj = new Object();
                obj.f49042c = g.a(obj, obj, (q1) this.f49044b);
                return obj;
            case 1:
                return (Iterator) this.f49044b;
            default:
                return new xd.b((String) this.f49044b);
        }
    }
}
