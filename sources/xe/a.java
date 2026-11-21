package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f60492a;
    public Object f60493b;
    public final b f60494c;

    public a(b bVar) {
        this.f60494c = bVar;
        this.f60492a = bVar.f60496b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f60494c.f60496b) {
            try {
                this.f60493b = null;
                while (true) {
                    if (this.f60493b != null || (i7 = this.f60492a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f60494c.f60496b;
                    int i10 = i7 - 1;
                    this.f60492a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f60494c.f60497c.contains(reference)) {
                        this.f60493b = obj;
                        break;
                    }
                }
                if (this.f60493b == null) {
                    b bVar = this.f60494c;
                    if (bVar.f60495a) {
                        ArrayList arrayList2 = bVar.f60496b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f60497c;
                        if (bVar.f60498e) {
                            bVar.f60498e = false;
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
        if (this.f60493b == null) {
            Semaphore semaphore = this.f60494c.f60499f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f60493b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
