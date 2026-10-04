package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f53557a;
    public long f53565k;
    public boolean f53567m;
    public boolean f53568n;
    public boolean f53569o;
    public boolean f53570p;
    public boolean f53571q;
    public long f53572r;
    public long f53573s;
    public long f53574t;
    public long f53575u;
    public long v;
    public ArrayList f53558b = new ArrayList();
    public final LongSparseArray f53559c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f53560e = new ArrayList();
    public final ArrayList f53561f = new ArrayList();
    public final ArrayList f53562g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f53563i = new HashSet();
    public final HashSet f53564j = new HashSet();
    public final HashSet f53566l = new HashSet();

    public b(boolean z10) {
        this.f53557a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f53557a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f53567m = false;
                    return;
                } else if (i10 == 1) {
                    this.f53568n = false;
                    return;
                } else if (i10 == 2) {
                    this.f53569o = false;
                    return;
                } else if (i10 == 3) {
                    this.f53570p = false;
                    return;
                } else if (i10 == 4) {
                    this.f53571q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f53567m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f53568n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f53569o = b(i10, this.f53560e);
            } else if (i10 == 3) {
                this.f53570p = b(i10, this.f53561f);
            } else if (i10 == 4) {
                this.f53571q = b(i10, this.f53562g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f53564j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f53557a) {
            HashSet hashSet = this.f53563i;
            hashSet.clear();
            HashSet hashSet2 = this.f53564j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f53552b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f53566l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f53559c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f41566b;
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
                            hashSet3.add(Long.valueOf(u6Var.f41066a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f53565k = 0L;
        this.f53564j.clear();
        this.f53566l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f53560e;
        }
        if (i10 == 3) {
            return this.f53561f;
        }
        if (i10 == 4) {
            return this.f53562g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f53572r;
        }
        if (i10 == 1) {
            return this.f53573s;
        }
        if (i10 == 2) {
            return this.f53574t;
        }
        if (i10 == 3) {
            return this.f53575u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f53553c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f53572r += j3;
        } else if (i10 == 1) {
            this.f53573s += j3;
        } else if (i10 == 2) {
            this.f53574t += j3;
        } else if (i10 == 3) {
            this.f53575u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f53560e.isEmpty() && this.f53561f.isEmpty()) {
            if (this.f53557a || this.f53558b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f53564j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f53565k -= aVar.f53553c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f53565k += aVar.f53553c;
            a(aVar.d, true);
        }
        c();
    }
}
