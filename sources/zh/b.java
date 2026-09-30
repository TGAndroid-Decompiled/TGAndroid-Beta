package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class b {
    public final boolean f49471a;
    public long f49478k;
    public boolean f49480m;
    public boolean f49481n;
    public boolean f49482o;
    public boolean f49483p;
    public boolean f49484q;
    public long f49485r;
    public long f49486s;
    public long f49487t;
    public long f49488u;
    public long v;
    public ArrayList f49472b = new ArrayList();
    public final LongSparseArray f49473c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49474f = new ArrayList();
    public final ArrayList f49475g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49476i = new HashSet();
    public final HashSet f49477j = new HashSet();
    public final HashSet f49479l = new HashSet();

    public b(boolean z10) {
        this.f49471a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49471a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49480m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49481n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49482o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49483p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49484q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49480m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49481n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49482o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49483p = b(i10, this.f49474f);
            } else if (i10 == 4) {
                this.f49484q = b(i10, this.f49475g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49477j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49471a) {
            HashSet hashSet = this.f49476i;
            hashSet.clear();
            HashSet hashSet2 = this.f49477j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49467b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49479l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f49473c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).f37600b;
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
                            hashSet3.add(Long.valueOf(r6Var.f37187a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49478k = 0L;
        this.f49477j.clear();
        this.f49479l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49474f;
        }
        if (i10 == 4) {
            return this.f49475g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49485r;
        }
        if (i10 == 1) {
            return this.f49486s;
        }
        if (i10 == 2) {
            return this.f49487t;
        }
        if (i10 == 3) {
            return this.f49488u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49468c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49485r += j3;
        } else if (i10 == 1) {
            this.f49486s += j3;
        } else if (i10 == 2) {
            this.f49487t += j3;
        } else if (i10 == 3) {
            this.f49488u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49474f.isEmpty()) {
            if (this.f49471a || this.f49472b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49477j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49478k -= aVar.f49468c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49478k += aVar.f49468c;
            a(aVar.d, true);
        }
        c();
    }
}
