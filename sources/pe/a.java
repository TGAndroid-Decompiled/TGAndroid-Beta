package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f44369a;
    public Object f44370b;
    public final b f44371c;

    public a(b bVar) {
        this.f44371c = bVar;
        this.f44369a = bVar.f44373b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f44371c.f44373b) {
            try {
                this.f44370b = null;
                while (true) {
                    if (this.f44370b != null || (i10 = this.f44369a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f44371c.f44373b;
                    int i11 = i10 - 1;
                    this.f44369a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f44371c.f44374c.contains(reference)) {
                        this.f44370b = obj;
                        break;
                    }
                }
                if (this.f44370b == null) {
                    b bVar = this.f44371c;
                    if (bVar.f44372a) {
                        ArrayList arrayList2 = bVar.f44373b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f44374c;
                        if (bVar.f44375e) {
                            bVar.f44375e = false;
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
        if (this.f44370b == null) {
            Semaphore semaphore = this.f44371c.f44376f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f44370b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
