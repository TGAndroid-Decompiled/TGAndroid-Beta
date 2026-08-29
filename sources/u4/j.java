package u4;

import java.util.Collections;
import java.util.List;
public final class j implements t4.f {
    public final int f49095a;
    public final List f49096b;

    public j(int i10, List list) {
        this.f49095a = i10;
        this.f49096b = list;
    }

    @Override
    public final int e(long j10) {
        switch (this.f49095a) {
            case 0:
                if (j10 < 0) {
                    return 0;
                }
                return -1;
            case 1:
                return -1;
            default:
                return -1;
        }
    }

    @Override
    public final long m(int i10) {
        boolean z10;
        switch (this.f49095a) {
            case 0:
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.f(z10);
                return 0L;
            case 1:
                return 0L;
            default:
                return 0L;
        }
    }

    @Override
    public final List q(long j10) {
        switch (this.f49095a) {
            case 0:
                if (j10 >= 0) {
                    return this.f49096b;
                }
                return Collections.EMPTY_LIST;
            case 1:
                return this.f49096b;
            default:
                return this.f49096b;
        }
    }

    @Override
    public final int v() {
        switch (this.f49095a) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return 1;
        }
    }
}
