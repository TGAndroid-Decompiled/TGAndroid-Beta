package xe;

import c8.td;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f58603a;
    public final ArrayList f58604b;
    public final ArrayList f58605c;
    public final ArrayList d;
    public boolean f58606e;
    public final Semaphore f58607f;
    public b h;
    public a f58608n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f58604b) {
            try {
                boolean z9 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f58606e) {
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
                    td.a(this.f58605c, obj);
                    return z9;
                }
                this.f58604b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f58604b) {
            try {
                if (this.f58606e) {
                    ArrayList arrayList = this.f58604b;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Reference reference = (Reference) obj;
                        if (!this.f58605c.contains(reference)) {
                            this.f58605c.add(reference);
                        }
                        td.a(this.d, reference.get());
                    }
                } else {
                    this.f58604b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f58604b;
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
        synchronized (this.f58604b) {
            try {
                if (this.f58606e) {
                    if (this.f58604b.isEmpty() && this.d.isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    return z9;
                }
                ArrayList arrayList = this.f58604b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f58604b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f58607f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f58604b) {
            try {
                if (this.f58603a) {
                    if (!this.f58606e) {
                        this.f58606e = true;
                        a aVar = this.f58608n;
                        if (aVar == null) {
                            this.f58608n = new a(this);
                        } else {
                            aVar.f58600a = this.f58604b.size();
                            this.f58608n.f58601b = null;
                        }
                        return this.f58608n;
                    }
                    throw new IllegalStateException();
                } else if (this.f58604b.isEmpty()) {
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
        synchronized (this.f58604b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f58606e) {
                    Reference reference = (Reference) this.f58604b.get(indexOf);
                    if (!this.f58605c.contains(reference)) {
                        this.f58605c.add(reference);
                    }
                    td.a(this.d, reference.get());
                } else {
                    this.f58604b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z9, boolean z10) {
        this.f58605c = new ArrayList();
        this.d = new ArrayList();
        this.f58607f = z9 ? new Semaphore(1) : null;
        this.f58603a = z10;
        this.f58604b = new ArrayList();
    }
}
