package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f40777a;
    public Object f40778b;
    public final b f40779c;

    public a(b bVar) {
        this.f40779c = bVar;
        this.f40777a = bVar.f40781b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f40779c.f40781b) {
            try {
                this.f40778b = null;
                while (true) {
                    if (this.f40778b != null || (i10 = this.f40777a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f40779c.f40781b;
                    int i11 = i10 - 1;
                    this.f40777a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f40779c.f40782c.contains(reference)) {
                        this.f40778b = obj;
                        break;
                    }
                }
                if (this.f40778b == null) {
                    b bVar = this.f40779c;
                    if (bVar.f40780a) {
                        ArrayList arrayList2 = bVar.f40781b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f40782c;
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
        if (this.f40778b == null) {
            Semaphore semaphore = this.f40779c.f40783f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f40778b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
