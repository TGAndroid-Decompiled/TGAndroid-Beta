package q8;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class d0 extends x0 {
    public int f46442a;
    public Object f46443b;
    public final int f46444c;
    public final Iterator d;
    public final Object f46445e;

    public d0() {
        this.f46442a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i10 = this.f46442a;
        if (i10 != 4) {
            int b10 = m1.j.b(i10);
            if (b10 == 0) {
                return true;
            }
            if (b10 != 2) {
                this.f46442a = 4;
                switch (this.f46444c) {
                    case 0:
                        do {
                            Iterator it = this.d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f46442a = 3;
                                next = null;
                                break;
                            }
                        } while (!((p8.f) this.f46445e).apply(next));
                        break;
                    default:
                        do {
                            Iterator it2 = this.d;
                            if (it2.hasNext()) {
                                next = it2.next();
                            } else {
                                this.f46442a = 3;
                                next = null;
                                break;
                            }
                        } while (!((t0) this.f46445e).f46497b.contains(next));
                        break;
                }
                this.f46443b = next;
                if (this.f46442a != 3) {
                    this.f46442a = 1;
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f46442a = 2;
            Object obj = this.f46443b;
            this.f46443b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public d0(Iterator it, p8.f fVar) {
        this();
        this.f46444c = 0;
        this.d = it;
        this.f46445e = fVar;
    }

    public d0(t0 t0Var) {
        this();
        this.f46444c = 1;
        this.f46445e = t0Var;
        this.d = t0Var.f46496a.iterator();
    }
}
