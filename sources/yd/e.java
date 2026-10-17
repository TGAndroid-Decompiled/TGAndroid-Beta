package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f50145a;
    public final Object f50146b;

    public e(Object obj, int i10) {
        this.f50145a = i10;
        this.f50146b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f50145a) {
            case 0:
                ?? obj = new Object();
                obj.f50144c = n.a(obj, obj, (r1) this.f50146b);
                return obj;
            case 1:
                return (Iterator) this.f50146b;
            default:
                return new zd.b((String) this.f50146b);
        }
    }
}
