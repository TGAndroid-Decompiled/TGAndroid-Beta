package xe;

import c8.td;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f58693a;
    public final ArrayList f58694b;
    public final ArrayList f58695c;
    public final ArrayList d;
    public boolean f58696e;
    public final Semaphore f58697f;
    public b h;
    public a f58698n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f58694b) {
            try {
                boolean z9 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f58696e) {
                    ArrayList arrayList = this.d;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Reference reference = (Reference) arrayList.get(size);
                        if (reference != null) {
                            obj2 = reference.get();
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            arrayList.remove(size);
                        } else if (obj2 == obj) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        arrayList.add(new WeakReference(obj));
                        z9 = true;
                    }
                    td.a(this.f58695c, obj);
                    return z9;
                }
                this.f58694b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f58694b) {
            try {
                if (this.f58696e) {
                    ArrayList arrayList = this.f58694b;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Reference reference = (Reference) obj;
                        if (!this.f58695c.contains(reference)) {
                            this.f58695c.add(reference);
                        }
                        td.a(this.d, reference.get());
                    }
                } else {
                    this.f58694b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f58694b;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((Reference) arrayList.get(size)).get() == obj) {
                    return size;
                }
            }
            return -1;
        }
        return -1;
    }

    public final boolean isEmpty() {
        boolean z9;
        synchronized (this.f58694b) {
            try {
                if (this.f58696e) {
                    if (this.f58694b.isEmpty() && this.d.isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    return z9;
                }
                ArrayList arrayList = this.f58694b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f58694b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f58697f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f58694b) {
            try {
                if (this.f58693a) {
                    if (!this.f58696e) {
                        this.f58696e = true;
                        a aVar = this.f58698n;
                        if (aVar == null) {
                            this.f58698n = new a(this);
                        } else {
                            aVar.f58690a = this.f58694b.size();
                            this.f58698n.f58691b = null;
                        }
                        return this.f58698n;
                    }
                    throw new IllegalStateException();
                } else if (this.f58694b.isEmpty()) {
                    return Collections.emptyIterator();
                } else {
                    return new a(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean remove(Object obj) {
        synchronized (this.f58694b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f58696e) {
                    Reference reference = (Reference) this.f58694b.get(indexOf);
                    if (!this.f58695c.contains(reference)) {
                        this.f58695c.add(reference);
                    }
                    td.a(this.d, reference.get());
                } else {
                    this.f58694b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z9, boolean z10) {
        this.f58695c = new ArrayList();
        this.d = new ArrayList();
        this.f58697f = z9 ? new Semaphore(1) : null;
        this.f58693a = z10;
        this.f58694b = new ArrayList();
    }
}
