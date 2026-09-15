package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class b {
    public final boolean f49199a;
    public long f49206k;
    public boolean f49208m;
    public boolean f49209n;
    public boolean f49210o;
    public boolean f49211p;
    public boolean f49212q;
    public long f49213r;
    public long f49214s;
    public long f49215t;
    public long f49216u;
    public long v;
    public ArrayList f49200b = new ArrayList();
    public final LongSparseArray f49201c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49202f = new ArrayList();
    public final ArrayList f49203g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49204i = new HashSet();
    public final HashSet f49205j = new HashSet();
    public final HashSet f49207l = new HashSet();

    public b(boolean z10) {
        this.f49199a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49199a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49208m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49209n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49210o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49211p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49212q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49208m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49209n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49210o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49211p = b(i10, this.f49202f);
            } else if (i10 == 4) {
                this.f49212q = b(i10, this.f49203g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49205j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49199a) {
            HashSet hashSet = this.f49204i;
            hashSet.clear();
            HashSet hashSet2 = this.f49205j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49195b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49207l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f49201c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f37564b;
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
                            hashSet3.add(Long.valueOf(s6Var.f37257a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49206k = 0L;
        this.f49205j.clear();
        this.f49207l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49202f;
        }
        if (i10 == 4) {
            return this.f49203g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49213r;
        }
        if (i10 == 1) {
            return this.f49214s;
        }
        if (i10 == 2) {
            return this.f49215t;
        }
        if (i10 == 3) {
            return this.f49216u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49196c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49213r += j3;
        } else if (i10 == 1) {
            this.f49214s += j3;
        } else if (i10 == 2) {
            this.f49215t += j3;
        } else if (i10 == 3) {
            this.f49216u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49202f.isEmpty()) {
            if (this.f49199a || this.f49200b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49205j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49206k -= aVar.f49196c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49206k += aVar.f49196c;
            a(aVar.d, true);
        }
        c();
    }
}
