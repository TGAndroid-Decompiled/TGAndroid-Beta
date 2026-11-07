package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f58600a;
    public Object f58601b;
    public final b f58602c;

    public a(b bVar) {
        this.f58602c = bVar;
        this.f58600a = bVar.f58604b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f58602c.f58604b) {
            try {
                this.f58601b = null;
                while (true) {
                    if (this.f58601b != null || (i7 = this.f58600a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f58602c.f58604b;
                    int i10 = i7 - 1;
                    this.f58600a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f58602c.f58605c.contains(reference)) {
                        this.f58601b = obj;
                        break;
                    }
                }
                if (this.f58601b == null) {
                    b bVar = this.f58602c;
                    if (bVar.f58603a) {
                        ArrayList arrayList2 = bVar.f58604b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f58605c;
                        if (bVar.f58606e) {
                            bVar.f58606e = false;
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
        if (this.f58601b == null) {
            Semaphore semaphore = this.f58602c.f58607f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f58601b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
