package se;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f48133a;
    public final ArrayList f48134b;
    public final ArrayList f48135c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f48136f;
    public b h;
    public a f48137n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f48134b) {
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
                    rb.a.a(this.f48135c, obj);
                    return z10;
                }
                this.f48134b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f48134b) {
            try {
                if (this.e) {
                    ArrayList arrayList = this.f48134b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f48135c.contains(reference)) {
                            this.f48135c.add(reference);
                        }
                        rb.a.a(this.d, reference.get());
                    }
                } else {
                    this.f48134b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f48134b;
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
        synchronized (this.f48134b) {
            try {
                if (this.e) {
                    if (this.f48134b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f48134b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f48134b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f48136f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f48134b) {
            try {
                if (this.f48133a) {
                    if (!this.e) {
                        this.e = true;
                        a aVar = this.f48137n;
                        if (aVar == null) {
                            this.f48137n = new a(this);
                        } else {
                            aVar.f48130a = this.f48134b.size();
                            this.f48137n.f48131b = null;
                        }
                        return this.f48137n;
                    }
                    throw new IllegalStateException();
                } else if (this.f48134b.isEmpty()) {
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
        synchronized (this.f48134b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.e) {
                    Reference reference = (Reference) this.f48134b.get(indexOf);
                    if (!this.f48135c.contains(reference)) {
                        this.f48135c.add(reference);
                    }
                    rb.a.a(this.d, reference.get());
                } else {
                    this.f48134b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f48135c = new ArrayList();
        this.d = new ArrayList();
        this.f48136f = z10 ? new Semaphore(1) : null;
        this.f48133a = z11;
        this.f48134b = new ArrayList();
    }
}
