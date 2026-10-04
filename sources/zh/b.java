package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f53556a;
    public long f53564k;
    public boolean f53566m;
    public boolean f53567n;
    public boolean f53568o;
    public boolean f53569p;
    public boolean f53570q;
    public long f53571r;
    public long f53572s;
    public long f53573t;
    public long f53574u;
    public long v;
    public ArrayList f53557b = new ArrayList();
    public final LongSparseArray f53558c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f53559e = new ArrayList();
    public final ArrayList f53560f = new ArrayList();
    public final ArrayList f53561g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f53562i = new HashSet();
    public final HashSet f53563j = new HashSet();
    public final HashSet f53565l = new HashSet();

    public b(boolean z10) {
        this.f53556a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f53556a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f53566m = false;
                    return;
                } else if (i10 == 1) {
                    this.f53567n = false;
                    return;
                } else if (i10 == 2) {
                    this.f53568o = false;
                    return;
                } else if (i10 == 3) {
                    this.f53569p = false;
                    return;
                } else if (i10 == 4) {
                    this.f53570q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f53566m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f53567n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f53568o = b(i10, this.f53559e);
            } else if (i10 == 3) {
                this.f53569p = b(i10, this.f53560f);
            } else if (i10 == 4) {
                this.f53570q = b(i10, this.f53561g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f53563j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f53556a) {
            HashSet hashSet = this.f53562i;
            hashSet.clear();
            HashSet hashSet2 = this.f53563j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f53551b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f53565l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f53558c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f41565b;
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                if (!hashSet2.contains((a) obj)) {
                                    break;
                                }
                            }
                            i10++;
                        } else {
                            hashSet3.add(Long.valueOf(u6Var.f41065a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f53564k = 0L;
        this.f53563j.clear();
        this.f53565l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f53559e;
        }
        if (i10 == 3) {
            return this.f53560f;
        }
        if (i10 == 4) {
            return this.f53561g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f53571r;
        }
        if (i10 == 1) {
            return this.f53572s;
        }
        if (i10 == 2) {
            return this.f53573t;
        }
        if (i10 == 3) {
            return this.f53574u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f53552c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f53571r += j3;
        } else if (i10 == 1) {
            this.f53572s += j3;
        } else if (i10 == 2) {
            this.f53573t += j3;
        } else if (i10 == 3) {
            this.f53574u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f53559e.isEmpty() && this.f53560f.isEmpty()) {
            if (this.f53556a || this.f53557b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f53563j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f53564k -= aVar.f53552c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f53564k += aVar.f53552c;
            a(aVar.d, true);
        }
        c();
    }
}
