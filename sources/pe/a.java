package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f41021a;
    public Object f41022b;
    public final b f41023c;

    public a(b bVar) {
        this.f41023c = bVar;
        this.f41021a = bVar.f41025b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f41023c.f41025b) {
            try {
                this.f41022b = null;
                while (true) {
                    if (this.f41022b != null || (i10 = this.f41021a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f41023c.f41025b;
                    int i11 = i10 - 1;
                    this.f41021a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f41023c.f41026c.contains(reference)) {
                        this.f41022b = obj;
                        break;
                    }
                }
                if (this.f41022b == null) {
                    b bVar = this.f41023c;
                    if (bVar.f41024a) {
                        ArrayList arrayList2 = bVar.f41025b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f41026c;
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
        if (this.f41022b == null) {
            Semaphore semaphore = this.f41023c.f41027f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f41022b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
