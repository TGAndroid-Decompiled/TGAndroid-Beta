package s8;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class a0 extends u0 {
    public int f47118a;
    public Object f47119b;
    public final int f47120c;
    public final Iterator d;
    public final Object f47121e;

    public a0() {
        this.f47118a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i10 = this.f47118a;
        if (i10 != 4) {
            int c3 = m1.j.c(i10);
            if (c3 == 0) {
                return true;
            }
            if (c3 != 2) {
                this.f47118a = 4;
                switch (this.f47120c) {
                    case 0:
                        do {
                            Iterator it = this.d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f47118a = 3;
                                next = null;
                                break;
                            }
                        } while (!((r8.f) this.f47121e).apply(next));
                        break;
                    default:
                        do {
                            Iterator it2 = this.d;
                            if (it2.hasNext()) {
                                next = it2.next();
                            } else {
                                this.f47118a = 3;
                                next = null;
                                break;
                            }
                        } while (!((q0) this.f47121e).f47164b.contains(next));
                        break;
                }
                this.f47119b = next;
                if (this.f47118a != 3) {
                    this.f47118a = 1;
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
            this.f47118a = 2;
            Object obj = this.f47119b;
            this.f47119b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public a0(Iterator it, r8.f fVar) {
        this();
        this.f47120c = 0;
        this.d = it;
        this.f47121e = fVar;
    }

    public a0(q0 q0Var) {
        this();
        this.f47120c = 1;
        this.f47121e = q0Var;
        this.d = q0Var.f47163a.iterator();
    }
}
