package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45297a;
    public final Object f45298b;

    public e(Object obj, int i10) {
        this.f45297a = i10;
        this.f45298b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45297a) {
            case 0:
                ?? obj = new Object();
                obj.f45296c = g.a(obj, obj, (q1) this.f45298b);
                return obj;
            case 1:
                return (Iterator) this.f45298b;
            default:
                return new xd.b((String) this.f45298b);
        }
    }
}
