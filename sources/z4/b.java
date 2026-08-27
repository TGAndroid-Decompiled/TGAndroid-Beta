package z4;

import java.util.Collections;
import java.util.List;
import r4.c;
import r4.g;

public final class b implements g {

    public static final b f50205b = new b();

    public final List f50206a;

    public b(c cVar) {
        this.f50206a = Collections.singletonList(cVar);
    }

    @Override
    public final int c(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override
    public final long f(int i10) {
        d5.a.f(i10 == 0);
        return 0L;
    }

    @Override
    public final List h(long j10) {
        return j10 >= 0 ? this.f50206a : Collections.EMPTY_LIST;
    }

    @Override
    public final int p() {
        return 1;
    }

    public b() {
        this.f50206a = Collections.EMPTY_LIST;
    }
}
