package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class b {
    public final boolean f49577a;
    public long f49584k;
    public boolean f49586m;
    public boolean f49587n;
    public boolean f49588o;
    public boolean f49589p;
    public boolean f49590q;
    public long f49591r;
    public long f49592s;
    public long f49593t;
    public long f49594u;
    public long v;
    public ArrayList f49578b = new ArrayList();
    public final LongSparseArray f49579c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49580f = new ArrayList();
    public final ArrayList f49581g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49582i = new HashSet();
    public final HashSet f49583j = new HashSet();
    public final HashSet f49585l = new HashSet();

    public b(boolean z10) {
        this.f49577a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49577a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49586m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49587n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49588o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49589p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49590q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49586m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49587n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49588o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49589p = b(i10, this.f49580f);
            } else if (i10 == 4) {
                this.f49590q = b(i10, this.f49581g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49583j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49577a) {
            HashSet hashSet = this.f49582i;
            hashSet.clear();
            HashSet hashSet2 = this.f49583j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49573b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49585l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f49579c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).f37696b;
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
                            hashSet3.add(Long.valueOf(r6Var.f37288a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49584k = 0L;
        this.f49583j.clear();
        this.f49585l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49580f;
        }
        if (i10 == 4) {
            return this.f49581g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49591r;
        }
        if (i10 == 1) {
            return this.f49592s;
        }
        if (i10 == 2) {
            return this.f49593t;
        }
        if (i10 == 3) {
            return this.f49594u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49574c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49591r += j3;
        } else if (i10 == 1) {
            this.f49592s += j3;
        } else if (i10 == 2) {
            this.f49593t += j3;
        } else if (i10 == 3) {
            this.f49594u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49580f.isEmpty()) {
            if (this.f49577a || this.f49578b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49583j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49584k -= aVar.f49574c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49584k += aVar.f49574c;
            a(aVar.d, true);
        }
        c();
    }
}
