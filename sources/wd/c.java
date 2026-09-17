package wd;

import id.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.i;
import v7.t7;
public final class c implements Iterator, id.c {
    public int f45038a;
    public Object f45039b;
    public id.c f45040c;

    public final RuntimeException a() {
        int i10 = this.f45038a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f45038a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, i iVar) {
        this.f45039b = obj;
        this.f45038a = 3;
        this.f45040c = iVar;
        jd.a aVar = jd.a.f12970a;
    }

    @Override
    public final h getContext() {
        return id.i.f11084a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f45038a;
            if (i10 != 0) {
                break;
            }
            this.f45038a = 5;
            id.c cVar = this.f45040c;
            kotlin.jvm.internal.i.b(cVar);
            this.f45040c = null;
            cVar.resumeWith(gd.i.f9621a);
        }
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            throw a();
        }
        kotlin.jvm.internal.i.b(null);
        throw null;
    }

    @Override
    public final Object next() {
        int i10 = this.f45038a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f45038a = 0;
                    Object obj = this.f45039b;
                    this.f45039b = null;
                    return obj;
                }
                throw a();
            }
            this.f45038a = 1;
            kotlin.jvm.internal.i.b(null);
            throw null;
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void resumeWith(Object obj) {
        t7.b(obj);
        this.f45038a = 4;
    }
}
