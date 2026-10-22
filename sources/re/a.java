package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45238a;
    public Object f45239b;
    public final b f45240c;

    public a(b bVar) {
        this.f45240c = bVar;
        this.f45238a = bVar.f45242b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45240c.f45242b) {
            try {
                this.f45239b = null;
                while (true) {
                    if (this.f45239b != null || (i10 = this.f45238a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45240c.f45242b;
                    int i11 = i10 - 1;
                    this.f45238a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45240c.f45243c.contains(reference)) {
                        this.f45239b = obj;
                        break;
                    }
                }
                if (this.f45239b == null) {
                    b bVar = this.f45240c;
                    if (bVar.f45241a) {
                        ArrayList arrayList2 = bVar.f45242b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45243c;
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
        if (this.f45239b == null) {
            Semaphore semaphore = this.f45240c.f45244f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45239b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
