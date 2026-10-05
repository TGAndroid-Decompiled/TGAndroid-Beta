package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f44383a;
    public Object f44384b;
    public final b f44385c;

    public a(b bVar) {
        this.f44385c = bVar;
        this.f44383a = bVar.f44387b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f44385c.f44387b) {
            try {
                this.f44384b = null;
                while (true) {
                    if (this.f44384b != null || (i10 = this.f44383a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f44385c.f44387b;
                    int i11 = i10 - 1;
                    this.f44383a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f44385c.f44388c.contains(reference)) {
                        this.f44384b = obj;
                        break;
                    }
                }
                if (this.f44384b == null) {
                    b bVar = this.f44385c;
                    if (bVar.f44386a) {
                        ArrayList arrayList2 = bVar.f44387b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f44388c;
                        if (bVar.f44389e) {
                            bVar.f44389e = false;
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
        if (this.f44384b == null) {
            Semaphore semaphore = this.f44385c.f44390f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f44384b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
