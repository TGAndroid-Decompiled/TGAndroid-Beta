package qe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f46233a;
    public Object f46234b;
    public final b f46235c;

    public a(b bVar) {
        this.f46235c = bVar;
        this.f46233a = bVar.f46237b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f46235c.f46237b) {
            try {
                this.f46234b = null;
                while (true) {
                    if (this.f46234b != null || (i10 = this.f46233a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f46235c.f46237b;
                    int i11 = i10 - 1;
                    this.f46233a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f46235c.f46238c.contains(reference)) {
                        this.f46234b = obj;
                        break;
                    }
                }
                if (this.f46234b == null) {
                    b bVar = this.f46235c;
                    if (bVar.f46236a) {
                        ArrayList arrayList2 = bVar.f46237b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f46238c;
                        if (bVar.f46239e) {
                            bVar.f46239e = false;
                            if (!arrayList4.isEmpty()) {
                                arrayList2.removeAll(arrayList4);
                                arrayList4.clear();
                            }
                            if (!arrayList3.isEmpty()) {
                                arrayList2.addAll(arrayList3);
                                arrayList3.clear();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f46234b == null) {
            Semaphore semaphore = this.f46235c.f46240f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f46234b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
