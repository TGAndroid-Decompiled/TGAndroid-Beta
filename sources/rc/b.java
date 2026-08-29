package rc;

import a4.w;
import i7.i7;
import java.util.RandomAccess;
public final class b extends c implements RandomAccess {
    public final c f47112a;
    public final int f47113b;
    public final int f47114c;

    public b(c cVar, int i10, int i11) {
        this.f47112a = cVar;
        this.f47113b = i10;
        i7.a(i10, i11, cVar.i());
        this.f47114c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f47114c;
        if (i10 >= 0 && i10 < i11) {
            return this.f47112a.get(this.f47113b + i10);
        }
        throw new IndexOutOfBoundsException(w.k(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f47114c;
    }
}
