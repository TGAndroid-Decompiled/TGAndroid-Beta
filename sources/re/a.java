package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45253a;
    public Object f45254b;
    public final b f45255c;

    public a(b bVar) {
        this.f45255c = bVar;
        this.f45253a = bVar.f45257b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45255c.f45257b) {
            try {
                this.f45254b = null;
                while (true) {
                    if (this.f45254b != null || (i10 = this.f45253a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45255c.f45257b;
                    int i11 = i10 - 1;
                    this.f45253a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45255c.f45258c.contains(reference)) {
                        this.f45254b = obj;
                        break;
                    }
                }
                if (this.f45254b == null) {
                    b bVar = this.f45255c;
                    if (bVar.f45256a) {
                        ArrayList arrayList2 = bVar.f45257b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45258c;
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
        if (this.f45254b == null) {
            Semaphore semaphore = this.f45255c.f45259f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45254b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
