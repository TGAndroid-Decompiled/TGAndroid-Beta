package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f59881a;
    public Object f59882b;
    public final b f59883c;

    public a(b bVar) {
        this.f59883c = bVar;
        this.f59881a = bVar.f59885b.size();
    }

    @Override
    public final boolean hasNext() {
        int i7;
        synchronized (this.f59883c.f59885b) {
            try {
                this.f59882b = null;
                while (true) {
                    if (this.f59882b != null || (i7 = this.f59881a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f59883c.f59885b;
                    int i10 = i7 - 1;
                    this.f59881a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
                    Object obj = reference.get();
                    if (obj != null && !this.f59883c.f59886c.contains(reference)) {
                        this.f59882b = obj;
                        break;
                    }
                }
                if (this.f59882b == null) {
                    b bVar = this.f59883c;
                    if (bVar.f59884a) {
                        ArrayList arrayList2 = bVar.f59885b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f59886c;
                        if (bVar.f59887e) {
                            bVar.f59887e = false;
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
        if (this.f59882b == null) {
            Semaphore semaphore = this.f59883c.f59888f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f59882b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
