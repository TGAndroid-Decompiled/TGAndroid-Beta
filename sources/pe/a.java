package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f41020a;
    public Object f41021b;
    public final b f41022c;

    public a(b bVar) {
        this.f41022c = bVar;
        this.f41020a = bVar.f41024b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f41022c.f41024b) {
            try {
                this.f41021b = null;
                while (true) {
                    if (this.f41021b != null || (i10 = this.f41020a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f41022c.f41024b;
                    int i11 = i10 - 1;
                    this.f41020a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f41022c.f41025c.contains(reference)) {
                        this.f41021b = obj;
                        break;
                    }
                }
                if (this.f41021b == null) {
                    b bVar = this.f41022c;
                    if (bVar.f41023a) {
                        ArrayList arrayList2 = bVar.f41024b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f41025c;
                        if (bVar.e) {
                            bVar.e = false;
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
        if (this.f41021b == null) {
            Semaphore semaphore = this.f41022c.f41026f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f41021b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
