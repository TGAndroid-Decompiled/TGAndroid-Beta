package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f40755a;
    public Object f40756b;
    public final b f40757c;

    public a(b bVar) {
        this.f40757c = bVar;
        this.f40755a = bVar.f40759b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f40757c.f40759b) {
            try {
                this.f40756b = null;
                while (true) {
                    if (this.f40756b != null || (i10 = this.f40755a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f40757c.f40759b;
                    int i11 = i10 - 1;
                    this.f40755a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f40757c.f40760c.contains(reference)) {
                        this.f40756b = obj;
                        break;
                    }
                }
                if (this.f40756b == null) {
                    b bVar = this.f40757c;
                    if (bVar.f40758a) {
                        ArrayList arrayList2 = bVar.f40759b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f40760c;
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
        if (this.f40756b == null) {
            Semaphore semaphore = this.f40757c.f40761f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f40756b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
