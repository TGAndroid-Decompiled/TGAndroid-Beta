package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.q6;
import org.telegram.ui.r6;
public final class b {
    public final boolean f54787a;
    public long f54795k;
    public boolean f54797m;
    public boolean f54798n;
    public boolean f54799o;
    public boolean f54800p;
    public boolean f54801q;
    public long f54802r;
    public long f54803s;
    public long f54804t;
    public long f54805u;
    public long v;
    public ArrayList f54788b = new ArrayList();
    public final LongSparseArray f54789c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f54790e = new ArrayList();
    public final ArrayList f54791f = new ArrayList();
    public final ArrayList f54792g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f54793i = new HashSet();
    public final HashSet f54794j = new HashSet();
    public final HashSet f54796l = new HashSet();

    public b(boolean z10) {
        this.f54787a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f54787a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f54797m = false;
                    return;
                } else if (i10 == 1) {
                    this.f54798n = false;
                    return;
                } else if (i10 == 2) {
                    this.f54799o = false;
                    return;
                } else if (i10 == 3) {
                    this.f54800p = false;
                    return;
                } else if (i10 == 4) {
                    this.f54801q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f54797m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f54798n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f54799o = b(i10, this.f54790e);
            } else if (i10 == 3) {
                this.f54800p = b(i10, this.f54791f);
            } else if (i10 == 4) {
                this.f54801q = b(i10, this.f54792g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f54794j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f54787a) {
            HashSet hashSet = this.f54793i;
            hashSet.clear();
            HashSet hashSet2 = this.f54794j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f54782b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f54796l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                q6 q6Var = (q6) this.f54789c.get(((Long) it2.next()).longValue());
                if (q6Var != null) {
                    SparseArray sparseArray = q6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((r6) sparseArray.valueAt(i10)).f41337b;
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
                            hashSet3.add(Long.valueOf(q6Var.f41046a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f54795k = 0L;
        this.f54794j.clear();
        this.f54796l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f54790e;
        }
        if (i10 == 3) {
            return this.f54791f;
        }
        if (i10 == 4) {
            return this.f54792g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f54802r;
        }
        if (i10 == 1) {
            return this.f54803s;
        }
        if (i10 == 2) {
            return this.f54804t;
        }
        if (i10 == 3) {
            return this.f54805u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f54783c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f54802r += j3;
        } else if (i10 == 1) {
            this.f54803s += j3;
        } else if (i10 == 2) {
            this.f54804t += j3;
        } else if (i10 == 3) {
            this.f54805u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f54790e.isEmpty() && this.f54791f.isEmpty()) {
            if (this.f54787a || this.f54788b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f54794j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f54795k -= aVar.f54783c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f54795k += aVar.f54783c;
            a(aVar.d, true);
        }
        c();
    }
}
