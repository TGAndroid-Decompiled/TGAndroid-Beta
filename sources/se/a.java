package se;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f48089a;
    public Object f48090b;
    public final b f48091c;

    public a(b bVar) {
        this.f48091c = bVar;
        this.f48089a = bVar.f48093b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f48091c.f48093b) {
            try {
                this.f48090b = null;
                while (true) {
                    if (this.f48090b != null || (i10 = this.f48089a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f48091c.f48093b;
                    int i11 = i10 - 1;
                    this.f48089a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f48091c.f48094c.contains(reference)) {
                        this.f48090b = obj;
                        break;
                    }
                }
                if (this.f48090b == null) {
                    b bVar = this.f48091c;
                    if (bVar.f48092a) {
                        ArrayList arrayList2 = bVar.f48093b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f48094c;
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
        if (this.f48090b == null) {
            Semaphore semaphore = this.f48091c.f48095f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f48090b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
