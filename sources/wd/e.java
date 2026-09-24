package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45282a;
    public final Object f45283b;

    public e(Object obj, int i10) {
        this.f45282a = i10;
        this.f45283b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45282a) {
            case 0:
                ?? obj = new Object();
                obj.f45281c = g.a(obj, obj, (q1) this.f45283b);
                return obj;
            case 1:
                return (Iterator) this.f45283b;
            default:
                return new xd.b((String) this.f45283b);
        }
    }
}
