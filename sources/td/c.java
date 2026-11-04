package td;

import b8.ib;
import dd.k;
import fd.h;
import hd.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public final class c implements Iterator, fd.c {
    public int f55082a;
    public Object f55083b;
    public fd.c f55084c;

    public final RuntimeException a() {
        int i3 = this.f55082a;
        if (i3 != 4) {
            if (i3 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f55082a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(Object obj, i iVar) {
        this.f55083b = obj;
        this.f55082a = 3;
        this.f55084c = iVar;
        gd.a aVar = gd.a.f12241a;
    }

    @Override
    public final h getContext() {
        return fd.i.f11567a;
    }

    @Override
    public final boolean hasNext() {
        int i3;
        while (true) {
            i3 = this.f55082a;
            if (i3 != 0) {
                break;
            }
            this.f55082a = 5;
            fd.c cVar = this.f55084c;
            j.b(cVar);
            this.f55084c = null;
            cVar.resumeWith(k.f8801a);
        }
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                return true;
            }
            if (i3 == 4) {
                return false;
            }
            throw a();
        }
        j.b(null);
        throw null;
    }

    @Override
    public final Object next() {
        int i3 = this.f55082a;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    this.f55082a = 0;
                    Object obj = this.f55083b;
                    this.f55083b = null;
                    return obj;
                }
                throw a();
            }
            this.f55082a = 1;
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
        ib.b(obj);
        this.f55082a = 4;
    }
}
