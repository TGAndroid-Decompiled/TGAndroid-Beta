package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f54924a;
    public long f54932k;
    public boolean f54934m;
    public boolean f54935n;
    public boolean f54936o;
    public boolean f54937p;
    public boolean f54938q;
    public long f54939r;
    public long f54940s;
    public long f54941t;
    public long f54942u;
    public long v;
    public ArrayList f54925b = new ArrayList();
    public final LongSparseArray f54926c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f54927e = new ArrayList();
    public final ArrayList f54928f = new ArrayList();
    public final ArrayList f54929g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f54930i = new HashSet();
    public final HashSet f54931j = new HashSet();
    public final HashSet f54933l = new HashSet();

    public b(boolean z10) {
        this.f54924a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f54924a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f54934m = false;
                    return;
                } else if (i10 == 1) {
                    this.f54935n = false;
                    return;
                } else if (i10 == 2) {
                    this.f54936o = false;
                    return;
                } else if (i10 == 3) {
                    this.f54937p = false;
                    return;
                } else if (i10 == 4) {
                    this.f54938q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f54934m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f54935n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f54936o = b(i10, this.f54927e);
            } else if (i10 == 3) {
                this.f54937p = b(i10, this.f54928f);
            } else if (i10 == 4) {
                this.f54938q = b(i10, this.f54929g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f54931j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f54924a) {
            HashSet hashSet = this.f54930i;
            hashSet.clear();
            HashSet hashSet2 = this.f54931j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f54919b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f54933l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f54926c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f42689b;
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
                            hashSet3.add(Long.valueOf(u6Var.f42371a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f54932k = 0L;
        this.f54931j.clear();
        this.f54933l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f54927e;
        }
        if (i10 == 3) {
            return this.f54928f;
        }
        if (i10 == 4) {
            return this.f54929g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f54939r;
        }
        if (i10 == 1) {
            return this.f54940s;
        }
        if (i10 == 2) {
            return this.f54941t;
        }
        if (i10 == 3) {
            return this.f54942u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f54920c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f54939r += j3;
        } else if (i10 == 1) {
            this.f54940s += j3;
        } else if (i10 == 2) {
            this.f54941t += j3;
        } else if (i10 == 3) {
            this.f54942u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f54927e.isEmpty() && this.f54928f.isEmpty()) {
            if (this.f54924a || this.f54925b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f54931j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f54932k -= aVar.f54920c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f54932k += aVar.f54920c;
            a(aVar.d, true);
        }
        c();
    }
}
