package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f58570a;
    public Object f58571b;
    public final b f58572c;

    public a(b bVar) {
        this.f58572c = bVar;
        this.f58570a = bVar.f58574b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f58572c.f58574b) {
            try {
                this.f58571b = null;
                while (true) {
                    if (this.f58571b != null || (i7 = this.f58570a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f58572c.f58574b;
                    int i10 = i7 - 1;
                    this.f58570a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f58572c.f58575c.contains(reference)) {
                        this.f58571b = obj;
                        break;
                    }
                }
                if (this.f58571b == null) {
                    b bVar = this.f58572c;
                    if (bVar.f58573a) {
                        ArrayList arrayList2 = bVar.f58574b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f58575c;
                        if (bVar.f58576e) {
                            bVar.f58576e = false;
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
        if (this.f58571b == null) {
            Semaphore semaphore = this.f58572c.f58577f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f58571b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
