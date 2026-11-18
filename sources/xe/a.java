package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f60451a;
    public Object f60452b;
    public final b f60453c;

    public a(b bVar) {
        this.f60453c = bVar;
        this.f60451a = bVar.f60455b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f60453c.f60455b) {
            try {
                this.f60452b = null;
                while (true) {
                    if (this.f60452b != null || (i7 = this.f60451a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f60453c.f60455b;
                    int i10 = i7 - 1;
                    this.f60451a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f60453c.f60456c.contains(reference)) {
                        this.f60452b = obj;
                        break;
                    }
                }
                if (this.f60452b == null) {
                    b bVar = this.f60453c;
                    if (bVar.f60454a) {
                        ArrayList arrayList2 = bVar.f60455b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f60456c;
                        if (bVar.f60457e) {
                            bVar.f60457e = false;
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
        if (this.f60452b == null) {
            Semaphore semaphore = this.f60453c.f60458f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f60452b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
