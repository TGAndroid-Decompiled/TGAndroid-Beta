package wd;

import c8.x0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f59664a;
    public final Object f59665b;

    public e(Object obj, int i7) {
        this.f59664a = i7;
        this.f59665b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f59664a) {
            case 0:
                ?? obj = new Object();
                obj.f59663c = x0.a(obj, obj, (j1) this.f59665b);
                return obj;
            case 1:
                return (Iterator) this.f59665b;
            default:
                return new xd.b((CharSequence) this.f59665b);
        }
    }
}
