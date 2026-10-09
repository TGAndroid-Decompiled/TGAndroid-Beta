package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class b {
    public final boolean f54698a;
    public long f54706k;
    public boolean f54708m;
    public boolean f54709n;
    public boolean f54710o;
    public boolean f54711p;
    public boolean f54712q;
    public long f54713r;
    public long f54714s;
    public long f54715t;
    public long f54716u;
    public long v;
    public ArrayList f54699b = new ArrayList();
    public final LongSparseArray f54700c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f54701e = new ArrayList();
    public final ArrayList f54702f = new ArrayList();
    public final ArrayList f54703g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f54704i = new HashSet();
    public final HashSet f54705j = new HashSet();
    public final HashSet f54707l = new HashSet();

    public b(boolean z10) {
        this.f54698a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f54698a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f54708m = false;
                    return;
                } else if (i10 == 1) {
                    this.f54709n = false;
                    return;
                } else if (i10 == 2) {
                    this.f54710o = false;
                    return;
                } else if (i10 == 3) {
                    this.f54711p = false;
                    return;
                } else if (i10 == 4) {
                    this.f54712q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f54708m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f54709n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f54710o = b(i10, this.f54701e);
            } else if (i10 == 3) {
                this.f54711p = b(i10, this.f54702f);
            } else if (i10 == 4) {
                this.f54712q = b(i10, this.f54703g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f54705j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f54698a) {
            HashSet hashSet = this.f54704i;
            hashSet.clear();
            HashSet hashSet2 = this.f54705j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f54693b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f54707l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f54700c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).f41586b;
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
                            hashSet3.add(Long.valueOf(r6Var.f41279a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f54706k = 0L;
        this.f54705j.clear();
        this.f54707l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f54701e;
        }
        if (i10 == 3) {
            return this.f54702f;
        }
        if (i10 == 4) {
            return this.f54703g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f54713r;
        }
        if (i10 == 1) {
            return this.f54714s;
        }
        if (i10 == 2) {
            return this.f54715t;
        }
        if (i10 == 3) {
            return this.f54716u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f54694c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f54713r += j3;
        } else if (i10 == 1) {
            this.f54714s += j3;
        } else if (i10 == 2) {
            this.f54715t += j3;
        } else if (i10 == 3) {
            this.f54716u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f54701e.isEmpty() && this.f54702f.isEmpty()) {
            if (this.f54698a || this.f54699b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f54705j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f54706k -= aVar.f54694c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f54706k += aVar.f54694c;
            a(aVar.d, true);
        }
        c();
    }
}
