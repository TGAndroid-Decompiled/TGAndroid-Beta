package td;

import b8.jc;
import java.util.Iterator;
import wd.j1;
public final class e implements b {
    public final int f55085a;
    public final Object f55086b;

    public e(Object obj, int i3) {
        this.f55085a = i3;
        this.f55086b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f55085a) {
            case 0:
                ?? obj = new Object();
                obj.f55084c = jc.a(obj, obj, (j1) this.f55086b);
                return obj;
            case 1:
                return (Iterator) this.f55086b;
            default:
                return new ud.b((CharSequence) this.f55086b);
        }
    }
}
