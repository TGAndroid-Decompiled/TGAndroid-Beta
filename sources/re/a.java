package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45651a;
    public Object f45652b;
    public final b f45653c;

    public a(b bVar) {
        this.f45653c = bVar;
        this.f45651a = bVar.f45655b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45653c.f45655b) {
            try {
                this.f45652b = null;
                while (true) {
                    if (this.f45652b != null || (i10 = this.f45651a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45653c.f45655b;
                    int i11 = i10 - 1;
                    this.f45651a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45653c.f45656c.contains(reference)) {
                        this.f45652b = obj;
                        break;
                    }
                }
                if (this.f45652b == null) {
                    b bVar = this.f45653c;
                    if (bVar.f45654a) {
                        ArrayList arrayList2 = bVar.f45655b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45656c;
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
        if (this.f45652b == null) {
            Semaphore semaphore = this.f45653c.f45657f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45652b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
