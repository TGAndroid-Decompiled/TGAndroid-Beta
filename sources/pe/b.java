package pe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.l6;
public final class b implements Iterable {
    public final boolean f44379a;
    public final ArrayList f44380b;
    public final ArrayList f44381c;
    public final ArrayList d;
    public boolean f44382e;
    public final Semaphore f44383f;
    public b h;
    public a f44384n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f44380b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f44382e) {
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
                    l6.a(this.f44381c, obj);
                    return z10;
                }
                this.f44380b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f44380b) {
            try {
                if (this.f44382e) {
                    ArrayList arrayList = this.f44380b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f44381c.contains(reference)) {
                            this.f44381c.add(reference);
                        }
                        l6.a(this.d, reference.get());
                    }
                } else {
                    this.f44380b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f44380b;
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
        synchronized (this.f44380b) {
            try {
                if (this.f44382e) {
                    if (this.f44380b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f44380b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f44380b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f44383f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f44380b) {
            try {
                if (this.f44379a) {
                    if (!this.f44382e) {
                        this.f44382e = true;
                        a aVar = this.f44384n;
                        if (aVar == null) {
                            this.f44384n = new a(this);
                        } else {
                            aVar.f44376a = this.f44380b.size();
                            this.f44384n.f44377b = null;
                        }
                        return this.f44384n;
                    }
                    throw new IllegalStateException();
                } else if (this.f44380b.isEmpty()) {
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
        synchronized (this.f44380b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f44382e) {
                    Reference reference = (Reference) this.f44380b.get(indexOf);
                    if (!this.f44381c.contains(reference)) {
                        this.f44381c.add(reference);
                    }
                    l6.a(this.d, reference.get());
                } else {
                    this.f44380b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f44381c = new ArrayList();
        this.d = new ArrayList();
        this.f44383f = z10 ? new Semaphore(1) : null;
        this.f44379a = z11;
        this.f44380b = new ArrayList();
    }
}
