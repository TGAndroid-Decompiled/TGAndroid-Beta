package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class b {
    public final boolean f49517a;
    public long f49524k;
    public boolean f49526m;
    public boolean f49527n;
    public boolean f49528o;
    public boolean f49529p;
    public boolean f49530q;
    public long f49531r;
    public long f49532s;
    public long f49533t;
    public long f49534u;
    public long v;
    public ArrayList f49518b = new ArrayList();
    public final LongSparseArray f49519c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49520f = new ArrayList();
    public final ArrayList f49521g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49522i = new HashSet();
    public final HashSet f49523j = new HashSet();
    public final HashSet f49525l = new HashSet();

    public b(boolean z10) {
        this.f49517a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49517a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49526m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49527n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49528o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49529p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49530q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49526m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49527n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49528o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49529p = b(i10, this.f49520f);
            } else if (i10 == 4) {
                this.f49530q = b(i10, this.f49521g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49523j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49517a) {
            HashSet hashSet = this.f49522i;
            hashSet.clear();
            HashSet hashSet2 = this.f49523j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49513b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49525l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f49519c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f37661b;
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
                            hashSet3.add(Long.valueOf(s6Var.f37324a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49524k = 0L;
        this.f49523j.clear();
        this.f49525l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49520f;
        }
        if (i10 == 4) {
            return this.f49521g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49531r;
        }
        if (i10 == 1) {
            return this.f49532s;
        }
        if (i10 == 2) {
            return this.f49533t;
        }
        if (i10 == 3) {
            return this.f49534u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49514c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49531r += j3;
        } else if (i10 == 1) {
            this.f49532s += j3;
        } else if (i10 == 2) {
            this.f49533t += j3;
        } else if (i10 == 3) {
            this.f49534u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49520f.isEmpty()) {
            if (this.f49517a || this.f49518b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49523j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49524k -= aVar.f49514c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49524k += aVar.f49514c;
            a(aVar.d, true);
        }
        c();
    }
}
