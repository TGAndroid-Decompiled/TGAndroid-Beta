package qe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f46165a;
    public Object f46166b;
    public final b f46167c;

    public a(b bVar) {
        this.f46167c = bVar;
        this.f46165a = bVar.f46169b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f46167c.f46169b) {
            try {
                this.f46166b = null;
                while (true) {
                    if (this.f46166b != null || (i10 = this.f46165a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f46167c.f46169b;
                    int i11 = i10 - 1;
                    this.f46165a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f46167c.f46170c.contains(reference)) {
                        this.f46166b = obj;
                        break;
                    }
                }
                if (this.f46166b == null) {
                    b bVar = this.f46167c;
                    if (bVar.f46168a) {
                        ArrayList arrayList2 = bVar.f46169b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f46170c;
                        if (bVar.f46171e) {
                            bVar.f46171e = false;
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
        if (this.f46166b == null) {
            Semaphore semaphore = this.f46167c.f46172f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f46166b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
