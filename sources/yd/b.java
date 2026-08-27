package yd;

import h7.k8;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

public final class b implements Iterable {

    public final boolean f49824a;

    public final ArrayList f49825b;

    public final ArrayList f49826c;
    public final ArrayList d;

    public boolean f49827e;

    public final Semaphore f49828f;
    public b h;

    public a f49829n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        synchronized (this.f49825b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (!this.f49827e) {
                    this.f49825b.add(new WeakReference(obj));
                    return true;
                }
                ArrayList arrayList = this.d;
                boolean z11 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Reference reference = (Reference) arrayList.get(size);
                    Object obj2 = reference != null ? reference.get() : null;
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
                k8.a(this.f49826c, obj);
                return z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        synchronized (this.f49825b) {
            try {
                if (this.f49827e) {
                    ArrayList arrayList = this.f49825b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f49826c.contains(reference)) {
                            this.f49826c.add(reference);
                        }
                        k8.a(this.d, reference.get());
                    }
                } else {
                    this.f49825b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        ArrayList arrayList = this.f49825b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((Reference) arrayList.get(size)).get() == obj) {
                return size;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        synchronized (this.f49825b) {
            try {
                if (this.f49827e) {
                    return this.f49825b.isEmpty() && this.d.isEmpty();
                }
                ArrayList arrayList = this.f49825b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f49825b.isEmpty();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f49828f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f49825b) {
            try {
                if (!this.f49824a) {
                    if (this.f49825b.isEmpty()) {
                        return Collections.emptyIterator();
                    }
                    return new a(this);
                }
                if (this.f49827e) {
                    throw new IllegalStateException();
                }
                this.f49827e = true;
                a aVar = this.f49829n;
                if (aVar == null) {
                    this.f49829n = new a(this);
                } else {
                    aVar.f49821a = this.f49825b.size();
                    this.f49829n.f49822b = null;
                }
                return this.f49829n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean remove(Object obj) {
        synchronized (this.f49825b) {
            try {
                int iIndexOf = indexOf(obj);
                if (iIndexOf == -1) {
                    return false;
                }
                if (this.f49827e) {
                    Reference reference = (Reference) this.f49825b.get(iIndexOf);
                    if (!this.f49826c.contains(reference)) {
                        this.f49826c.add(reference);
                    }
                    k8.a(this.d, reference.get());
                } else {
                    this.f49825b.remove(iIndexOf);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(boolean z10) {
        this.f49826c = new ArrayList();
        this.d = new ArrayList();
        this.f49828f = null;
        this.f49824a = z10;
        this.f49825b = new ArrayList();
    }
}
