package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f60461a;
    public Object f60462b;
    public final b f60463c;

    public a(b bVar) {
        this.f60463c = bVar;
        this.f60461a = bVar.f60465b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f60463c.f60465b) {
            try {
                this.f60462b = null;
                while (true) {
                    if (this.f60462b != null || (i7 = this.f60461a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f60463c.f60465b;
                    int i10 = i7 - 1;
                    this.f60461a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f60463c.f60466c.contains(reference)) {
                        this.f60462b = obj;
                        break;
                    }
                }
                if (this.f60462b == null) {
                    b bVar = this.f60463c;
                    if (bVar.f60464a) {
                        ArrayList arrayList2 = bVar.f60465b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f60466c;
                        if (bVar.f60467e) {
                            bVar.f60467e = false;
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
        if (this.f60462b == null) {
            Semaphore semaphore = this.f60463c.f60468f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f60462b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
