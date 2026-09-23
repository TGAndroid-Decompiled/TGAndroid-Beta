package wd;

import id.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.i;
import v7.t7;
public final class c implements Iterator, id.c {
    public int f44965a;
    public Object f44966b;
    public id.c f44967c;

    public final RuntimeException a() {
        int i10 = this.f44965a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f44965a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, i iVar) {
        this.f44966b = obj;
        this.f44965a = 3;
        this.f44967c = iVar;
        jd.a aVar = jd.a.f12959a;
    }

    @Override
    public final h getContext() {
        return id.i.f11071a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f44965a;
            if (i10 != 0) {
                break;
            }
            this.f44965a = 5;
            id.c cVar = this.f44967c;
            kotlin.jvm.internal.i.b(cVar);
            this.f44967c = null;
            cVar.resumeWith(gd.i.f9603a);
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
        int i10 = this.f44965a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f44965a = 0;
                    Object obj = this.f44966b;
                    this.f44966b = null;
                    return obj;
                }
                throw a();
            }
            this.f44965a = 1;
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
        this.f44965a = 4;
    }
}
