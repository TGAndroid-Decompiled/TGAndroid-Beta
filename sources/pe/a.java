package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f44055a;
    public Object f44056b;
    public final b f44057c;

    public a(b bVar) {
        this.f44057c = bVar;
        this.f44055a = bVar.f44059b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f44057c.f44059b) {
            try {
                this.f44056b = null;
                while (true) {
                    if (this.f44056b != null || (i10 = this.f44055a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f44057c.f44059b;
                    int i11 = i10 - 1;
                    this.f44055a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f44057c.f44060c.contains(reference)) {
                        this.f44056b = obj;
                        break;
                    }
                }
                if (this.f44056b == null) {
                    b bVar = this.f44057c;
                    if (bVar.f44058a) {
                        ArrayList arrayList2 = bVar.f44059b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f44060c;
                        if (bVar.f44061e) {
                            bVar.f44061e = false;
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
        if (this.f44056b == null) {
            Semaphore semaphore = this.f44057c.f44062f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f44056b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
