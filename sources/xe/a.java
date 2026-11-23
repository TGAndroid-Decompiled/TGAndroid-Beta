package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f60496a;
    public Object f60497b;
    public final b f60498c;

    public a(b bVar) {
        this.f60498c = bVar;
        this.f60496a = bVar.f60500b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f60498c.f60500b) {
            try {
                this.f60497b = null;
                while (true) {
                    if (this.f60497b != null || (i7 = this.f60496a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f60498c.f60500b;
                    int i10 = i7 - 1;
                    this.f60496a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f60498c.f60501c.contains(reference)) {
                        this.f60497b = obj;
                        break;
                    }
                }
                if (this.f60497b == null) {
                    b bVar = this.f60498c;
                    if (bVar.f60499a) {
                        ArrayList arrayList2 = bVar.f60500b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f60501c;
                        if (bVar.f60502e) {
                            bVar.f60502e = false;
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
        if (this.f60497b == null) {
            Semaphore semaphore = this.f60498c.f60503f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f60497b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
