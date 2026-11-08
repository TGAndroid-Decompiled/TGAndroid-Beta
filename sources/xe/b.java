package xe;

import c8.td;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f58692a;
    public final ArrayList f58693b;
    public final ArrayList f58694c;
    public final ArrayList d;
    public boolean f58695e;
    public final Semaphore f58696f;
    public b h;
    public a f58697n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f58693b) {
            try {
                boolean z9 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f58695e) {
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
                    td.a(this.f58694c, obj);
                    return z9;
                }
                this.f58693b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f58693b) {
            try {
                if (this.f58695e) {
                    ArrayList arrayList = this.f58693b;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Reference reference = (Reference) obj;
                        if (!this.f58694c.contains(reference)) {
                            this.f58694c.add(reference);
                        }
                        td.a(this.d, reference.get());
                    }
                } else {
                    this.f58693b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f58693b;
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
        synchronized (this.f58693b) {
            try {
                if (this.f58695e) {
                    if (this.f58693b.isEmpty() && this.d.isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    return z9;
                }
                ArrayList arrayList = this.f58693b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f58693b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f58696f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f58693b) {
            try {
                if (this.f58692a) {
                    if (!this.f58695e) {
                        this.f58695e = true;
                        a aVar = this.f58697n;
                        if (aVar == null) {
                            this.f58697n = new a(this);
                        } else {
                            aVar.f58689a = this.f58693b.size();
                            this.f58697n.f58690b = null;
                        }
                        return this.f58697n;
                    }
                    throw new IllegalStateException();
                } else if (this.f58693b.isEmpty()) {
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
        synchronized (this.f58693b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f58695e) {
                    Reference reference = (Reference) this.f58693b.get(indexOf);
                    if (!this.f58694c.contains(reference)) {
                        this.f58694c.add(reference);
                    }
                    td.a(this.d, reference.get());
                } else {
                    this.f58693b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z9, boolean z10) {
        this.f58694c = new ArrayList();
        this.d = new ArrayList();
        this.f58696f = z9 ? new Semaphore(1) : null;
        this.f58692a = z10;
        this.f58693b = new ArrayList();
    }
}
