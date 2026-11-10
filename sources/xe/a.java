package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f58697a;
    public Object f58698b;
    public final b f58699c;

    public a(b bVar) {
        this.f58699c = bVar;
        this.f58697a = bVar.f58701b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f58699c.f58701b) {
            try {
                this.f58698b = null;
                while (true) {
                    if (this.f58698b != null || (i7 = this.f58697a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f58699c.f58701b;
                    int i10 = i7 - 1;
                    this.f58697a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f58699c.f58702c.contains(reference)) {
                        this.f58698b = obj;
                        break;
                    }
                }
                if (this.f58698b == null) {
                    b bVar = this.f58699c;
                    if (bVar.f58700a) {
                        ArrayList arrayList2 = bVar.f58701b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f58702c;
                        if (bVar.f58703e) {
                            bVar.f58703e = false;
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
        if (this.f58698b == null) {
            Semaphore semaphore = this.f58699c.f58704f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f58698b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
