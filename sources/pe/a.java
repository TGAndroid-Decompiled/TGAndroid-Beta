package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f44376a;
    public Object f44377b;
    public final b f44378c;

    public a(b bVar) {
        this.f44378c = bVar;
        this.f44376a = bVar.f44380b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f44378c.f44380b) {
            try {
                this.f44377b = null;
                while (true) {
                    if (this.f44377b != null || (i10 = this.f44376a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f44378c.f44380b;
                    int i11 = i10 - 1;
                    this.f44376a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f44378c.f44381c.contains(reference)) {
                        this.f44377b = obj;
                        break;
                    }
                }
                if (this.f44377b == null) {
                    b bVar = this.f44378c;
                    if (bVar.f44379a) {
                        ArrayList arrayList2 = bVar.f44380b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f44381c;
                        if (bVar.f44382e) {
                            bVar.f44382e = false;
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
        if (this.f44377b == null) {
            Semaphore semaphore = this.f44378c.f44383f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f44377b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
