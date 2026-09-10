package wd;

import id.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.i;
import v7.u7;
public final class c implements Iterator, id.c {
    public int f43971a;
    public Object f43972b;
    public id.c f43973c;

    public final RuntimeException a() {
        int i10 = this.f43971a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f43971a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, i iVar) {
        this.f43972b = obj;
        this.f43971a = 3;
        this.f43973c = iVar;
        jd.a aVar = jd.a.f11861a;
    }

    @Override
    public final h getContext() {
        return id.i.f10565a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f43971a;
            if (i10 != 0) {
                break;
            }
            this.f43971a = 5;
            id.c cVar = this.f43973c;
            kotlin.jvm.internal.i.b(cVar);
            this.f43973c = null;
            cVar.resumeWith(gd.i.f8748a);
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
        int i10 = this.f43971a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f43971a = 0;
                    Object obj = this.f43972b;
                    this.f43972b = null;
                    return obj;
                }
                throw a();
            }
            this.f43971a = 1;
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
        u7.b(obj);
        this.f43971a = 4;
    }
}
