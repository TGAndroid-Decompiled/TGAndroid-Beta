package pe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.k6;
public final class b implements Iterable {
    public final boolean f41027a;
    public final ArrayList f41028b;
    public final ArrayList f41029c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f41030f;
    public b h;
    public a f41031n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f41028b) {
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
                    k6.a(this.f41029c, obj);
                    return z10;
                }
                this.f41028b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f41028b) {
            try {
                if (this.e) {
                    ArrayList arrayList = this.f41028b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f41029c.contains(reference)) {
                            this.f41029c.add(reference);
                        }
                        k6.a(this.d, reference.get());
                    }
                } else {
                    this.f41028b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f41028b;
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
        synchronized (this.f41028b) {
            try {
                if (this.e) {
                    if (this.f41028b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f41028b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f41028b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f41030f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f41028b) {
            try {
                if (this.f41027a) {
                    if (!this.e) {
                        this.e = true;
                        a aVar = this.f41031n;
                        if (aVar == null) {
                            this.f41031n = new a(this);
                        } else {
                            aVar.f41024a = this.f41028b.size();
                            this.f41031n.f41025b = null;
                        }
                        return this.f41031n;
                    }
                    throw new IllegalStateException();
                } else if (this.f41028b.isEmpty()) {
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
        synchronized (this.f41028b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.e) {
                    Reference reference = (Reference) this.f41028b.get(indexOf);
                    if (!this.f41029c.contains(reference)) {
                        this.f41029c.add(reference);
                    }
                    k6.a(this.d, reference.get());
                } else {
                    this.f41028b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f41029c = new ArrayList();
        this.d = new ArrayList();
        this.f41030f = z10 ? new Semaphore(1) : null;
        this.f41027a = z11;
        this.f41028b = new ArrayList();
    }
}
