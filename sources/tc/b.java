package tc;

import java.util.RandomAccess;
import k7.q7;
public final class b extends c implements RandomAccess {
    public final c f44641a;
    public final int f44642b;
    public final int f44643c;

    public b(c cVar, int i10, int i11) {
        this.f44641a = cVar;
        this.f44642b = i10;
        q7.a(i10, i11, cVar.i());
        this.f44643c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f44643c;
        if (i10 >= 0 && i10 < i11) {
            return this.f44641a.get(this.f44642b + i10);
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f44643c;
    }
}
