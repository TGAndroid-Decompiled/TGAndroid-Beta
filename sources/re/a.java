package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45225a;
    public Object f45226b;
    public final b f45227c;

    public a(b bVar) {
        this.f45227c = bVar;
        this.f45225a = bVar.f45229b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45227c.f45229b) {
            try {
                this.f45226b = null;
                while (true) {
                    if (this.f45226b != null || (i10 = this.f45225a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45227c.f45229b;
                    int i11 = i10 - 1;
                    this.f45225a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45227c.f45230c.contains(reference)) {
                        this.f45226b = obj;
                        break;
                    }
                }
                if (this.f45226b == null) {
                    b bVar = this.f45227c;
                    if (bVar.f45228a) {
                        ArrayList arrayList2 = bVar.f45229b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45230c;
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
        if (this.f45226b == null) {
            Semaphore semaphore = this.f45227c.f45231f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45226b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
