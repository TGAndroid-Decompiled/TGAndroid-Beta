package xd;

import ae.s1;
import java.util.Iterator;
import w7.h;
public final class e implements b {
    public final int f51203a;
    public final Object f51204b;

    public e(Object obj, int i10) {
        this.f51203a = i10;
        this.f51204b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f51203a) {
            case 0:
                ?? obj = new Object();
                obj.f51202c = h.a(obj, obj, (s1) this.f51204b);
                return obj;
            case 1:
                return (Iterator) this.f51204b;
            default:
                return new yd.b((String) this.f51204b);
        }
    }
}
