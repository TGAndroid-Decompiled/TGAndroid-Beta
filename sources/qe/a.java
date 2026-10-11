package qe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f46199a;
    public Object f46200b;
    public final b f46201c;

    public a(b bVar) {
        this.f46201c = bVar;
        this.f46199a = bVar.f46203b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f46201c.f46203b) {
            try {
                this.f46200b = null;
                while (true) {
                    if (this.f46200b != null || (i10 = this.f46199a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f46201c.f46203b;
                    int i11 = i10 - 1;
                    this.f46199a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f46201c.f46204c.contains(reference)) {
                        this.f46200b = obj;
                        break;
                    }
                }
                if (this.f46200b == null) {
                    b bVar = this.f46201c;
                    if (bVar.f46202a) {
                        ArrayList arrayList2 = bVar.f46203b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f46204c;
                        if (bVar.f46205e) {
                            bVar.f46205e = false;
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
        if (this.f46200b == null) {
            Semaphore semaphore = this.f46201c.f46206f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f46200b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
