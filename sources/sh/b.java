package sh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class b {
    public final boolean f48508a;
    public long f48515k;
    public boolean f48517m;
    public boolean f48518n;
    public boolean f48519o;
    public boolean f48520p;
    public boolean f48521q;
    public long f48522r;
    public long f48523s;
    public long f48524t;
    public long f48525u;
    public long v;
    public ArrayList f48509b = new ArrayList();
    public final LongSparseArray f48510c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f48511f = new ArrayList();
    public final ArrayList f48512g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f48513i = new HashSet();
    public final HashSet f48514j = new HashSet();
    public final HashSet f48516l = new HashSet();

    public b(boolean z10) {
        this.f48508a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f48508a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f48517m = false;
                    return;
                } else if (i10 == 1) {
                    this.f48518n = false;
                    return;
                } else if (i10 == 2) {
                    this.f48519o = false;
                    return;
                } else if (i10 == 3) {
                    this.f48520p = false;
                    return;
                } else if (i10 == 4) {
                    this.f48521q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f48517m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f48518n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f48519o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f48520p = b(i10, this.f48511f);
            } else if (i10 == 4) {
                this.f48521q = b(i10, this.f48512g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f48514j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f48508a) {
            HashSet hashSet = this.f48513i;
            hashSet.clear();
            HashSet hashSet2 = this.f48514j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f48504b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f48516l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f48510c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f41550b;
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
                            hashSet3.add(Long.valueOf(s6Var.f41231a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f48515k = 0L;
        this.f48514j.clear();
        this.f48516l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f48511f;
        }
        if (i10 == 4) {
            return this.f48512g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f48522r;
        }
        if (i10 == 1) {
            return this.f48523s;
        }
        if (i10 == 2) {
            return this.f48524t;
        }
        if (i10 == 3) {
            return this.f48525u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j10 = aVar.f48505c;
        if (!z10) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f48522r += j10;
        } else if (i10 == 1) {
            this.f48523s += j10;
        } else if (i10 == 2) {
            this.f48524t += j10;
        } else if (i10 == 3) {
            this.f48525u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f48511f.isEmpty()) {
            if (this.f48508a || this.f48509b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f48514j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f48515k -= aVar.f48505c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f48515k += aVar.f48505c;
            a(aVar.d, true);
        }
        c();
    }
}
