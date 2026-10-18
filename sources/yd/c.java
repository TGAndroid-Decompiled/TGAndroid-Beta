package yd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.i;
import md.h;
import v7.i8;
public final class c implements Iterator, kd.c {
    public int f50167a;
    public Object f50168b;
    public kd.c f50169c;

    public final RuntimeException a() {
        int i10 = this.f50167a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f50167a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(Object obj, h hVar) {
        this.f50168b = obj;
        this.f50167a = 3;
        this.f50169c = hVar;
        ld.a aVar = ld.a.f16000a;
    }

    @Override
    public final kd.h getContext() {
        return i.f15030a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f50167a;
            if (i10 != 0) {
                break;
            }
            this.f50167a = 5;
            kd.c cVar = this.f50169c;
            kotlin.jvm.internal.i.b(cVar);
            this.f50169c = null;
            cVar.resumeWith(id.i.f12777a);
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
        int i10 = this.f50167a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f50167a = 0;
                    Object obj = this.f50168b;
                    this.f50168b = null;
                    return obj;
                }
                throw a();
            }
            this.f50167a = 1;
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
        this.f50167a = 4;
    }
}
