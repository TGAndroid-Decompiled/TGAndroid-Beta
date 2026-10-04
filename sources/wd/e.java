package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f49034a;
    public final Object f49035b;

    public e(Object obj, int i10) {
        this.f49034a = i10;
        this.f49035b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f49034a) {
            case 0:
                ?? obj = new Object();
                obj.f49033c = g.a(obj, obj, (q1) this.f49035b);
                return obj;
            case 1:
                return (Iterator) this.f49035b;
            default:
                return new xd.b((String) this.f49035b);
        }
    }
}
