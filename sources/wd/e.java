package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45018a;
    public final Object f45019b;

    public e(Object obj, int i10) {
        this.f45018a = i10;
        this.f45019b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45018a) {
            case 0:
                ?? obj = new Object();
                obj.f45017c = g.a(obj, obj, (q1) this.f45019b);
                return obj;
            case 1:
                return (Iterator) this.f45019b;
            default:
                return new xd.b((String) this.f45019b);
        }
    }
}
