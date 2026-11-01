package qd;

import ad.j;
import cd.h;
import ed.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class c implements Iterator, cd.c {
    public int f45522a;
    public Object f45523b;
    public cd.c f45524c;

    public final RuntimeException a() {
        int i10 = this.f45522a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f45522a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(Object obj, i iVar) {
        this.f45523b = obj;
        this.f45522a = 3;
        this.f45524c = iVar;
        dd.a aVar = dd.a.f5864a;
    }

    @Override
    public final h getContext() {
        return cd.i.f4123a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f45522a;
            if (i10 != 0) {
                break;
            }
            this.f45522a = 5;
            cd.c cVar = this.f45524c;
            kotlin.jvm.internal.i.b(cVar);
            this.f45524c = null;
            cVar.resumeWith(j.f401a);
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
        int i10 = this.f45522a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f45522a = 0;
                    Object obj = this.f45523b;
                    this.f45523b = null;
                    return obj;
                }
                throw a();
            }
            this.f45522a = 1;
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
        l9.b.b(obj);
        this.f45522a = 4;
    }
}
