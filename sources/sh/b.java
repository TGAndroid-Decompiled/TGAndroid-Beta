package sh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class b {
    public final boolean f48497a;
    public long f48504k;
    public boolean f48506m;
    public boolean f48507n;
    public boolean f48508o;
    public boolean f48509p;
    public boolean f48510q;
    public long f48511r;
    public long f48512s;
    public long f48513t;
    public long f48514u;
    public long v;
    public ArrayList f48498b = new ArrayList();
    public final LongSparseArray f48499c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f48500f = new ArrayList();
    public final ArrayList f48501g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f48502i = new HashSet();
    public final HashSet f48503j = new HashSet();
    public final HashSet f48505l = new HashSet();

    public b(boolean z10) {
        this.f48497a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f48497a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f48506m = false;
                    return;
                } else if (i10 == 1) {
                    this.f48507n = false;
                    return;
                } else if (i10 == 2) {
                    this.f48508o = false;
                    return;
                } else if (i10 == 3) {
                    this.f48509p = false;
                    return;
                } else if (i10 == 4) {
                    this.f48510q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f48506m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f48507n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f48508o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f48509p = b(i10, this.f48500f);
            } else if (i10 == 4) {
                this.f48510q = b(i10, this.f48501g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f48503j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f48497a) {
            HashSet hashSet = this.f48502i;
            hashSet.clear();
            HashSet hashSet2 = this.f48503j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f48493b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f48505l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f48499c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f41742b;
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
                            hashSet3.add(Long.valueOf(s6Var.f41380a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f48504k = 0L;
        this.f48503j.clear();
        this.f48505l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f48500f;
        }
        if (i10 == 4) {
            return this.f48501g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f48511r;
        }
        if (i10 == 1) {
            return this.f48512s;
        }
        if (i10 == 2) {
            return this.f48513t;
        }
        if (i10 == 3) {
            return this.f48514u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j10 = aVar.f48494c;
        if (!z10) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f48511r += j10;
        } else if (i10 == 1) {
            this.f48512s += j10;
        } else if (i10 == 2) {
            this.f48513t += j10;
        } else if (i10 == 3) {
            this.f48514u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f48500f.isEmpty()) {
            if (this.f48497a || this.f48498b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f48503j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f48504k -= aVar.f48494c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f48504k += aVar.f48494c;
            a(aVar.d, true);
        }
        c();
    }
}
