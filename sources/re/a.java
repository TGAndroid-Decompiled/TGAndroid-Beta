package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45239a;
    public Object f45240b;
    public final b f45241c;

    public a(b bVar) {
        this.f45241c = bVar;
        this.f45239a = bVar.f45243b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45241c.f45243b) {
            try {
                this.f45240b = null;
                while (true) {
                    if (this.f45240b != null || (i10 = this.f45239a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45241c.f45243b;
                    int i11 = i10 - 1;
                    this.f45239a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45241c.f45244c.contains(reference)) {
                        this.f45240b = obj;
                        break;
                    }
                }
                if (this.f45240b == null) {
                    b bVar = this.f45241c;
                    if (bVar.f45242a) {
                        ArrayList arrayList2 = bVar.f45243b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45244c;
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
        if (this.f45240b == null) {
            Semaphore semaphore = this.f45241c.f45245f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45240b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
