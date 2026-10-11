package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.q6;
import org.telegram.ui.r6;
public final class b {
    public final boolean f54821a;
    public long f54829k;
    public boolean f54831m;
    public boolean f54832n;
    public boolean f54833o;
    public boolean f54834p;
    public boolean f54835q;
    public long f54836r;
    public long f54837s;
    public long f54838t;
    public long f54839u;
    public long v;
    public ArrayList f54822b = new ArrayList();
    public final LongSparseArray f54823c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f54824e = new ArrayList();
    public final ArrayList f54825f = new ArrayList();
    public final ArrayList f54826g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f54827i = new HashSet();
    public final HashSet f54828j = new HashSet();
    public final HashSet f54830l = new HashSet();

    public b(boolean z10) {
        this.f54821a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f54821a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f54831m = false;
                    return;
                } else if (i10 == 1) {
                    this.f54832n = false;
                    return;
                } else if (i10 == 2) {
                    this.f54833o = false;
                    return;
                } else if (i10 == 3) {
                    this.f54834p = false;
                    return;
                } else if (i10 == 4) {
                    this.f54835q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f54831m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f54832n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f54833o = b(i10, this.f54824e);
            } else if (i10 == 3) {
                this.f54834p = b(i10, this.f54825f);
            } else if (i10 == 4) {
                this.f54835q = b(i10, this.f54826g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f54828j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f54821a) {
            HashSet hashSet = this.f54827i;
            hashSet.clear();
            HashSet hashSet2 = this.f54828j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f54816b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f54830l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                q6 q6Var = (q6) this.f54823c.get(((Long) it2.next()).longValue());
                if (q6Var != null) {
                    SparseArray sparseArray = q6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((r6) sparseArray.valueAt(i10)).f41371b;
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
                            hashSet3.add(Long.valueOf(q6Var.f41080a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f54829k = 0L;
        this.f54828j.clear();
        this.f54830l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f54824e;
        }
        if (i10 == 3) {
            return this.f54825f;
        }
        if (i10 == 4) {
            return this.f54826g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f54836r;
        }
        if (i10 == 1) {
            return this.f54837s;
        }
        if (i10 == 2) {
            return this.f54838t;
        }
        if (i10 == 3) {
            return this.f54839u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f54817c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f54836r += j3;
        } else if (i10 == 1) {
            this.f54837s += j3;
        } else if (i10 == 2) {
            this.f54838t += j3;
        } else if (i10 == 3) {
            this.f54839u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f54824e.isEmpty() && this.f54825f.isEmpty()) {
            if (this.f54821a || this.f54822b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f54828j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f54829k -= aVar.f54817c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f54829k += aVar.f54817c;
            a(aVar.d, true);
        }
        c();
    }
}
