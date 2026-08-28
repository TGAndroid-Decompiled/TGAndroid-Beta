package xd;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f49105a;
    public Object f49106b;
    public final b f49107c;

    public a(b bVar) {
        this.f49107c = bVar;
        this.f49105a = bVar.f49109b.size();
    }

    @Override
    public final boolean hasNext() {
        int i9;
        synchronized (this.f49107c.f49109b) {
            try {
                this.f49106b = null;
                while (true) {
                    if (this.f49106b != null || (i9 = this.f49105a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f49107c.f49109b;
                    int i10 = i9 - 1;
                    this.f49105a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f49107c.f49110c.contains(reference)) {
                        this.f49106b = obj;
                        break;
                    }
                }
                if (this.f49106b == null) {
                    b bVar = this.f49107c;
                    if (bVar.f49108a) {
                        ArrayList arrayList2 = bVar.f49109b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f49110c;
                        if (bVar.f49111e) {
                            bVar.f49111e = false;
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
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f49106b == null) {
            Semaphore semaphore = this.f49107c.f49112f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f49106b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
