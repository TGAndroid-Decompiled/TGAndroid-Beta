package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f49050a;
    public final Object f49051b;

    public e(Object obj, int i10) {
        this.f49050a = i10;
        this.f49051b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f49050a) {
            case 0:
                ?? obj = new Object();
                obj.f49049c = g.a(obj, obj, (q1) this.f49051b);
                return obj;
            case 1:
                return (Iterator) this.f49051b;
            default:
                return new xd.b((String) this.f49051b);
        }
    }
}
