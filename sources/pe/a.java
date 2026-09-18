package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f40782a;
    public Object f40783b;
    public final b f40784c;

    public a(b bVar) {
        this.f40784c = bVar;
        this.f40782a = bVar.f40786b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f40784c.f40786b) {
            try {
                this.f40783b = null;
                while (true) {
                    if (this.f40783b != null || (i10 = this.f40782a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f40784c.f40786b;
                    int i11 = i10 - 1;
                    this.f40782a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f40784c.f40787c.contains(reference)) {
                        this.f40783b = obj;
                        break;
                    }
                }
                if (this.f40783b == null) {
                    b bVar = this.f40784c;
                    if (bVar.f40785a) {
                        ArrayList arrayList2 = bVar.f40786b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f40787c;
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
        if (this.f40783b == null) {
            Semaphore semaphore = this.f40784c.f40788f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f40783b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
