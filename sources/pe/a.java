package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f40751a;
    public Object f40752b;
    public final b f40753c;

    public a(b bVar) {
        this.f40753c = bVar;
        this.f40751a = bVar.f40755b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f40753c.f40755b) {
            try {
                this.f40752b = null;
                while (true) {
                    if (this.f40752b != null || (i10 = this.f40751a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f40753c.f40755b;
                    int i11 = i10 - 1;
                    this.f40751a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f40753c.f40756c.contains(reference)) {
                        this.f40752b = obj;
                        break;
                    }
                }
                if (this.f40752b == null) {
                    b bVar = this.f40753c;
                    if (bVar.f40754a) {
                        ArrayList arrayList2 = bVar.f40755b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f40756c;
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
        if (this.f40752b == null) {
            Semaphore semaphore = this.f40753c.f40757f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f40752b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
