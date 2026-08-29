package zd;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f50805a;
    public Object f50806b;
    public final b f50807c;

    public a(b bVar) {
        this.f50807c = bVar;
        this.f50805a = bVar.f50809b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f50807c.f50809b) {
            try {
                this.f50806b = null;
                while (true) {
                    if (this.f50806b != null || (i10 = this.f50805a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f50807c.f50809b;
                    int i11 = i10 - 1;
                    this.f50805a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f50807c.f50810c.contains(reference)) {
                        this.f50806b = obj;
                        break;
                    }
                }
                if (this.f50806b == null) {
                    b bVar = this.f50807c;
                    if (bVar.f50808a) {
                        ArrayList arrayList2 = bVar.f50809b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f50810c;
                        if (bVar.f50811e) {
                            bVar.f50811e = false;
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
        if (this.f50806b == null) {
            Semaphore semaphore = this.f50807c.f50812f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f50806b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
