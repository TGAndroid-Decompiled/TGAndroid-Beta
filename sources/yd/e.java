package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f50572a;
    public final Object f50573b;

    public e(Object obj, int i10) {
        this.f50572a = i10;
        this.f50573b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f50572a) {
            case 0:
                ?? obj = new Object();
                obj.f50571c = n.a(obj, obj, (r1) this.f50573b);
                return obj;
            case 1:
                return (Iterator) this.f50573b;
            default:
                return new zd.b((String) this.f50573b);
        }
    }
}
