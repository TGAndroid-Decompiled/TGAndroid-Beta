package pe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.j6;
public final class b implements Iterable {
    public final boolean f40758a;
    public final ArrayList f40759b;
    public final ArrayList f40760c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f40761f;
    public b h;
    public a f40762n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f40759b) {
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
                    j6.a(this.f40760c, obj);
                    return z10;
                }
                this.f40759b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f40759b) {
            try {
                if (this.e) {
                    ArrayList arrayList = this.f40759b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f40760c.contains(reference)) {
                            this.f40760c.add(reference);
                        }
                        j6.a(this.d, reference.get());
                    }
                } else {
                    this.f40759b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f40759b;
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
        synchronized (this.f40759b) {
            try {
                if (this.e) {
                    if (this.f40759b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f40759b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f40759b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f40761f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f40759b) {
            try {
                if (this.f40758a) {
                    if (!this.e) {
                        this.e = true;
                        a aVar = this.f40762n;
                        if (aVar == null) {
                            this.f40762n = new a(this);
                        } else {
                            aVar.f40755a = this.f40759b.size();
                            this.f40762n.f40756b = null;
                        }
                        return this.f40762n;
                    }
                    throw new IllegalStateException();
                } else if (this.f40759b.isEmpty()) {
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
        synchronized (this.f40759b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.e) {
                    Reference reference = (Reference) this.f40759b.get(indexOf);
                    if (!this.f40760c.contains(reference)) {
                        this.f40760c.add(reference);
                    }
                    j6.a(this.d, reference.get());
                } else {
                    this.f40759b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10) {
        this.f40760c = new ArrayList();
        this.d = new ArrayList();
        this.f40761f = null;
        this.f40758a = z10;
        this.f40759b = new ArrayList();
    }
}
