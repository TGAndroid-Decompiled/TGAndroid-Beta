package p8;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d0 extends x0 {

    public int f45535a;

    public Object f45536b;

    public final int f45537c;
    public final Iterator d;

    public final Object f45538e;

    public d0() {
        this.f45535a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i10 = this.f45535a;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iB = m1.j.b(i10);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f45535a = 4;
        switch (this.f45537c) {
            case 0:
                do {
                    Iterator it = this.d;
                    if (!it.hasNext()) {
                        this.f45535a = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((o8.f) this.f45538e).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.d;
                    if (!it2.hasNext()) {
                        this.f45535a = 3;
                        next = null;
                    } else {
                        next = it2.next();
                    }
                    break;
                } while (!((t0) this.f45538e).f45590b.contains(next));
                break;
        }
        this.f45536b = next;
        if (this.f45535a == 3) {
            return false;
        }
        this.f45535a = 1;
        return true;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f45535a = 2;
        Object obj = this.f45536b;
        this.f45536b = null;
        return obj;
    }

    public d0(Iterator it, o8.f fVar) {
        this();
        this.f45537c = 0;
        this.d = it;
        this.f45538e = fVar;
    }

    public d0(t0 t0Var) {
        this();
        this.f45537c = 1;
        this.f45538e = t0Var;
        this.d = t0Var.f45589a.iterator();
    }
}
