package wd;

import c8.x0;
import java.util.Iterator;
import zd.j1;
public final class e implements b {
    public final int f59663a;
    public final Object f59664b;

    public e(Object obj, int i7) {
        this.f59663a = i7;
        this.f59664b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f59663a) {
            case 0:
                ?? obj = new Object();
                obj.f59662c = x0.a(obj, obj, (j1) this.f59664b);
                return obj;
            case 1:
                return (Iterator) this.f59664b;
            default:
                return new xd.b((CharSequence) this.f59664b);
        }
    }
}
