package xe;

import c8.td;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f59884a;
    public final ArrayList f59885b;
    public final ArrayList f59886c;
    public final ArrayList d;
    public boolean f59887e;
    public final Semaphore f59888f;
    public b h;
    public a f59889n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f59885b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f59887e) {
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
                    td.a(this.f59886c, obj);
                    return z10;
                }
                this.f59885b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f59885b) {
            try {
                if (this.f59887e) {
                    ArrayList arrayList = this.f59885b;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Reference reference = (Reference) obj;
                        if (!this.f59886c.contains(reference)) {
                            this.f59886c.add(reference);
                        }
                        td.a(this.d, reference.get());
                    }
                } else {
                    this.f59885b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f59885b;
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
        synchronized (this.f59885b) {
            try {
                if (this.f59887e) {
                    if (this.f59885b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f59885b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f59885b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f59888f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f59885b) {
            try {
                if (this.f59884a) {
                    if (!this.f59887e) {
                        this.f59887e = true;
                        a aVar = this.f59889n;
                        if (aVar == null) {
                            this.f59889n = new a(this);
                        } else {
                            aVar.f59881a = this.f59885b.size();
                            this.f59889n.f59882b = null;
                        }
                        return this.f59889n;
                    }
                    throw new IllegalStateException();
                } else if (this.f59885b.isEmpty()) {
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
        synchronized (this.f59885b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f59887e) {
                    Reference reference = (Reference) this.f59885b.get(indexOf);
                    if (!this.f59886c.contains(reference)) {
                        this.f59886c.add(reference);
                    }
                    td.a(this.d, reference.get());
                } else {
                    this.f59885b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f59886c = new ArrayList();
        this.d = new ArrayList();
        this.f59888f = z10 ? new Semaphore(1) : null;
        this.f59884a = z11;
        this.f59885b = new ArrayList();
    }
}
