package s8;

import java.util.Comparator;
public final class n extends p {
    public static p f(int i10) {
        if (i10 < 0) {
            return p.f44143b;
        }
        if (i10 > 0) {
            return p.f44144c;
        }
        return p.f44142a;
    }

    @Override
    public final p a(int i10, int i11) {
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
    public final p b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override
    public final p c(boolean z4, boolean z10) {
        int i10;
        if (z4 == z10) {
            i10 = 0;
        } else if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override
    public final p d(boolean z4, boolean z10) {
        int i10;
        if (z10 == z4) {
            i10 = 0;
        } else if (z10) {
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
