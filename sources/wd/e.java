package wd;

import java.util.Iterator;
import v7.t8;
import zd.q1;
public final class e implements b {
    public final int f48489a;
    public final Object f48490b;

    public e(Object obj, int i10) {
        this.f48489a = i10;
        this.f48490b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f48489a) {
            case 0:
                ?? obj = new Object();
                obj.f48488c = t8.a(obj, obj, (q1) this.f48490b);
                return obj;
            case 1:
                return (Iterator) this.f48490b;
            default:
                return new xd.b((String) this.f48490b);
        }
    }
}
