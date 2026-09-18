package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.t6;
import org.telegram.ui.u6;
public final class b {
    public final boolean f49227a;
    public long f49234k;
    public boolean f49236m;
    public boolean f49237n;
    public boolean f49238o;
    public boolean f49239p;
    public boolean f49240q;
    public long f49241r;
    public long f49242s;
    public long f49243t;
    public long f49244u;
    public long v;
    public ArrayList f49228b = new ArrayList();
    public final LongSparseArray f49229c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49230f = new ArrayList();
    public final ArrayList f49231g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49232i = new HashSet();
    public final HashSet f49233j = new HashSet();
    public final HashSet f49235l = new HashSet();

    public b(boolean z10) {
        this.f49227a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49227a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49236m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49237n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49238o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49239p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49240q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49236m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49237n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49238o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49239p = b(i10, this.f49230f);
            } else if (i10 == 4) {
                this.f49240q = b(i10, this.f49231g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49233j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49227a) {
            HashSet hashSet = this.f49232i;
            hashSet.clear();
            HashSet hashSet2 = this.f49233j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49223b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49235l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                t6 t6Var = (t6) this.f49229c.get(((Long) it2.next()).longValue());
                if (t6Var != null) {
                    SparseArray sparseArray = t6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((u6) sparseArray.valueAt(i10)).f37949b;
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
                            hashSet3.add(Long.valueOf(t6Var.f37672a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49234k = 0L;
        this.f49233j.clear();
        this.f49235l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49230f;
        }
        if (i10 == 4) {
            return this.f49231g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49241r;
        }
        if (i10 == 1) {
            return this.f49242s;
        }
        if (i10 == 2) {
            return this.f49243t;
        }
        if (i10 == 3) {
            return this.f49244u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49224c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49241r += j3;
        } else if (i10 == 1) {
            this.f49242s += j3;
        } else if (i10 == 2) {
            this.f49243t += j3;
        } else if (i10 == 3) {
            this.f49244u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49230f.isEmpty()) {
            if (this.f49227a || this.f49228b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49233j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49234k -= aVar.f49224c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49234k += aVar.f49224c;
            a(aVar.d, true);
        }
        c();
    }
}
