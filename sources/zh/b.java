package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class b {
    public final boolean f49192a;
    public long f49199k;
    public boolean f49201m;
    public boolean f49202n;
    public boolean f49203o;
    public boolean f49204p;
    public boolean f49205q;
    public long f49206r;
    public long f49207s;
    public long f49208t;
    public long f49209u;
    public long v;
    public ArrayList f49193b = new ArrayList();
    public final LongSparseArray f49194c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49195f = new ArrayList();
    public final ArrayList f49196g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49197i = new HashSet();
    public final HashSet f49198j = new HashSet();
    public final HashSet f49200l = new HashSet();

    public b(boolean z10) {
        this.f49192a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49192a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49201m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49202n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49203o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49204p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49205q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49201m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49202n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49203o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49204p = b(i10, this.f49195f);
            } else if (i10 == 4) {
                this.f49205q = b(i10, this.f49196g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49198j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49192a) {
            HashSet hashSet = this.f49197i;
            hashSet.clear();
            HashSet hashSet2 = this.f49198j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49188b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49200l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f49194c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f37577b;
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
                            hashSet3.add(Long.valueOf(s6Var.f37274a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49199k = 0L;
        this.f49198j.clear();
        this.f49200l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49195f;
        }
        if (i10 == 4) {
            return this.f49196g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49206r;
        }
        if (i10 == 1) {
            return this.f49207s;
        }
        if (i10 == 2) {
            return this.f49208t;
        }
        if (i10 == 3) {
            return this.f49209u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49189c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49206r += j3;
        } else if (i10 == 1) {
            this.f49207s += j3;
        } else if (i10 == 2) {
            this.f49208t += j3;
        } else if (i10 == 3) {
            this.f49209u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49195f.isEmpty()) {
            if (this.f49192a || this.f49193b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49198j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49199k -= aVar.f49189c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49199k += aVar.f49189c;
            a(aVar.d, true);
        }
        c();
    }
}
