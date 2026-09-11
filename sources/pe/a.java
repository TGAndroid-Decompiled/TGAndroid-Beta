package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f44027a;
    public Object f44028b;
    public final b f44029c;

    public a(b bVar) {
        this.f44029c = bVar;
        this.f44027a = bVar.f44031b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f44029c.f44031b) {
            try {
                this.f44028b = null;
                while (true) {
                    if (this.f44028b != null || (i10 = this.f44027a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f44029c.f44031b;
                    int i11 = i10 - 1;
                    this.f44027a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f44029c.f44032c.contains(reference)) {
                        this.f44028b = obj;
                        break;
                    }
                }
                if (this.f44028b == null) {
                    b bVar = this.f44029c;
                    if (bVar.f44030a) {
                        ArrayList arrayList2 = bVar.f44031b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f44032c;
                        if (bVar.f44033e) {
                            bVar.f44033e = false;
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
        if (this.f44028b == null) {
            Semaphore semaphore = this.f44029c.f44034f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f44028b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
