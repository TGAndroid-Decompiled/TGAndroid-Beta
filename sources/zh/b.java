package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f49515a;
    public long f49522k;
    public boolean f49524m;
    public boolean f49525n;
    public boolean f49526o;
    public boolean f49527p;
    public boolean f49528q;
    public long f49529r;
    public long f49530s;
    public long f49531t;
    public long f49532u;
    public long v;
    public ArrayList f49516b = new ArrayList();
    public final LongSparseArray f49517c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49518f = new ArrayList();
    public final ArrayList f49519g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49520i = new HashSet();
    public final HashSet f49521j = new HashSet();
    public final HashSet f49523l = new HashSet();

    public b(boolean z10) {
        this.f49515a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49515a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49524m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49525n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49526o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49527p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49528q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49524m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49525n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49526o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49527p = b(i10, this.f49518f);
            } else if (i10 == 4) {
                this.f49528q = b(i10, this.f49519g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49521j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49515a) {
            HashSet hashSet = this.f49520i;
            hashSet.clear();
            HashSet hashSet2 = this.f49521j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49511b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49523l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f49517c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f38457b;
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
                            hashSet3.add(Long.valueOf(u6Var.f38128a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49522k = 0L;
        this.f49521j.clear();
        this.f49523l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49518f;
        }
        if (i10 == 4) {
            return this.f49519g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49529r;
        }
        if (i10 == 1) {
            return this.f49530s;
        }
        if (i10 == 2) {
            return this.f49531t;
        }
        if (i10 == 3) {
            return this.f49532u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49512c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49529r += j3;
        } else if (i10 == 1) {
            this.f49530s += j3;
        } else if (i10 == 2) {
            this.f49531t += j3;
        } else if (i10 == 3) {
            this.f49532u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49518f.isEmpty()) {
            if (this.f49515a || this.f49516b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49521j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49522k -= aVar.f49512c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49522k += aVar.f49512c;
            a(aVar.d, true);
        }
        c();
    }
}
