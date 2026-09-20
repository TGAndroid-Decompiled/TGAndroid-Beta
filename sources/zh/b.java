package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class b {
    public final boolean f49496a;
    public long f49503k;
    public boolean f49505m;
    public boolean f49506n;
    public boolean f49507o;
    public boolean f49508p;
    public boolean f49509q;
    public long f49510r;
    public long f49511s;
    public long f49512t;
    public long f49513u;
    public long v;
    public ArrayList f49497b = new ArrayList();
    public final LongSparseArray f49498c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49499f = new ArrayList();
    public final ArrayList f49500g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49501i = new HashSet();
    public final HashSet f49502j = new HashSet();
    public final HashSet f49504l = new HashSet();

    public b(boolean z10) {
        this.f49496a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49496a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49505m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49506n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49507o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49508p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49509q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49505m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49506n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49507o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49508p = b(i10, this.f49499f);
            } else if (i10 == 4) {
                this.f49509q = b(i10, this.f49500g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49502j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49496a) {
            HashSet hashSet = this.f49501i;
            hashSet.clear();
            HashSet hashSet2 = this.f49502j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49492b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49504l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f49498c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f37637b;
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
                            hashSet3.add(Long.valueOf(s6Var.f37302a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49503k = 0L;
        this.f49502j.clear();
        this.f49504l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49499f;
        }
        if (i10 == 4) {
            return this.f49500g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49510r;
        }
        if (i10 == 1) {
            return this.f49511s;
        }
        if (i10 == 2) {
            return this.f49512t;
        }
        if (i10 == 3) {
            return this.f49513u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49493c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49510r += j3;
        } else if (i10 == 1) {
            this.f49511s += j3;
        } else if (i10 == 2) {
            this.f49512t += j3;
        } else if (i10 == 3) {
            this.f49513u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49499f.isEmpty()) {
            if (this.f49496a || this.f49497b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49502j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49503k -= aVar.f49493c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49503k += aVar.f49493c;
            a(aVar.d, true);
        }
        c();
    }
}
