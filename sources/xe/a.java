package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f60579a;
    public Object f60580b;
    public final b f60581c;

    public a(b bVar) {
        this.f60581c = bVar;
        this.f60579a = bVar.f60583b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f60581c.f60583b) {
            try {
                this.f60580b = null;
                while (true) {
                    if (this.f60580b != null || (i7 = this.f60579a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f60581c.f60583b;
                    int i10 = i7 - 1;
                    this.f60579a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f60581c.f60584c.contains(reference)) {
                        this.f60580b = obj;
                        break;
                    }
                }
                if (this.f60580b == null) {
                    b bVar = this.f60581c;
                    if (bVar.f60582a) {
                        ArrayList arrayList2 = bVar.f60583b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f60584c;
                        if (bVar.f60585e) {
                            bVar.f60585e = false;
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
        if (this.f60580b == null) {
            Semaphore semaphore = this.f60581c.f60586f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f60580b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
