package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45404a;
    public final Object f45405b;

    public e(Object obj, int i10) {
        this.f45404a = i10;
        this.f45405b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45404a) {
            case 0:
                ?? obj = new Object();
                obj.f45403c = g.a(obj, obj, (q1) this.f45405b);
                return obj;
            case 1:
                return (Iterator) this.f45405b;
            default:
                return new xd.b((String) this.f45405b);
        }
    }
}
