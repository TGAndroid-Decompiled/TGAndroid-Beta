package qe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.w6;
public final class b implements Iterable {
    public final boolean f46124a;
    public final ArrayList f46125b;
    public final ArrayList f46126c;
    public final ArrayList d;
    public boolean f46127e;
    public final Semaphore f46128f;
    public b h;
    public a f46129n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f46125b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f46127e) {
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
                    w6.a(this.f46126c, obj);
                    return z10;
                }
                this.f46125b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f46125b) {
            try {
                if (this.f46127e) {
                    ArrayList arrayList = this.f46125b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f46126c.contains(reference)) {
                            this.f46126c.add(reference);
                        }
                        w6.a(this.d, reference.get());
                    }
                } else {
                    this.f46125b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f46125b;
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
        synchronized (this.f46125b) {
            try {
                if (this.f46127e) {
                    if (this.f46125b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f46125b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f46125b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f46128f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f46125b) {
            try {
                if (this.f46124a) {
                    if (!this.f46127e) {
                        this.f46127e = true;
                        a aVar = this.f46129n;
                        if (aVar == null) {
                            this.f46129n = new a(this);
                        } else {
                            aVar.f46121a = this.f46125b.size();
                            this.f46129n.f46122b = null;
                        }
                        return this.f46129n;
                    }
                    throw new IllegalStateException();
                } else if (this.f46125b.isEmpty()) {
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
        synchronized (this.f46125b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f46127e) {
                    Reference reference = (Reference) this.f46125b.get(indexOf);
                    if (!this.f46126c.contains(reference)) {
                        this.f46126c.add(reference);
                    }
                    w6.a(this.d, reference.get());
                } else {
                    this.f46125b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f46126c = new ArrayList();
        this.d = new ArrayList();
        this.f46128f = z10 ? new Semaphore(1) : null;
        this.f46124a = z11;
        this.f46125b = new ArrayList();
    }
}
