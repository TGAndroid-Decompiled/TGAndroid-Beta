package yh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class b {
    public final boolean f47172a;
    public long f47179k;
    public boolean f47181m;
    public boolean f47182n;
    public boolean f47183o;
    public boolean f47184p;
    public boolean f47185q;
    public long f47186r;
    public long f47187s;
    public long f47188t;
    public long f47189u;
    public long v;
    public ArrayList f47173b = new ArrayList();
    public final LongSparseArray f47174c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f47175f = new ArrayList();
    public final ArrayList f47176g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f47177i = new HashSet();
    public final HashSet f47178j = new HashSet();
    public final HashSet f47180l = new HashSet();

    public b(boolean z10) {
        this.f47172a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f47172a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f47181m = false;
                    return;
                } else if (i10 == 1) {
                    this.f47182n = false;
                    return;
                } else if (i10 == 2) {
                    this.f47183o = false;
                    return;
                } else if (i10 == 3) {
                    this.f47184p = false;
                    return;
                } else if (i10 == 4) {
                    this.f47185q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f47181m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f47182n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f47183o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f47184p = b(i10, this.f47175f);
            } else if (i10 == 4) {
                this.f47185q = b(i10, this.f47176g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f47178j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f47172a) {
            HashSet hashSet = this.f47177i;
            hashSet.clear();
            HashSet hashSet2 = this.f47178j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f47168b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f47180l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f47174c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).f36560b;
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
                            hashSet3.add(Long.valueOf(r6Var.f36238a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f47179k = 0L;
        this.f47178j.clear();
        this.f47180l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f47175f;
        }
        if (i10 == 4) {
            return this.f47176g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f47186r;
        }
        if (i10 == 1) {
            return this.f47187s;
        }
        if (i10 == 2) {
            return this.f47188t;
        }
        if (i10 == 3) {
            return this.f47189u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f47169c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f47186r += j3;
        } else if (i10 == 1) {
            this.f47187s += j3;
        } else if (i10 == 2) {
            this.f47188t += j3;
        } else if (i10 == 3) {
            this.f47189u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f47175f.isEmpty()) {
            if (this.f47172a || this.f47173b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f47178j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f47179k -= aVar.f47169c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f47179k += aVar.f47169c;
            a(aVar.d, true);
        }
        c();
    }
}
