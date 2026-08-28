package s4;

import java.util.Collections;
import java.util.List;
public final class j implements r4.f {
    public final int f47431a;
    public final List f47432b;

    public j(int i9, List list) {
        this.f47431a = i9;
        this.f47432b = list;
    }

    @Override
    public final int b(long j10) {
        switch (this.f47431a) {
            case 0:
                if (j10 < 0) {
                    return 0;
                }
                return -1;
            default:
                return -1;
        }
    }

    @Override
    public final long h(int i9) {
        boolean z10;
        switch (this.f47431a) {
            case 0:
                if (i9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.f(z10);
                return 0L;
            default:
                return 0L;
        }
    }

    @Override
    public final List m(long j10) {
        switch (this.f47431a) {
            case 0:
                if (j10 >= 0) {
                    return this.f47432b;
                }
                return Collections.EMPTY_LIST;
            default:
                return this.f47432b;
        }
    }

    @Override
    public final int r() {
        switch (this.f47431a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }
}
