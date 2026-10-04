package pe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.l6;
public final class b implements Iterable {
    public final boolean f44371a;
    public final ArrayList f44372b;
    public final ArrayList f44373c;
    public final ArrayList d;
    public boolean f44374e;
    public final Semaphore f44375f;
    public b h;
    public a f44376n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f44372b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f44374e) {
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
                    l6.a(this.f44373c, obj);
                    return z10;
                }
                this.f44372b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f44372b) {
            try {
                if (this.f44374e) {
                    ArrayList arrayList = this.f44372b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f44373c.contains(reference)) {
                            this.f44373c.add(reference);
                        }
                        l6.a(this.d, reference.get());
                    }
                } else {
                    this.f44372b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f44372b;
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
        synchronized (this.f44372b) {
            try {
                if (this.f44374e) {
                    if (this.f44372b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f44372b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f44372b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f44375f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f44372b) {
            try {
                if (this.f44371a) {
                    if (!this.f44374e) {
                        this.f44374e = true;
                        a aVar = this.f44376n;
                        if (aVar == null) {
                            this.f44376n = new a(this);
                        } else {
                            aVar.f44368a = this.f44372b.size();
                            this.f44376n.f44369b = null;
                        }
                        return this.f44376n;
                    }
                    throw new IllegalStateException();
                } else if (this.f44372b.isEmpty()) {
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
        synchronized (this.f44372b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f44374e) {
                    Reference reference = (Reference) this.f44372b.get(indexOf);
                    if (!this.f44373c.contains(reference)) {
                        this.f44373c.add(reference);
                    }
                    l6.a(this.d, reference.get());
                } else {
                    this.f44372b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f44373c = new ArrayList();
        this.d = new ArrayList();
        this.f44375f = z10 ? new Semaphore(1) : null;
        this.f44371a = z11;
        this.f44372b = new ArrayList();
    }
}
