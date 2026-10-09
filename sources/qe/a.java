package qe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f46119a;
    public Object f46120b;
    public final b f46121c;

    public a(b bVar) {
        this.f46121c = bVar;
        this.f46119a = bVar.f46123b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f46121c.f46123b) {
            try {
                this.f46120b = null;
                while (true) {
                    if (this.f46120b != null || (i10 = this.f46119a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f46121c.f46123b;
                    int i11 = i10 - 1;
                    this.f46119a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f46121c.f46124c.contains(reference)) {
                        this.f46120b = obj;
                        break;
                    }
                }
                if (this.f46120b == null) {
                    b bVar = this.f46121c;
                    if (bVar.f46122a) {
                        ArrayList arrayList2 = bVar.f46123b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f46124c;
                        if (bVar.f46125e) {
                            bVar.f46125e = false;
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
        if (this.f46120b == null) {
            Semaphore semaphore = this.f46121c.f46126f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f46120b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
