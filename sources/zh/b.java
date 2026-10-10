package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class b {
    public final boolean f54744a;
    public long f54752k;
    public boolean f54754m;
    public boolean f54755n;
    public boolean f54756o;
    public boolean f54757p;
    public boolean f54758q;
    public long f54759r;
    public long f54760s;
    public long f54761t;
    public long f54762u;
    public long v;
    public ArrayList f54745b = new ArrayList();
    public final LongSparseArray f54746c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f54747e = new ArrayList();
    public final ArrayList f54748f = new ArrayList();
    public final ArrayList f54749g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f54750i = new HashSet();
    public final HashSet f54751j = new HashSet();
    public final HashSet f54753l = new HashSet();

    public b(boolean z10) {
        this.f54744a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f54744a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f54754m = false;
                    return;
                } else if (i10 == 1) {
                    this.f54755n = false;
                    return;
                } else if (i10 == 2) {
                    this.f54756o = false;
                    return;
                } else if (i10 == 3) {
                    this.f54757p = false;
                    return;
                } else if (i10 == 4) {
                    this.f54758q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f54754m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f54755n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f54756o = b(i10, this.f54747e);
            } else if (i10 == 3) {
                this.f54757p = b(i10, this.f54748f);
            } else if (i10 == 4) {
                this.f54758q = b(i10, this.f54749g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f54751j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f54744a) {
            HashSet hashSet = this.f54750i;
            hashSet.clear();
            HashSet hashSet2 = this.f54751j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f54739b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f54753l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f54746c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).f41632b;
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
                            hashSet3.add(Long.valueOf(r6Var.f41325a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f54752k = 0L;
        this.f54751j.clear();
        this.f54753l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f54747e;
        }
        if (i10 == 3) {
            return this.f54748f;
        }
        if (i10 == 4) {
            return this.f54749g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f54759r;
        }
        if (i10 == 1) {
            return this.f54760s;
        }
        if (i10 == 2) {
            return this.f54761t;
        }
        if (i10 == 3) {
            return this.f54762u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f54740c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f54759r += j3;
        } else if (i10 == 1) {
            this.f54760s += j3;
        } else if (i10 == 2) {
            this.f54761t += j3;
        } else if (i10 == 3) {
            this.f54762u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f54747e.isEmpty() && this.f54748f.isEmpty()) {
            if (this.f54744a || this.f54745b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f54751j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f54752k -= aVar.f54740c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f54752k += aVar.f54740c;
            a(aVar.d, true);
        }
        c();
    }
}
