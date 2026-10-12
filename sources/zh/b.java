package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f54932a;
    public long f54940k;
    public boolean f54942m;
    public boolean f54943n;
    public boolean f54944o;
    public boolean f54945p;
    public boolean f54946q;
    public long f54947r;
    public long f54948s;
    public long f54949t;
    public long f54950u;
    public long v;
    public ArrayList f54933b = new ArrayList();
    public final LongSparseArray f54934c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f54935e = new ArrayList();
    public final ArrayList f54936f = new ArrayList();
    public final ArrayList f54937g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f54938i = new HashSet();
    public final HashSet f54939j = new HashSet();
    public final HashSet f54941l = new HashSet();

    public b(boolean z10) {
        this.f54932a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f54932a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f54942m = false;
                    return;
                } else if (i10 == 1) {
                    this.f54943n = false;
                    return;
                } else if (i10 == 2) {
                    this.f54944o = false;
                    return;
                } else if (i10 == 3) {
                    this.f54945p = false;
                    return;
                } else if (i10 == 4) {
                    this.f54946q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f54942m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f54943n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f54944o = b(i10, this.f54935e);
            } else if (i10 == 3) {
                this.f54945p = b(i10, this.f54936f);
            } else if (i10 == 4) {
                this.f54946q = b(i10, this.f54937g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f54939j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f54932a) {
            HashSet hashSet = this.f54938i;
            hashSet.clear();
            HashSet hashSet2 = this.f54939j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f54927b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f54941l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f54934c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f42691b;
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
                            hashSet3.add(Long.valueOf(u6Var.f42373a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f54940k = 0L;
        this.f54939j.clear();
        this.f54941l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f54935e;
        }
        if (i10 == 3) {
            return this.f54936f;
        }
        if (i10 == 4) {
            return this.f54937g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f54947r;
        }
        if (i10 == 1) {
            return this.f54948s;
        }
        if (i10 == 2) {
            return this.f54949t;
        }
        if (i10 == 3) {
            return this.f54950u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f54928c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f54947r += j3;
        } else if (i10 == 1) {
            this.f54948s += j3;
        } else if (i10 == 2) {
            this.f54949t += j3;
        } else if (i10 == 3) {
            this.f54950u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f54935e.isEmpty() && this.f54936f.isEmpty()) {
            if (this.f54932a || this.f54933b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f54939j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f54940k -= aVar.f54928c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f54940k += aVar.f54928c;
            a(aVar.d, true);
        }
        c();
    }
}
