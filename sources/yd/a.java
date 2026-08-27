package yd;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;

public final class a implements Iterator {

    public int f49821a;

    public Object f49822b;

    public final b f49823c;

    public a(b bVar) {
        this.f49823c = bVar;
        this.f49821a = bVar.f49825b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f49823c.f49825b) {
            try {
                this.f49822b = null;
                while (this.f49822b == null && (i10 = this.f49821a) > 0) {
                    ArrayList arrayList = this.f49823c.f49825b;
                    int i11 = i10 - 1;
                    this.f49821a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f49823c.f49826c.contains(reference)) {
                        this.f49822b = obj;
                        break;
                    }
                }
                if (this.f49822b == null) {
                    b bVar = this.f49823c;
                    if (bVar.f49824a) {
                        ArrayList arrayList2 = bVar.f49825b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f49826c;
                        if (!bVar.f49827e) {
                            throw new IllegalStateException();
                        }
                        bVar.f49827e = false;
                        if (!arrayList4.isEmpty()) {
                            arrayList2.removeAll(arrayList4);
                            arrayList4.clear();
                        }
                        if (!arrayList3.isEmpty()) {
                            arrayList2.addAll(arrayList3);
                            arrayList3.clear();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f49822b != null) {
            return true;
        }
        Semaphore semaphore = this.f49823c.f49828f;
        if (semaphore != null) {
            semaphore.release();
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f49822b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
