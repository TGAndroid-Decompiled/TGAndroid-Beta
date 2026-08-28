package xd;

import g7.g8;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f49108a;
    public final ArrayList f49109b;
    public final ArrayList f49110c;
    public final ArrayList d;
    public boolean f49111e;
    public final Semaphore f49112f;
    public b h;
    public a f49113n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f49109b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f49111e) {
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
                    g8.a(this.f49110c, obj);
                    return z10;
                }
                this.f49109b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        synchronized (this.f49109b) {
            try {
                if (this.f49111e) {
                    ArrayList arrayList = this.f49109b;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        Reference reference = (Reference) obj;
                        if (!this.f49110c.contains(reference)) {
                            this.f49110c.add(reference);
                        }
                        g8.a(this.d, reference.get());
                    }
                } else {
                    this.f49109b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f49109b;
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
        synchronized (this.f49109b) {
            try {
                if (this.f49111e) {
                    if (this.f49109b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f49109b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f49109b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f49112f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f49109b) {
            try {
                if (this.f49108a) {
                    if (!this.f49111e) {
                        this.f49111e = true;
                        a aVar = this.f49113n;
                        if (aVar == null) {
                            this.f49113n = new a(this);
                        } else {
                            aVar.f49105a = this.f49109b.size();
                            this.f49113n.f49106b = null;
                        }
                        return this.f49113n;
                    }
                    throw new IllegalStateException();
                } else if (this.f49109b.isEmpty()) {
                    return Collections.emptyIterator();
                } else {
                    return new a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean remove(Object obj) {
        synchronized (this.f49109b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f49111e) {
                    Reference reference = (Reference) this.f49109b.get(indexOf);
                    if (!this.f49110c.contains(reference)) {
                        this.f49110c.add(reference);
                    }
                    g8.a(this.d, reference.get());
                } else {
                    this.f49109b.remove(indexOf);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(boolean z10) {
        this.f49110c = new ArrayList();
        this.d = new ArrayList();
        this.f49112f = null;
        this.f49108a = z10;
        this.f49109b = new ArrayList();
    }
}
