package qe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f46121a;
    public Object f46122b;
    public final b f46123c;

    public a(b bVar) {
        this.f46123c = bVar;
        this.f46121a = bVar.f46125b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f46123c.f46125b) {
            try {
                this.f46122b = null;
                while (true) {
                    if (this.f46122b != null || (i10 = this.f46121a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f46123c.f46125b;
                    int i11 = i10 - 1;
                    this.f46121a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f46123c.f46126c.contains(reference)) {
                        this.f46122b = obj;
                        break;
                    }
                }
                if (this.f46122b == null) {
                    b bVar = this.f46123c;
                    if (bVar.f46124a) {
                        ArrayList arrayList2 = bVar.f46125b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f46126c;
                        if (bVar.f46127e) {
                            bVar.f46127e = false;
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
        if (this.f46122b == null) {
            Semaphore semaphore = this.f46123c.f46128f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f46122b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
