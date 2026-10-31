package qd;

import java.util.Iterator;
import td.q1;
import v7.w6;
public final class e implements b {
    public final int f45514a;
    public final Object f45515b;

    public e(Object obj, int i10) {
        this.f45514a = i10;
        this.f45515b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45514a) {
            case 0:
                ?? obj = new Object();
                obj.f45513c = w6.a(obj, obj, (q1) this.f45515b);
                return obj;
            case 1:
                return (Iterator) this.f45515b;
            default:
                return new rd.b((String) this.f45515b);
        }
    }
}
