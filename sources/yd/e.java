package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f50170a;
    public final Object f50171b;

    public e(Object obj, int i10) {
        this.f50170a = i10;
        this.f50171b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f50170a) {
            case 0:
                ?? obj = new Object();
                obj.f50169c = n.a(obj, obj, (r1) this.f50171b);
                return obj;
            case 1:
                return (Iterator) this.f50171b;
            default:
                return new zd.b((String) this.f50171b);
        }
    }
}
