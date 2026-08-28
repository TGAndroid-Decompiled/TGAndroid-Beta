package z4;

import java.util.Collections;
import java.util.List;
import r4.f;
public final class b implements f {
    public static final b f50305b = new b();
    public final List f50306a;

    public b(r4.b bVar) {
        this.f50306a = Collections.singletonList(bVar);
    }

    @Override
    public final int b(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final long h(int i9) {
        boolean z10;
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        return 0L;
    }

    @Override
    public final List m(long j10) {
        if (j10 >= 0) {
            return this.f50306a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final int r() {
        return 1;
    }

    public b() {
        this.f50306a = Collections.EMPTY_LIST;
    }
}
