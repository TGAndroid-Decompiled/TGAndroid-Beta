package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45342a;
    public final Object f45343b;

    public e(Object obj, int i10) {
        this.f45342a = i10;
        this.f45343b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45342a) {
            case 0:
                ?? obj = new Object();
                obj.f45341c = g.a(obj, obj, (q1) this.f45343b);
                return obj;
            case 1:
                return (Iterator) this.f45343b;
            default:
                return new xd.b((String) this.f45343b);
        }
    }
}
