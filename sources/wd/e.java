package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f49035a;
    public final Object f49036b;

    public e(Object obj, int i10) {
        this.f49035a = i10;
        this.f49036b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f49035a) {
            case 0:
                ?? obj = new Object();
                obj.f49034c = g.a(obj, obj, (q1) this.f49036b);
                return obj;
            case 1:
                return (Iterator) this.f49036b;
            default:
                return new xd.b((String) this.f49036b);
        }
    }
}
