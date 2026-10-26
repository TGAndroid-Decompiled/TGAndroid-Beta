package se;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f48092a;
    public Object f48093b;
    public final b f48094c;

    public a(b bVar) {
        this.f48094c = bVar;
        this.f48092a = bVar.f48096b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f48094c.f48096b) {
            try {
                this.f48093b = null;
                while (true) {
                    if (this.f48093b != null || (i10 = this.f48092a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f48094c.f48096b;
                    int i11 = i10 - 1;
                    this.f48092a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f48094c.f48097c.contains(reference)) {
                        this.f48093b = obj;
                        break;
                    }
                }
                if (this.f48093b == null) {
                    b bVar = this.f48094c;
                    if (bVar.f48095a) {
                        ArrayList arrayList2 = bVar.f48096b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f48097c;
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
        if (this.f48093b == null) {
            Semaphore semaphore = this.f48094c.f48098f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f48093b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
