package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45650a;
    public Object f45651b;
    public final b f45652c;

    public a(b bVar) {
        this.f45652c = bVar;
        this.f45650a = bVar.f45654b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45652c.f45654b) {
            try {
                this.f45651b = null;
                while (true) {
                    if (this.f45651b != null || (i10 = this.f45650a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45652c.f45654b;
                    int i11 = i10 - 1;
                    this.f45650a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45652c.f45655c.contains(reference)) {
                        this.f45651b = obj;
                        break;
                    }
                }
                if (this.f45651b == null) {
                    b bVar = this.f45652c;
                    if (bVar.f45653a) {
                        ArrayList arrayList2 = bVar.f45654b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45655c;
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
        if (this.f45651b == null) {
            Semaphore semaphore = this.f45652c.f45656f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45651b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
