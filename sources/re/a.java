package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45273a;
    public Object f45274b;
    public final b f45275c;

    public a(b bVar) {
        this.f45275c = bVar;
        this.f45273a = bVar.f45277b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45275c.f45277b) {
            try {
                this.f45274b = null;
                while (true) {
                    if (this.f45274b != null || (i10 = this.f45273a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45275c.f45277b;
                    int i11 = i10 - 1;
                    this.f45273a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45275c.f45278c.contains(reference)) {
                        this.f45274b = obj;
                        break;
                    }
                }
                if (this.f45274b == null) {
                    b bVar = this.f45275c;
                    if (bVar.f45276a) {
                        ArrayList arrayList2 = bVar.f45277b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45278c;
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
        if (this.f45274b == null) {
            Semaphore semaphore = this.f45275c.f45279f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45274b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
