package se;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f48092a;
    public final ArrayList f48093b;
    public final ArrayList f48094c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f48095f;
    public b h;
    public a f48096n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f48093b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.e) {
                    ArrayList arrayList = this.d;
                    boolean z11 = false;
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
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        arrayList.add(new WeakReference(obj));
                        z10 = true;
                    }
                    rb.a.a(this.f48094c, obj);
                    return z10;
                }
                this.f48093b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f48093b) {
            try {
                if (this.e) {
                    ArrayList arrayList = this.f48093b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f48094c.contains(reference)) {
                            this.f48094c.add(reference);
                        }
                        rb.a.a(this.d, reference.get());
                    }
                } else {
                    this.f48093b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f48093b;
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
        boolean z10;
        synchronized (this.f48093b) {
            try {
                if (this.e) {
                    if (this.f48093b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f48093b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f48093b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f48095f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f48093b) {
            try {
                if (this.f48092a) {
                    if (!this.e) {
                        this.e = true;
                        a aVar = this.f48096n;
                        if (aVar == null) {
                            this.f48096n = new a(this);
                        } else {
                            aVar.f48089a = this.f48093b.size();
                            this.f48096n.f48090b = null;
                        }
                        return this.f48096n;
                    }
                    throw new IllegalStateException();
                } else if (this.f48093b.isEmpty()) {
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
        synchronized (this.f48093b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.e) {
                    Reference reference = (Reference) this.f48093b.get(indexOf);
                    if (!this.f48094c.contains(reference)) {
                        this.f48094c.add(reference);
                    }
                    rb.a.a(this.d, reference.get());
                } else {
                    this.f48093b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f48094c = new ArrayList();
        this.d = new ArrayList();
        this.f48095f = z10 ? new Semaphore(1) : null;
        this.f48092a = z11;
        this.f48093b = new ArrayList();
    }
}
