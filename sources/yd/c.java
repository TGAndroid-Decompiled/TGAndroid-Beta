package yd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.i;
import md.h;
import v7.i8;
public final class c implements Iterator, kd.c {
    public int f50131a;
    public Object f50132b;
    public kd.c f50133c;

    public final RuntimeException a() {
        int i10 = this.f50131a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f50131a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(Object obj, h hVar) {
        this.f50132b = obj;
        this.f50131a = 3;
        this.f50133c = hVar;
        ld.a aVar = ld.a.f15999a;
    }

    @Override
    public final kd.h getContext() {
        return i.f15029a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f50131a;
            if (i10 != 0) {
                break;
            }
            this.f50131a = 5;
            kd.c cVar = this.f50133c;
            kotlin.jvm.internal.i.b(cVar);
            this.f50133c = null;
            cVar.resumeWith(id.i.f12775a);
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
        int i10 = this.f50131a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f50131a = 0;
                    Object obj = this.f50132b;
                    this.f50132b = null;
                    return obj;
                }
                throw a();
            }
            this.f50131a = 1;
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
        i8.b(obj);
        this.f50131a = 4;
    }
}
