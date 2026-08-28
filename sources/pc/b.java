package pc;

import g7.m6;
import java.util.RandomAccess;
public final class b extends c implements RandomAccess {
    public final c f45531a;
    public final int f45532b;
    public final int f45533c;

    public b(c cVar, int i9, int i10) {
        this.f45531a = cVar;
        this.f45532b = i9;
        m6.a(i9, i10, cVar.i());
        this.f45533c = i10 - i9;
    }

    @Override
    public final Object get(int i9) {
        int i10 = this.f45533c;
        if (i9 >= 0 && i9 < i10) {
            return this.f45531a.get(this.f45532b + i9);
        }
        throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f45533c;
    }
}
