package zd;

import i7.z8;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f50808a;
    public final ArrayList f50809b;
    public final ArrayList f50810c;
    public final ArrayList d;
    public boolean f50811e;
    public final Semaphore f50812f;
    public b h;
    public a f50813n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f50809b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f50811e) {
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
                    z8.a(this.f50810c, obj);
                    return z10;
                }
                this.f50809b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f50809b) {
            try {
                if (this.f50811e) {
                    ArrayList arrayList = this.f50809b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f50810c.contains(reference)) {
                            this.f50810c.add(reference);
                        }
                        z8.a(this.d, reference.get());
                    }
                } else {
                    this.f50809b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f50809b;
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
        synchronized (this.f50809b) {
            try {
                if (this.f50811e) {
                    if (this.f50809b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f50809b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f50809b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f50812f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f50809b) {
            try {
                if (this.f50808a) {
                    if (!this.f50811e) {
                        this.f50811e = true;
                        a aVar = this.f50813n;
                        if (aVar == null) {
                            this.f50813n = new a(this);
                        } else {
                            aVar.f50805a = this.f50809b.size();
                            this.f50813n.f50806b = null;
                        }
                        return this.f50813n;
                    }
                    throw new IllegalStateException();
                } else if (this.f50809b.isEmpty()) {
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
        synchronized (this.f50809b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f50811e) {
                    Reference reference = (Reference) this.f50809b.get(indexOf);
                    if (!this.f50810c.contains(reference)) {
                        this.f50810c.add(reference);
                    }
                    z8.a(this.d, reference.get());
                } else {
                    this.f50809b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10) {
        this.f50810c = new ArrayList();
        this.d = new ArrayList();
        this.f50812f = null;
        this.f50808a = z10;
        this.f50809b = new ArrayList();
    }
}
