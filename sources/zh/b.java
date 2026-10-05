package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f53579a;
    public long f53587k;
    public boolean f53589m;
    public boolean f53590n;
    public boolean f53591o;
    public boolean f53592p;
    public boolean f53593q;
    public long f53594r;
    public long f53595s;
    public long f53596t;
    public long f53597u;
    public long v;
    public ArrayList f53580b = new ArrayList();
    public final LongSparseArray f53581c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f53582e = new ArrayList();
    public final ArrayList f53583f = new ArrayList();
    public final ArrayList f53584g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f53585i = new HashSet();
    public final HashSet f53586j = new HashSet();
    public final HashSet f53588l = new HashSet();

    public b(boolean z10) {
        this.f53579a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f53579a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f53589m = false;
                    return;
                } else if (i10 == 1) {
                    this.f53590n = false;
                    return;
                } else if (i10 == 2) {
                    this.f53591o = false;
                    return;
                } else if (i10 == 3) {
                    this.f53592p = false;
                    return;
                } else if (i10 == 4) {
                    this.f53593q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f53589m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f53590n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f53591o = b(i10, this.f53582e);
            } else if (i10 == 3) {
                this.f53592p = b(i10, this.f53583f);
            } else if (i10 == 4) {
                this.f53593q = b(i10, this.f53584g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f53586j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f53579a) {
            HashSet hashSet = this.f53585i;
            hashSet.clear();
            HashSet hashSet2 = this.f53586j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f53574b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f53588l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f53581c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f41611b;
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
                            hashSet3.add(Long.valueOf(u6Var.f41123a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f53587k = 0L;
        this.f53586j.clear();
        this.f53588l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f53582e;
        }
        if (i10 == 3) {
            return this.f53583f;
        }
        if (i10 == 4) {
            return this.f53584g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f53594r;
        }
        if (i10 == 1) {
            return this.f53595s;
        }
        if (i10 == 2) {
            return this.f53596t;
        }
        if (i10 == 3) {
            return this.f53597u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f53575c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f53594r += j3;
        } else if (i10 == 1) {
            this.f53595s += j3;
        } else if (i10 == 2) {
            this.f53596t += j3;
        } else if (i10 == 3) {
            this.f53597u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f53582e.isEmpty() && this.f53583f.isEmpty()) {
            if (this.f53579a || this.f53580b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f53586j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f53587k -= aVar.f53575c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f53587k += aVar.f53575c;
            a(aVar.d, true);
        }
        c();
    }
}
