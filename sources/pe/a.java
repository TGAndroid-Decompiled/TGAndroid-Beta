package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f41010a;
    public Object f41011b;
    public final b f41012c;

    public a(b bVar) {
        this.f41012c = bVar;
        this.f41010a = bVar.f41014b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f41012c.f41014b) {
            try {
                this.f41011b = null;
                while (true) {
                    if (this.f41011b != null || (i10 = this.f41010a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f41012c.f41014b;
                    int i11 = i10 - 1;
                    this.f41010a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f41012c.f41015c.contains(reference)) {
                        this.f41011b = obj;
                        break;
                    }
                }
                if (this.f41011b == null) {
                    b bVar = this.f41012c;
                    if (bVar.f41013a) {
                        ArrayList arrayList2 = bVar.f41014b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f41015c;
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
        if (this.f41011b == null) {
            Semaphore semaphore = this.f41012c.f41016f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f41011b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
