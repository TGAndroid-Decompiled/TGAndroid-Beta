package ue;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import x7.f5;
public final class b implements Iterable {
    public final boolean f55816a;
    public final ArrayList f55817b;
    public final ArrayList f55818c;
    public final ArrayList d;
    public boolean f55819e;
    public final Semaphore f55820f;
    public b h;
    public a f55821n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f55817b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f55819e) {
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
                    f5.a(this.f55818c, obj);
                    return z10;
                }
                this.f55817b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f55817b) {
            try {
                if (this.f55819e) {
                    ArrayList arrayList = this.f55817b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        Reference reference = (Reference) obj;
                        if (!this.f55818c.contains(reference)) {
                            this.f55818c.add(reference);
                        }
                        f5.a(this.d, reference.get());
                    }
                } else {
                    this.f55817b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f55817b;
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
        synchronized (this.f55817b) {
            try {
                if (this.f55819e) {
                    if (this.f55817b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f55817b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f55817b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f55820f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f55817b) {
            try {
                if (this.f55816a) {
                    if (!this.f55819e) {
                        this.f55819e = true;
                        a aVar = this.f55821n;
                        if (aVar == null) {
                            this.f55821n = new a(this);
                        } else {
                            aVar.f55813a = this.f55817b.size();
                            this.f55821n.f55814b = null;
                        }
                        return this.f55821n;
                    }
                    throw new IllegalStateException();
                } else if (this.f55817b.isEmpty()) {
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
        synchronized (this.f55817b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f55819e) {
                    Reference reference = (Reference) this.f55817b.get(indexOf);
                    if (!this.f55818c.contains(reference)) {
                        this.f55818c.add(reference);
                    }
                    f5.a(this.d, reference.get());
                } else {
                    this.f55817b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f55818c = new ArrayList();
        this.d = new ArrayList();
        this.f55820f = z10 ? new Semaphore(1) : null;
        this.f55816a = z11;
        this.f55817b = new ArrayList();
    }
}
