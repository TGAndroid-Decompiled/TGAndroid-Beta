package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f41071a;
    public Object f41072b;
    public final b f41073c;

    public a(b bVar) {
        this.f41073c = bVar;
        this.f41071a = bVar.f41075b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f41073c.f41075b) {
            try {
                this.f41072b = null;
                while (true) {
                    if (this.f41072b != null || (i10 = this.f41071a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f41073c.f41075b;
                    int i11 = i10 - 1;
                    this.f41071a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f41073c.f41076c.contains(reference)) {
                        this.f41072b = obj;
                        break;
                    }
                }
                if (this.f41072b == null) {
                    b bVar = this.f41073c;
                    if (bVar.f41074a) {
                        ArrayList arrayList2 = bVar.f41075b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f41076c;
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
        if (this.f41072b == null) {
            Semaphore semaphore = this.f41073c.f41077f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f41072b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
