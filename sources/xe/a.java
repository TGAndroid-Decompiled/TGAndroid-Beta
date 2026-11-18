package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f60450a;
    public Object f60451b;
    public final b f60452c;

    public a(b bVar) {
        this.f60452c = bVar;
        this.f60450a = bVar.f60454b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f60452c.f60454b) {
            try {
                this.f60451b = null;
                while (true) {
                    if (this.f60451b != null || (i7 = this.f60450a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f60452c.f60454b;
                    int i10 = i7 - 1;
                    this.f60450a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f60452c.f60455c.contains(reference)) {
                        this.f60451b = obj;
                        break;
                    }
                }
                if (this.f60451b == null) {
                    b bVar = this.f60452c;
                    if (bVar.f60453a) {
                        ArrayList arrayList2 = bVar.f60454b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f60455c;
                        if (bVar.f60456e) {
                            bVar.f60456e = false;
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
        if (this.f60451b == null) {
            Semaphore semaphore = this.f60452c.f60457f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f60451b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
