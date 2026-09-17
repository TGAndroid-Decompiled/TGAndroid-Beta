package pe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.j6;
public final class b implements Iterable {
    public final boolean f44031a;
    public final ArrayList f44032b;
    public final ArrayList f44033c;
    public final ArrayList d;
    public boolean f44034e;
    public final Semaphore f44035f;
    public b h;
    public a f44036n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f44032b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f44034e) {
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
                    j6.a(this.f44033c, obj);
                    return z10;
                }
                this.f44032b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f44032b) {
            try {
                if (this.f44034e) {
                    ArrayList arrayList = this.f44032b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f44033c.contains(reference)) {
                            this.f44033c.add(reference);
                        }
                        j6.a(this.d, reference.get());
                    }
                } else {
                    this.f44032b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f44032b;
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
        synchronized (this.f44032b) {
            try {
                if (this.f44034e) {
                    if (this.f44032b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f44032b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f44032b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f44035f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f44032b) {
            try {
                if (this.f44031a) {
                    if (!this.f44034e) {
                        this.f44034e = true;
                        a aVar = this.f44036n;
                        if (aVar == null) {
                            this.f44036n = new a(this);
                        } else {
                            aVar.f44028a = this.f44032b.size();
                            this.f44036n.f44029b = null;
                        }
                        return this.f44036n;
                    }
                    throw new IllegalStateException();
                } else if (this.f44032b.isEmpty()) {
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
        synchronized (this.f44032b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f44034e) {
                    Reference reference = (Reference) this.f44032b.get(indexOf);
                    if (!this.f44033c.contains(reference)) {
                        this.f44033c.add(reference);
                    }
                    j6.a(this.d, reference.get());
                } else {
                    this.f44032b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10) {
        this.f44033c = new ArrayList();
        this.d = new ArrayList();
        this.f44035f = null;
        this.f44031a = z10;
        this.f44032b = new ArrayList();
    }
}
