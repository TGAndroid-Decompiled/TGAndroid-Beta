package xe;

import c8.xd;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f60582a;
    public final ArrayList f60583b;
    public final ArrayList f60584c;
    public final ArrayList d;
    public boolean f60585e;
    public final Semaphore f60586f;
    public b h;
    public a f60587n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f60583b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f60585e) {
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
                    xd.a(this.f60584c, obj);
                    return z10;
                }
                this.f60583b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f60583b) {
            try {
                if (this.f60585e) {
                    ArrayList arrayList = this.f60583b;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Reference reference = (Reference) obj;
                        if (!this.f60584c.contains(reference)) {
                            this.f60584c.add(reference);
                        }
                        xd.a(this.d, reference.get());
                    }
                } else {
                    this.f60583b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f60583b;
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
        synchronized (this.f60583b) {
            try {
                if (this.f60585e) {
                    if (this.f60583b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f60583b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f60583b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f60586f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f60583b) {
            try {
                if (this.f60582a) {
                    if (!this.f60585e) {
                        this.f60585e = true;
                        a aVar = this.f60587n;
                        if (aVar == null) {
                            this.f60587n = new a(this);
                        } else {
                            aVar.f60579a = this.f60583b.size();
                            this.f60587n.f60580b = null;
                        }
                        return this.f60587n;
                    }
                    throw new IllegalStateException();
                } else if (this.f60583b.isEmpty()) {
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
        synchronized (this.f60583b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f60585e) {
                    Reference reference = (Reference) this.f60583b.get(indexOf);
                    if (!this.f60584c.contains(reference)) {
                        this.f60584c.add(reference);
                    }
                    xd.a(this.d, reference.get());
                } else {
                    this.f60583b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f60584c = new ArrayList();
        this.d = new ArrayList();
        this.f60586f = z10 ? new Semaphore(1) : null;
        this.f60582a = z11;
        this.f60583b = new ArrayList();
    }
}
