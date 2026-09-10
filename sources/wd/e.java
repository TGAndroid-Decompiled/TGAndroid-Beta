package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f43974a;
    public final Object f43975b;

    public e(Object obj, int i10) {
        this.f43974a = i10;
        this.f43975b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f43974a) {
            case 0:
                ?? obj = new Object();
                obj.f43973c = g.a(obj, obj, (q1) this.f43975b);
                return obj;
            case 1:
                return (Iterator) this.f43975b;
            default:
                return new xd.b((String) this.f43975b);
        }
    }
}
