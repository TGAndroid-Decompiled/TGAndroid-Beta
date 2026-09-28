package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class b {
    public final boolean f49470a;
    public long f49477k;
    public boolean f49479m;
    public boolean f49480n;
    public boolean f49481o;
    public boolean f49482p;
    public boolean f49483q;
    public long f49484r;
    public long f49485s;
    public long f49486t;
    public long f49487u;
    public long v;
    public ArrayList f49471b = new ArrayList();
    public final LongSparseArray f49472c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49473f = new ArrayList();
    public final ArrayList f49474g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49475i = new HashSet();
    public final HashSet f49476j = new HashSet();
    public final HashSet f49478l = new HashSet();

    public b(boolean z10) {
        this.f49470a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49470a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49479m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49480n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49481o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49482p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49483q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49479m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49480n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49481o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49482p = b(i10, this.f49473f);
            } else if (i10 == 4) {
                this.f49483q = b(i10, this.f49474g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49476j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49470a) {
            HashSet hashSet = this.f49475i;
            hashSet.clear();
            HashSet hashSet2 = this.f49476j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49466b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49478l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f49472c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).f37601b;
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
        this.f49477k = 0L;
        this.f49476j.clear();
        this.f49478l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49473f;
        }
        if (i10 == 4) {
            return this.f49474g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49484r;
        }
        if (i10 == 1) {
            return this.f49485s;
        }
        if (i10 == 2) {
            return this.f49486t;
        }
        if (i10 == 3) {
            return this.f49487u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49467c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49484r += j3;
        } else if (i10 == 1) {
            this.f49485s += j3;
        } else if (i10 == 2) {
            this.f49486t += j3;
        } else if (i10 == 3) {
            this.f49487u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49473f.isEmpty()) {
            if (this.f49470a || this.f49471b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49476j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49477k -= aVar.f49467c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49477k += aVar.f49467c;
            a(aVar.d, true);
        }
        c();
    }
}
