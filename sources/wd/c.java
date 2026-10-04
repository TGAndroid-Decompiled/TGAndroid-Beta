package wd;

import id.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.i;
import v7.t7;
public final class c implements Iterator, id.c {
    public int f49031a;
    public Object f49032b;
    public id.c f49033c;

    public final RuntimeException a() {
        int i10 = this.f49031a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f49031a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, i iVar) {
        this.f49032b = obj;
        this.f49031a = 3;
        this.f49033c = iVar;
        jd.a aVar = jd.a.f14087a;
    }

    @Override
    public final h getContext() {
        return id.i.f12058a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f49031a;
            if (i10 != 0) {
                break;
            }
            this.f49031a = 5;
            id.c cVar = this.f49033c;
            kotlin.jvm.internal.i.b(cVar);
            this.f49033c = null;
            cVar.resumeWith(gd.i.f10452a);
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
        int i10 = this.f49031a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f49031a = 0;
                    Object obj = this.f49032b;
                    this.f49032b = null;
                    return obj;
                }
                throw a();
            }
            this.f49031a = 1;
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
        this.f49031a = 4;
    }
}
