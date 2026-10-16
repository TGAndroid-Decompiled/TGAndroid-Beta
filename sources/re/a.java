package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f43897a;
    public Object f43898b;
    public final b f43899c;

    public a(b bVar) {
        this.f43899c = bVar;
        this.f43897a = bVar.f43901b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f43899c.f43901b) {
            try {
                this.f43898b = null;
                while (true) {
                    if (this.f43898b != null || (i10 = this.f43897a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f43899c.f43901b;
                    int i11 = i10 - 1;
                    this.f43897a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f43899c.f43902c.contains(reference)) {
                        this.f43898b = obj;
                        break;
                    }
                }
                if (this.f43898b == null) {
                    b bVar = this.f43899c;
                    if (bVar.f43900a) {
                        ArrayList arrayList2 = bVar.f43901b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f43902c;
                        if (bVar.e) {
                            bVar.e = false;
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
        if (this.f43898b == null) {
            Semaphore semaphore = this.f43899c.f43903f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f43898b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
