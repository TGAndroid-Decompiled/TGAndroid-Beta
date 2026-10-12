package qe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f46066a;
    public Object f46067b;
    public final b f46068c;

    public a(b bVar) {
        this.f46068c = bVar;
        this.f46066a = bVar.f46070b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f46068c.f46070b) {
            try {
                this.f46067b = null;
                while (true) {
                    if (this.f46067b != null || (i10 = this.f46066a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f46068c.f46070b;
                    int i11 = i10 - 1;
                    this.f46066a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f46068c.f46071c.contains(reference)) {
                        this.f46067b = obj;
                        break;
                    }
                }
                if (this.f46067b == null) {
                    b bVar = this.f46068c;
                    if (bVar.f46069a) {
                        ArrayList arrayList2 = bVar.f46070b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f46071c;
                        if (bVar.f46072e) {
                            bVar.f46072e = false;
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
        if (this.f46067b == null) {
            Semaphore semaphore = this.f46068c.f46073f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f46067b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
