package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f58594a;
    public Object f58595b;
    public final b f58596c;

    public a(b bVar) {
        this.f58596c = bVar;
        this.f58594a = bVar.f58598b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f58596c.f58598b) {
            try {
                this.f58595b = null;
                while (true) {
                    if (this.f58595b != null || (i7 = this.f58594a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f58596c.f58598b;
                    int i10 = i7 - 1;
                    this.f58594a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f58596c.f58599c.contains(reference)) {
                        this.f58595b = obj;
                        break;
                    }
                }
                if (this.f58595b == null) {
                    b bVar = this.f58596c;
                    if (bVar.f58597a) {
                        ArrayList arrayList2 = bVar.f58598b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f58599c;
                        if (bVar.f58600e) {
                            bVar.f58600e = false;
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
        if (this.f58595b == null) {
            Semaphore semaphore = this.f58596c.f58601f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f58595b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
