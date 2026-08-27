package p8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class w {

    public Object[] f45596a;

    public int f45597b;

    public boolean f45598c;

    public w() {
        l.a(4, "initialCapacity");
        this.f45596a = new Object[4];
        this.f45597b = 0;
    }

    public static int d(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.f45597b + 1);
        Object[] objArr = this.f45596a;
        int i10 = this.f45597b;
        this.f45597b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void b(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            e(list2.size() + this.f45597b);
            if (list2 instanceof u) {
                this.f45597b = ((u) list2).n(this.f45597b, this.f45596a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final l0 c() {
        this.f45598c = true;
        return z.s(this.f45597b, this.f45596a);
    }

    public final void e(int i10) {
        Object[] objArr = this.f45596a;
        if (objArr.length < i10) {
            this.f45596a = Arrays.copyOf(objArr, d(objArr.length, i10));
            this.f45598c = false;
        } else if (this.f45598c) {
            this.f45596a = (Object[]) objArr.clone();
            this.f45598c = false;
        }
    }
}
