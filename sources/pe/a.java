package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f39881a;
    public Object f39882b;
    public final b f39883c;

    public a(b bVar) {
        this.f39883c = bVar;
        this.f39881a = bVar.f39885b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f39883c.f39885b) {
            try {
                this.f39882b = null;
                while (true) {
                    if (this.f39882b != null || (i10 = this.f39881a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f39883c.f39885b;
                    int i11 = i10 - 1;
                    this.f39881a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f39883c.f39886c.contains(reference)) {
                        this.f39882b = obj;
                        break;
                    }
                }
                if (this.f39882b == null) {
                    b bVar = this.f39883c;
                    if (bVar.f39884a) {
                        ArrayList arrayList2 = bVar.f39885b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f39886c;
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
        if (this.f39882b == null) {
            Semaphore semaphore = this.f39883c.f39887f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f39882b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
