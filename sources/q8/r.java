package q8;

import java.util.Comparator;
public final class r extends t {
    public static t f(int i10) {
        if (i10 < 0) {
            return t.f46494b;
        }
        if (i10 > 0) {
            return t.f46495c;
        }
        return t.f46493a;
    }

    @Override
    public final t a(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else if (i10 > i11) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return f(i12);
    }

    @Override
    public final t b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override
    public final t c(boolean z10, boolean z11) {
        int i10;
        if (z10 == z11) {
            i10 = 0;
        } else if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override
    public final t d(boolean z10, boolean z11) {
        int i10;
        if (z11 == z10) {
            i10 = 0;
        } else if (z11) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override
    public final int e() {
        return 0;
    }
}
