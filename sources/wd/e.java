package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45269a;
    public final Object f45270b;

    public e(Object obj, int i10) {
        this.f45269a = i10;
        this.f45270b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45269a) {
            case 0:
                ?? obj = new Object();
                obj.f45268c = g.a(obj, obj, (q1) this.f45270b);
                return obj;
            case 1:
                return (Iterator) this.f45270b;
            default:
                return new xd.b((String) this.f45270b);
        }
    }
}
