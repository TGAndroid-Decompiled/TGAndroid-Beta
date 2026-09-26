package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f41022a;
    public Object f41023b;
    public final b f41024c;

    public a(b bVar) {
        this.f41024c = bVar;
        this.f41022a = bVar.f41026b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f41024c.f41026b) {
            try {
                this.f41023b = null;
                while (true) {
                    if (this.f41023b != null || (i10 = this.f41022a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f41024c.f41026b;
                    int i11 = i10 - 1;
                    this.f41022a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f41024c.f41027c.contains(reference)) {
                        this.f41023b = obj;
                        break;
                    }
                }
                if (this.f41023b == null) {
                    b bVar = this.f41024c;
                    if (bVar.f41025a) {
                        ArrayList arrayList2 = bVar.f41026b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f41027c;
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
        if (this.f41023b == null) {
            Semaphore semaphore = this.f41024c.f41028f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f41023b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
