package wd;

import gd.k;
import id.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.i;
import kotlin.jvm.internal.j;
public final class c implements Iterator, id.c {
    public int f57643a;
    public Object f57644b;
    public id.c f57645c;

    public final RuntimeException a() {
        int i7 = this.f57643a;
        if (i7 != 4) {
            if (i7 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f57643a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(Object obj, i iVar) {
        this.f57644b = obj;
        this.f57643a = 3;
        this.f57645c = iVar;
        jd.a aVar = jd.a.f16646a;
    }

    @Override
    public final h getContext() {
        return id.i.f15456a;
    }

    @Override
    public final boolean hasNext() {
        int i7;
        while (true) {
            i7 = this.f57643a;
            if (i7 != 0) {
                break;
            }
            this.f57643a = 5;
            id.c cVar = this.f57645c;
            j.b(cVar);
            this.f57645c = null;
            cVar.resumeWith(k.f13829a);
        }
        if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                return true;
            }
            if (i7 == 4) {
                return false;
            }
            throw a();
        }
        j.b(null);
        throw null;
    }

    @Override
    public final Object next() {
        int i7 = this.f57643a;
        if (i7 != 0 && i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    this.f57643a = 0;
                    Object obj = this.f57644b;
                    this.f57644b = null;
                    return obj;
                }
                throw a();
            }
            this.f57643a = 1;
            j.b(null);
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
        af.b.c(obj);
        this.f57643a = 4;
    }
}
