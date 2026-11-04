package ue;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f55813a;
    public Object f55814b;
    public final b f55815c;

    public a(b bVar) {
        this.f55815c = bVar;
        this.f55813a = bVar.f55817b.size();
    }

    @Override
    public final boolean hasNext() {
        int i3;
        synchronized (this.f55815c.f55817b) {
            try {
                this.f55814b = null;
                while (true) {
                    if (this.f55814b != null || (i3 = this.f55813a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f55815c.f55817b;
                    int i10 = i3 - 1;
                    this.f55813a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f55815c.f55818c.contains(reference)) {
                        this.f55814b = obj;
                        break;
                    }
                }
                if (this.f55814b == null) {
                    b bVar = this.f55815c;
                    if (bVar.f55816a) {
                        ArrayList arrayList2 = bVar.f55817b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f55818c;
                        if (bVar.f55819e) {
                            bVar.f55819e = false;
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
        if (this.f55814b == null) {
            Semaphore semaphore = this.f55815c.f55820f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f55814b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
