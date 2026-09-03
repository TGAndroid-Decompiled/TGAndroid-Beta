package s8;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class a0 extends u0 {
    public int f44177a;
    public Object f44178b;
    public final int f44179c;
    public final Iterator d;
    public final Object e;

    public a0() {
        this.f44177a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i10 = this.f44177a;
        if (i10 != 4) {
            int c3 = m1.j.c(i10);
            if (c3 == 0) {
                return true;
            }
            if (c3 != 2) {
                this.f44177a = 4;
                switch (this.f44179c) {
                    case 0:
                        do {
                            Iterator it = this.d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f44177a = 3;
                                next = null;
                                break;
                            }
                        } while (!((r8.f) this.e).apply(next));
                        break;
                    default:
                        do {
                            Iterator it2 = this.d;
                            if (it2.hasNext()) {
                                next = it2.next();
                            } else {
                                this.f44177a = 3;
                                next = null;
                                break;
                            }
                        } while (!((q0) this.e).f44213b.contains(next));
                        break;
                }
                this.f44178b = next;
                if (this.f44177a != 3) {
                    this.f44177a = 1;
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
            this.f44177a = 2;
            Object obj = this.f44178b;
            this.f44178b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public a0(Iterator it, r8.f fVar) {
        this();
        this.f44179c = 0;
        this.d = it;
        this.e = fVar;
    }

    public a0(q0 q0Var) {
        this();
        this.f44179c = 1;
        this.e = q0Var;
        this.d = q0Var.f44212a.iterator();
    }
}
