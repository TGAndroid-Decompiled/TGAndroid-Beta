package s8;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class a0 extends u0 {
    public int f44112a;
    public Object f44113b;
    public final int f44114c;
    public final Iterator d;
    public final Object e;

    public a0() {
        this.f44112a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i10 = this.f44112a;
        if (i10 != 4) {
            int b10 = m1.j.b(i10);
            if (b10 == 0) {
                return true;
            }
            if (b10 != 2) {
                this.f44112a = 4;
                switch (this.f44114c) {
                    case 0:
                        do {
                            Iterator it = this.d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f44112a = 3;
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
                                this.f44112a = 3;
                                next = null;
                                break;
                            }
                        } while (!((q0) this.e).f44148b.contains(next));
                        break;
                }
                this.f44113b = next;
                if (this.f44112a != 3) {
                    this.f44112a = 1;
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
            this.f44112a = 2;
            Object obj = this.f44113b;
            this.f44113b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public a0(Iterator it, r8.f fVar) {
        this();
        this.f44114c = 0;
        this.d = it;
        this.e = fVar;
    }

    public a0(q0 q0Var) {
        this();
        this.f44114c = 1;
        this.e = q0Var;
        this.d = q0Var.f44147a.iterator();
    }
}
