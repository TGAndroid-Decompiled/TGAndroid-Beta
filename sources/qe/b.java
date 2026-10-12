package qe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.v6;
public final class b implements Iterable {
    public final boolean f46061a;
    public final ArrayList f46062b;
    public final ArrayList f46063c;
    public final ArrayList d;
    public boolean f46064e;
    public final Semaphore f46065f;
    public b h;
    public a f46066n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f46062b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f46064e) {
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
                    v6.a(this.f46063c, obj);
                    return z10;
                }
                this.f46062b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f46062b) {
            try {
                if (this.f46064e) {
                    ArrayList arrayList = this.f46062b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f46063c.contains(reference)) {
                            this.f46063c.add(reference);
                        }
                        v6.a(this.d, reference.get());
                    }
                } else {
                    this.f46062b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f46062b;
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
        synchronized (this.f46062b) {
            try {
                if (this.f46064e) {
                    if (this.f46062b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f46062b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f46062b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f46065f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f46062b) {
            try {
                if (this.f46061a) {
                    if (!this.f46064e) {
                        this.f46064e = true;
                        a aVar = this.f46066n;
                        if (aVar == null) {
                            this.f46066n = new a(this);
                        } else {
                            aVar.f46058a = this.f46062b.size();
                            this.f46066n.f46059b = null;
                        }
                        return this.f46066n;
                    }
                    throw new IllegalStateException();
                } else if (this.f46062b.isEmpty()) {
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
        synchronized (this.f46062b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f46064e) {
                    Reference reference = (Reference) this.f46062b.get(indexOf);
                    if (!this.f46063c.contains(reference)) {
                        this.f46063c.add(reference);
                    }
                    v6.a(this.d, reference.get());
                } else {
                    this.f46062b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10, boolean z11) {
        this.f46063c = new ArrayList();
        this.d = new ArrayList();
        this.f46065f = z10 ? new Semaphore(1) : null;
        this.f46061a = z11;
        this.f46062b = new ArrayList();
    }
}
