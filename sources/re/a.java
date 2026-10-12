package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f44138a;
    public Object f44139b;
    public final b f44140c;

    public a(b bVar) {
        this.f44140c = bVar;
        this.f44138a = bVar.f44142b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f44140c.f44142b) {
            try {
                this.f44139b = null;
                while (true) {
                    if (this.f44139b != null || (i10 = this.f44138a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f44140c.f44142b;
                    int i11 = i10 - 1;
                    this.f44138a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f44140c.f44143c.contains(reference)) {
                        this.f44139b = obj;
                        break;
                    }
                }
                if (this.f44139b == null) {
                    b bVar = this.f44140c;
                    if (bVar.f44141a) {
                        ArrayList arrayList2 = bVar.f44142b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f44143c;
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
        if (this.f44139b == null) {
            Semaphore semaphore = this.f44140c.f44144f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f44139b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
