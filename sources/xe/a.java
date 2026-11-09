package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f58699a;
    public Object f58700b;
    public final b f58701c;

    public a(b bVar) {
        this.f58701c = bVar;
        this.f58699a = bVar.f58703b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f58701c.f58703b) {
            try {
                this.f58700b = null;
                while (true) {
                    if (this.f58700b != null || (i7 = this.f58699a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f58701c.f58703b;
                    int i10 = i7 - 1;
                    this.f58699a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f58701c.f58704c.contains(reference)) {
                        this.f58700b = obj;
                        break;
                    }
                }
                if (this.f58700b == null) {
                    b bVar = this.f58701c;
                    if (bVar.f58702a) {
                        ArrayList arrayList2 = bVar.f58703b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f58704c;
                        if (bVar.f58705e) {
                            bVar.f58705e = false;
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
        if (this.f58700b == null) {
            Semaphore semaphore = this.f58701c.f58706f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f58700b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
