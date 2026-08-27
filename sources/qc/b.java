package qc;

import h7.o6;
import java.util.RandomAccess;

public final class b extends c implements RandomAccess {

    public final c f46201a;

    public final int f46202b;

    public final int f46203c;

    public b(c cVar, int i10, int i11) {
        this.f46201a = cVar;
        this.f46202b = i10;
        o6.a(i10, i11, cVar.i());
        this.f46203c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f46203c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "index: ", ", size: "));
        }
        return this.f46201a.get(this.f46202b + i10);
    }

    @Override
    public final int i() {
        return this.f46203c;
    }
}
