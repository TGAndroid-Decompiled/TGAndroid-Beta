package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45046a;
    public final Object f45047b;

    public e(Object obj, int i10) {
        this.f45046a = i10;
        this.f45047b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45046a) {
            case 0:
                ?? obj = new Object();
                obj.f45045c = g.a(obj, obj, (q1) this.f45047b);
                return obj;
            case 1:
                return (Iterator) this.f45047b;
            default:
                return new xd.b((String) this.f45047b);
        }
    }
}
