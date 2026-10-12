package qe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f46058a;
    public Object f46059b;
    public final b f46060c;

    public a(b bVar) {
        this.f46060c = bVar;
        this.f46058a = bVar.f46062b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f46060c.f46062b) {
            try {
                this.f46059b = null;
                while (true) {
                    if (this.f46059b != null || (i10 = this.f46058a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f46060c.f46062b;
                    int i11 = i10 - 1;
                    this.f46058a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f46060c.f46063c.contains(reference)) {
                        this.f46059b = obj;
                        break;
                    }
                }
                if (this.f46059b == null) {
                    b bVar = this.f46060c;
                    if (bVar.f46061a) {
                        ArrayList arrayList2 = bVar.f46062b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f46063c;
                        if (bVar.f46064e) {
                            bVar.f46064e = false;
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
        if (this.f46059b == null) {
            Semaphore semaphore = this.f46060c.f46065f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f46059b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
