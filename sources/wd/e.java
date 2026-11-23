package wd;

import c8.y0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f59671a;
    public final Object f59672b;

    public e(Object obj, int i7) {
        this.f59671a = i7;
        this.f59672b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f59671a) {
            case 0:
                ?? obj = new Object();
                obj.f59670c = y0.a(obj, obj, (j1) this.f59672b);
                return obj;
            case 1:
                return (Iterator) this.f59672b;
            default:
                return new xd.b((CharSequence) this.f59672b);
        }
    }
}
