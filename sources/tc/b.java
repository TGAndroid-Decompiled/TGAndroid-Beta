package tc;

import java.util.RandomAccess;
import k7.r7;
public final class b extends c implements RandomAccess {
    public final c f48055a;
    public final int f48056b;
    public final int f48057c;

    public b(c cVar, int i10, int i11) {
        this.f48055a = cVar;
        this.f48056b = i10;
        r7.a(i10, i11, cVar.i());
        this.f48057c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f48057c;
        if (i10 >= 0 && i10 < i11) {
            return this.f48055a.get(this.f48056b + i10);
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f48057c;
    }
}
