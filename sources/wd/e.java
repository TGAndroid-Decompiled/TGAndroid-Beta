package wd;

import java.util.Iterator;
import v7.t8;
import zd.q1;
public final class e implements b {
    public final int f48517a;
    public final Object f48518b;

    public e(Object obj, int i10) {
        this.f48517a = i10;
        this.f48518b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f48517a) {
            case 0:
                ?? obj = new Object();
                obj.f48516c = t8.a(obj, obj, (q1) this.f48518b);
                return obj;
            case 1:
                return (Iterator) this.f48518b;
            default:
                return new xd.b((String) this.f48518b);
        }
    }
}
