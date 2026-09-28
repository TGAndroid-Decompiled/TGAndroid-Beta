package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f41023a;
    public Object f41024b;
    public final b f41025c;

    public a(b bVar) {
        this.f41025c = bVar;
        this.f41023a = bVar.f41027b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f41025c.f41027b) {
            try {
                this.f41024b = null;
                while (true) {
                    if (this.f41024b != null || (i10 = this.f41023a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f41025c.f41027b;
                    int i11 = i10 - 1;
                    this.f41023a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f41025c.f41028c.contains(reference)) {
                        this.f41024b = obj;
                        break;
                    }
                }
                if (this.f41024b == null) {
                    b bVar = this.f41025c;
                    if (bVar.f41026a) {
                        ArrayList arrayList2 = bVar.f41027b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f41028c;
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
        if (this.f41024b == null) {
            Semaphore semaphore = this.f41025c.f41029f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f41024b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
