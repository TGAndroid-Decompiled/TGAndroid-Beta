package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f53562a;
    public long f53570k;
    public boolean f53572m;
    public boolean f53573n;
    public boolean f53574o;
    public boolean f53575p;
    public boolean f53576q;
    public long f53577r;
    public long f53578s;
    public long f53579t;
    public long f53580u;
    public long v;
    public ArrayList f53563b = new ArrayList();
    public final LongSparseArray f53564c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f53565e = new ArrayList();
    public final ArrayList f53566f = new ArrayList();
    public final ArrayList f53567g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f53568i = new HashSet();
    public final HashSet f53569j = new HashSet();
    public final HashSet f53571l = new HashSet();

    public b(boolean z10) {
        this.f53562a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f53562a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f53572m = false;
                    return;
                } else if (i10 == 1) {
                    this.f53573n = false;
                    return;
                } else if (i10 == 2) {
                    this.f53574o = false;
                    return;
                } else if (i10 == 3) {
                    this.f53575p = false;
                    return;
                } else if (i10 == 4) {
                    this.f53576q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f53572m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f53573n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f53574o = b(i10, this.f53565e);
            } else if (i10 == 3) {
                this.f53575p = b(i10, this.f53566f);
            } else if (i10 == 4) {
                this.f53576q = b(i10, this.f53567g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f53569j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f53562a) {
            HashSet hashSet = this.f53568i;
            hashSet.clear();
            HashSet hashSet2 = this.f53569j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f53557b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f53571l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f53564c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f41573b;
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
                            hashSet3.add(Long.valueOf(u6Var.f41072a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f53570k = 0L;
        this.f53569j.clear();
        this.f53571l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f53565e;
        }
        if (i10 == 3) {
            return this.f53566f;
        }
        if (i10 == 4) {
            return this.f53567g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f53577r;
        }
        if (i10 == 1) {
            return this.f53578s;
        }
        if (i10 == 2) {
            return this.f53579t;
        }
        if (i10 == 3) {
            return this.f53580u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f53558c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f53577r += j3;
        } else if (i10 == 1) {
            this.f53578s += j3;
        } else if (i10 == 2) {
            this.f53579t += j3;
        } else if (i10 == 3) {
            this.f53580u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f53565e.isEmpty() && this.f53566f.isEmpty()) {
            if (this.f53562a || this.f53563b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f53569j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f53570k -= aVar.f53558c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f53570k += aVar.f53558c;
            a(aVar.d, true);
        }
        c();
    }
}
