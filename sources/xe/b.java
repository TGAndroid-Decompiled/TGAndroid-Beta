package xe;

import c8.sd;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f58598a;
    public final ArrayList f58599b;
    public final ArrayList f58600c;
    public final ArrayList d;
    public boolean f58601e;
    public final Semaphore f58602f;
    public b h;
    public a f58603n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f58599b) {
            try {
                boolean z9 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f58601e) {
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
                    sd.a(this.f58600c, obj);
                    return z9;
                }
                this.f58599b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f58599b) {
            try {
                if (this.f58601e) {
                    ArrayList arrayList = this.f58599b;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Reference reference = (Reference) obj;
                        if (!this.f58600c.contains(reference)) {
                            this.f58600c.add(reference);
                        }
                        sd.a(this.d, reference.get());
                    }
                } else {
                    this.f58599b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f58599b;
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
        synchronized (this.f58599b) {
            try {
                if (this.f58601e) {
                    if (this.f58599b.isEmpty() && this.d.isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    return z9;
                }
                ArrayList arrayList = this.f58599b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f58599b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f58602f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.f58599b) {
            try {
                if (this.f58598a) {
                    if (!this.f58601e) {
                        this.f58601e = true;
                        a aVar = this.f58603n;
                        if (aVar == null) {
                            this.f58603n = new a(this);
                        } else {
                            aVar.f58595a = this.f58599b.size();
                            this.f58603n.f58596b = null;
                        }
                        return this.f58603n;
                    }
                    throw new IllegalStateException();
                } else if (this.f58599b.isEmpty()) {
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
        synchronized (this.f58599b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f58601e) {
                    Reference reference = (Reference) this.f58599b.get(indexOf);
                    if (!this.f58600c.contains(reference)) {
                        this.f58600c.add(reference);
                    }
                    sd.a(this.d, reference.get());
                } else {
                    this.f58599b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z9, boolean z10) {
        this.f58600c = new ArrayList();
        this.d = new ArrayList();
        this.f58602f = z9 ? new Semaphore(1) : null;
        this.f58598a = z10;
        this.f58599b = new ArrayList();
    }
}
