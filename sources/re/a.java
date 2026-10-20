package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45235a;
    public Object f45236b;
    public final b f45237c;

    public a(b bVar) {
        this.f45237c = bVar;
        this.f45235a = bVar.f45239b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45237c.f45239b) {
            try {
                this.f45236b = null;
                while (true) {
                    if (this.f45236b != null || (i10 = this.f45235a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45237c.f45239b;
                    int i11 = i10 - 1;
                    this.f45235a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45237c.f45240c.contains(reference)) {
                        this.f45236b = obj;
                        break;
                    }
                }
                if (this.f45236b == null) {
                    b bVar = this.f45237c;
                    if (bVar.f45238a) {
                        ArrayList arrayList2 = bVar.f45239b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45240c;
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
        if (this.f45236b == null) {
            Semaphore semaphore = this.f45237c.f45241f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45236b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
