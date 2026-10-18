package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f50124a;
    public final Object f50125b;

    public e(Object obj, int i10) {
        this.f50124a = i10;
        this.f50125b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f50124a) {
            case 0:
                ?? obj = new Object();
                obj.f50123c = n.a(obj, obj, (r1) this.f50125b);
                return obj;
            case 1:
                return (Iterator) this.f50125b;
            default:
                return new zd.b((String) this.f50125b);
        }
    }
}
