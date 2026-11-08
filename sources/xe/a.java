package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f58689a;
    public Object f58690b;
    public final b f58691c;

    public a(b bVar) {
        this.f58691c = bVar;
        this.f58689a = bVar.f58693b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f58691c.f58693b) {
            try {
                this.f58690b = null;
                while (true) {
                    if (this.f58690b != null || (i7 = this.f58689a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f58691c.f58693b;
                    int i10 = i7 - 1;
                    this.f58689a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f58691c.f58694c.contains(reference)) {
                        this.f58690b = obj;
                        break;
                    }
                }
                if (this.f58690b == null) {
                    b bVar = this.f58691c;
                    if (bVar.f58692a) {
                        ArrayList arrayList2 = bVar.f58693b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f58694c;
                        if (bVar.f58695e) {
                            bVar.f58695e = false;
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
        if (this.f58690b == null) {
            Semaphore semaphore = this.f58691c.f58696f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f58690b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
