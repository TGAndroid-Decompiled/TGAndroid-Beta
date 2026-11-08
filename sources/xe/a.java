package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f58690a;
    public Object f58691b;
    public final b f58692c;

    public a(b bVar) {
        this.f58692c = bVar;
        this.f58690a = bVar.f58694b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f58692c.f58694b) {
            try {
                this.f58691b = null;
                while (true) {
                    if (this.f58691b != null || (i7 = this.f58690a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f58692c.f58694b;
                    int i10 = i7 - 1;
                    this.f58690a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f58692c.f58695c.contains(reference)) {
                        this.f58691b = obj;
                        break;
                    }
                }
                if (this.f58691b == null) {
                    b bVar = this.f58692c;
                    if (bVar.f58693a) {
                        ArrayList arrayList2 = bVar.f58694b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f58695c;
                        if (bVar.f58696e) {
                            bVar.f58696e = false;
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
        if (this.f58691b == null) {
            Semaphore semaphore = this.f58692c.f58697f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f58691b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
