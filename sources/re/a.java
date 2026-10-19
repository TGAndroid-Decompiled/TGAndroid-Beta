package re;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f45227a;
    public Object f45228b;
    public final b f45229c;

    public a(b bVar) {
        this.f45229c = bVar;
        this.f45227a = bVar.f45231b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f45229c.f45231b) {
            try {
                this.f45228b = null;
                while (true) {
                    if (this.f45228b != null || (i10 = this.f45227a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f45229c.f45231b;
                    int i11 = i10 - 1;
                    this.f45227a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f45229c.f45232c.contains(reference)) {
                        this.f45228b = obj;
                        break;
                    }
                }
                if (this.f45228b == null) {
                    b bVar = this.f45229c;
                    if (bVar.f45230a) {
                        ArrayList arrayList2 = bVar.f45231b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f45232c;
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
        if (this.f45228b == null) {
            Semaphore semaphore = this.f45229c.f45233f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f45228b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
