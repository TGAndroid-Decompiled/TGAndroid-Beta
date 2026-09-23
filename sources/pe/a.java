package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f40706a;
    public Object f40707b;
    public final b f40708c;

    public a(b bVar) {
        this.f40708c = bVar;
        this.f40706a = bVar.f40710b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f40708c.f40710b) {
            try {
                this.f40707b = null;
                while (true) {
                    if (this.f40707b != null || (i10 = this.f40706a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f40708c.f40710b;
                    int i11 = i10 - 1;
                    this.f40706a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f40708c.f40711c.contains(reference)) {
                        this.f40707b = obj;
                        break;
                    }
                }
                if (this.f40707b == null) {
                    b bVar = this.f40708c;
                    if (bVar.f40709a) {
                        ArrayList arrayList2 = bVar.f40710b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f40711c;
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
        if (this.f40707b == null) {
            Semaphore semaphore = this.f40708c.f40712f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f40707b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
