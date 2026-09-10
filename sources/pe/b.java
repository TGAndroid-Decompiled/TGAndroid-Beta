package pe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.m6;
public final class b implements Iterable {
    public final boolean f39884a;
    public final ArrayList f39885b;
    public final ArrayList f39886c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f39887f;
    public b h;
    public a f39888n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f39885b) {
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
                    m6.a(this.f39886c, obj);
                    return z10;
                }
                this.f39885b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f39885b) {
            try {
                if (this.e) {
                    ArrayList arrayList = this.f39885b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f39886c.contains(reference)) {
                            this.f39886c.add(reference);
                        }
                        m6.a(this.d, reference.get());
                    }
                } else {
                    this.f39885b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f39885b;
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
        synchronized (this.f39885b) {
            try {
                if (this.e) {
                    if (this.f39885b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f39885b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f39885b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f39887f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f39885b) {
            try {
                if (this.f39884a) {
                    if (!this.e) {
                        this.e = true;
                        a aVar = this.f39888n;
                        if (aVar == null) {
                            this.f39888n = new a(this);
                        } else {
                            aVar.f39881a = this.f39885b.size();
                            this.f39888n.f39882b = null;
                        }
                        return this.f39888n;
                    }
                    throw new IllegalStateException();
                } else if (this.f39885b.isEmpty()) {
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
        synchronized (this.f39885b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.e) {
                    Reference reference = (Reference) this.f39885b.get(indexOf);
                    if (!this.f39886c.contains(reference)) {
                        this.f39886c.add(reference);
                    }
                    m6.a(this.d, reference.get());
                } else {
                    this.f39885b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10) {
        this.f39886c = new ArrayList();
        this.d = new ArrayList();
        this.f39887f = null;
        this.f39884a = z10;
        this.f39885b = new ArrayList();
    }
}
