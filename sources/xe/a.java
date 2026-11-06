package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f58595a;
    public Object f58596b;
    public final b f58597c;

    public a(b bVar) {
        this.f58597c = bVar;
        this.f58595a = bVar.f58599b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f58597c.f58599b) {
            try {
                this.f58596b = null;
                while (true) {
                    if (this.f58596b != null || (i7 = this.f58595a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f58597c.f58599b;
                    int i10 = i7 - 1;
                    this.f58595a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f58597c.f58600c.contains(reference)) {
                        this.f58596b = obj;
                        break;
                    }
                }
                if (this.f58596b == null) {
                    b bVar = this.f58597c;
                    if (bVar.f58598a) {
                        ArrayList arrayList2 = bVar.f58599b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f58600c;
                        if (bVar.f58601e) {
                            bVar.f58601e = false;
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
        if (this.f58596b == null) {
            Semaphore semaphore = this.f58597c.f58602f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f58596b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
