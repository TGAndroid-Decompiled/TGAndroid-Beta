package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f41051a;
    public Object f41052b;
    public final b f41053c;

    public a(b bVar) {
        this.f41053c = bVar;
        this.f41051a = bVar.f41055b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f41053c.f41055b) {
            try {
                this.f41052b = null;
                while (true) {
                    if (this.f41052b != null || (i10 = this.f41051a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f41053c.f41055b;
                    int i11 = i10 - 1;
                    this.f41051a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f41053c.f41056c.contains(reference)) {
                        this.f41052b = obj;
                        break;
                    }
                }
                if (this.f41052b == null) {
                    b bVar = this.f41053c;
                    if (bVar.f41054a) {
                        ArrayList arrayList2 = bVar.f41055b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f41056c;
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
        if (this.f41052b == null) {
            Semaphore semaphore = this.f41053c.f41057f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f41052b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
