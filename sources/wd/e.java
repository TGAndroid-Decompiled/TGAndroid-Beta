package wd;

import c8.v0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f59098a;
    public final Object f59099b;

    public e(Object obj, int i7) {
        this.f59098a = i7;
        this.f59099b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f59098a) {
            case 0:
                ?? obj = new Object();
                obj.f59097c = v0.a(obj, obj, (j1) this.f59099b);
                return obj;
            case 1:
                return (Iterator) this.f59099b;
            default:
                return new xd.b((CharSequence) this.f59099b);
        }
    }
}
