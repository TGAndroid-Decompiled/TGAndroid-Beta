package xe;

import c8.wd;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f60499a;
    public final ArrayList f60500b;
    public final ArrayList f60501c;
    public final ArrayList d;
    public boolean f60502e;
    public final Semaphore f60503f;
    public b h;
    public a f60504n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f60500b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f60502e) {
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
                    wd.a(this.f60501c, obj);
                    return z10;
                }
                this.f60500b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f60500b) {
            try {
                if (this.f60502e) {
                    ArrayList arrayList = this.f60500b;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Reference reference = (Reference) obj;
                        if (!this.f60501c.contains(reference)) {
                            this.f60501c.add(reference);
                        }
                        wd.a(this.d, reference.get());
                    }
                } else {
                    this.f60500b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f60500b;
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
        synchronized (this.f60500b) {
            try {
                if (this.f60502e) {
                    if (this.f60500b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f60500b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f60500b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f60503f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f60500b) {
            try {
                if (this.f60499a) {
                    if (!this.f60502e) {
                        this.f60502e = true;
                        a aVar = this.f60504n;
                        if (aVar == null) {
                            this.f60504n = new a(this);
                        } else {
                            aVar.f60496a = this.f60500b.size();
                            this.f60504n.f60497b = null;
                        }
                        return this.f60504n;
                    }
                    throw new IllegalStateException();
                } else if (this.f60500b.isEmpty()) {
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
        synchronized (this.f60500b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f60502e) {
                    Reference reference = (Reference) this.f60500b.get(indexOf);
                    if (!this.f60501c.contains(reference)) {
                        this.f60501c.add(reference);
                    }
                    wd.a(this.d, reference.get());
                } else {
                    this.f60500b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f60501c = new ArrayList();
        this.d = new ArrayList();
        this.f60503f = z10 ? new Semaphore(1) : null;
        this.f60499a = z11;
        this.f60500b = new ArrayList();
    }
}
