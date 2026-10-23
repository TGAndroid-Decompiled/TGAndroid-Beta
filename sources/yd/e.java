package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f50573a;
    public final Object f50574b;

    public e(Object obj, int i10) {
        this.f50573a = i10;
        this.f50574b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f50573a) {
            case 0:
                ?? obj = new Object();
                obj.f50572c = n.a(obj, obj, (r1) this.f50574b);
                return obj;
            case 1:
                return (Iterator) this.f50574b;
            default:
                return new zd.b((String) this.f50574b);
        }
    }
}
