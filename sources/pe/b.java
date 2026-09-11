package pe;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import w7.j6;
public final class b implements Iterable {
    public final boolean f44030a;
    public final ArrayList f44031b;
    public final ArrayList f44032c;
    public final ArrayList d;
    public boolean f44033e;
    public final Semaphore f44034f;
    public b h;
    public a f44035n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f44031b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f44033e) {
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
                    j6.a(this.f44032c, obj);
                    return z10;
                }
                this.f44031b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f44031b) {
            try {
                if (this.f44033e) {
                    ArrayList arrayList = this.f44031b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f44032c.contains(reference)) {
                            this.f44032c.add(reference);
                        }
                        j6.a(this.d, reference.get());
                    }
                } else {
                    this.f44031b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f44031b;
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
        synchronized (this.f44031b) {
            try {
                if (this.f44033e) {
                    if (this.f44031b.isEmpty() && this.d.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return z10;
                }
                ArrayList arrayList = this.f44031b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f44031b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f44034f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f44031b) {
            try {
                if (this.f44030a) {
                    if (!this.f44033e) {
                        this.f44033e = true;
                        a aVar = this.f44035n;
                        if (aVar == null) {
                            this.f44035n = new a(this);
                        } else {
                            aVar.f44027a = this.f44031b.size();
                            this.f44035n.f44028b = null;
                        }
                        return this.f44035n;
                    }
                    throw new IllegalStateException();
                } else if (this.f44031b.isEmpty()) {
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
        synchronized (this.f44031b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f44033e) {
                    Reference reference = (Reference) this.f44031b.get(indexOf);
                    if (!this.f44032c.contains(reference)) {
                        this.f44032c.add(reference);
                    }
                    j6.a(this.d, reference.get());
                } else {
                    this.f44031b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z10) {
        this.f44032c = new ArrayList();
        this.d = new ArrayList();
        this.f44034f = null;
        this.f44030a = z10;
        this.f44031b = new ArrayList();
    }
}
