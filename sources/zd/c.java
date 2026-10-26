package zd;

import a8.jd;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ld.i;
import nd.h;
public final class c implements Iterator, ld.c {
    public int f52850a;
    public Object f52851b;
    public ld.c f52852c;

    public final RuntimeException a() {
        int i10 = this.f52850a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f52850a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(Object obj, h hVar) {
        this.f52851b = obj;
        this.f52850a = 3;
        this.f52852c = hVar;
        md.a aVar = md.a.f18412a;
    }

    @Override
    public final ld.h getContext() {
        return i.f16988a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f52850a;
            if (i10 != 0) {
                break;
            }
            this.f52850a = 5;
            ld.c cVar = this.f52852c;
            kotlin.jvm.internal.i.b(cVar);
            this.f52852c = null;
            cVar.resumeWith(jd.i.f15580a);
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
        int i10 = this.f52850a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f52850a = 0;
                    Object obj = this.f52851b;
                    this.f52851b = null;
                    return obj;
                }
                throw a();
            }
            this.f52850a = 1;
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
        jd.b(obj);
        this.f52850a = 4;
    }
}
