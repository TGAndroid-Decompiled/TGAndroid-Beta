package qd;

import java.util.Iterator;
import td.q1;
import v7.w6;
public final class e implements b {
    public final int f45525a;
    public final Object f45526b;

    public e(Object obj, int i10) {
        this.f45525a = i10;
        this.f45526b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45525a) {
            case 0:
                ?? obj = new Object();
                obj.f45524c = w6.a(obj, obj, (q1) this.f45526b);
                return obj;
            case 1:
                return (Iterator) this.f45526b;
            default:
                return new rd.b((String) this.f45526b);
        }
    }
}
