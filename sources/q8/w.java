package q8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public final class w {
    public Object[] f46503a;
    public int f46504b;
    public boolean f46505c;

    public w() {
        l.a(4, "initialCapacity");
        this.f46503a = new Object[4];
        this.f46504b = 0;
    }

    public static int d(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.f46504b + 1);
        Object[] objArr = this.f46503a;
        int i10 = this.f46504b;
        this.f46504b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void b(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            e(list2.size() + this.f46504b);
            if (list2 instanceof u) {
                this.f46504b = ((u) list2).n(this.f46504b, this.f46503a);
                return;
            }
        }
        for (Object obj : list) {
            a(obj);
        }
    }

    public final l0 c() {
        this.f46505c = true;
        return z.s(this.f46504b, this.f46503a);
    }

    public final void e(int i10) {
        Object[] objArr = this.f46503a;
        if (objArr.length < i10) {
            this.f46503a = Arrays.copyOf(objArr, d(objArr.length, i10));
            this.f46505c = false;
        } else if (this.f46505c) {
            this.f46503a = (Object[]) objArr.clone();
            this.f46505c = false;
        }
    }
}
