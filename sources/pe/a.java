package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f44028a;
    public Object f44029b;
    public final b f44030c;

    public a(b bVar) {
        this.f44030c = bVar;
        this.f44028a = bVar.f44032b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f44030c.f44032b) {
            try {
                this.f44029b = null;
                while (true) {
                    if (this.f44029b != null || (i10 = this.f44028a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f44030c.f44032b;
                    int i11 = i10 - 1;
                    this.f44028a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f44030c.f44033c.contains(reference)) {
                        this.f44029b = obj;
                        break;
                    }
                }
                if (this.f44029b == null) {
                    b bVar = this.f44030c;
                    if (bVar.f44031a) {
                        ArrayList arrayList2 = bVar.f44032b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f44033c;
                        if (bVar.f44034e) {
                            bVar.f44034e = false;
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
        if (this.f44029b == null) {
            Semaphore semaphore = this.f44030c.f44035f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f44029b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
