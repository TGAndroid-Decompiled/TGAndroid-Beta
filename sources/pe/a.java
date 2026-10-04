package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f44368a;
    public Object f44369b;
    public final b f44370c;

    public a(b bVar) {
        this.f44370c = bVar;
        this.f44368a = bVar.f44372b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f44370c.f44372b) {
            try {
                this.f44369b = null;
                while (true) {
                    if (this.f44369b != null || (i10 = this.f44368a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f44370c.f44372b;
                    int i11 = i10 - 1;
                    this.f44368a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f44370c.f44373c.contains(reference)) {
                        this.f44369b = obj;
                        break;
                    }
                }
                if (this.f44369b == null) {
                    b bVar = this.f44370c;
                    if (bVar.f44371a) {
                        ArrayList arrayList2 = bVar.f44372b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f44373c;
                        if (bVar.f44374e) {
                            bVar.f44374e = false;
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
        if (this.f44369b == null) {
            Semaphore semaphore = this.f44370c.f44375f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f44369b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
