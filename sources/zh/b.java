package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class b {
    public final boolean f49450a;
    public long f49457k;
    public boolean f49459m;
    public boolean f49460n;
    public boolean f49461o;
    public boolean f49462p;
    public boolean f49463q;
    public long f49464r;
    public long f49465s;
    public long f49466t;
    public long f49467u;
    public long v;
    public ArrayList f49451b = new ArrayList();
    public final LongSparseArray f49452c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49453f = new ArrayList();
    public final ArrayList f49454g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49455i = new HashSet();
    public final HashSet f49456j = new HashSet();
    public final HashSet f49458l = new HashSet();

    public b(boolean z10) {
        this.f49450a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49450a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49459m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49460n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49461o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49462p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49463q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49459m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49460n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49461o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49462p = b(i10, this.f49453f);
            } else if (i10 == 4) {
                this.f49463q = b(i10, this.f49454g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49456j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49450a) {
            HashSet hashSet = this.f49455i;
            hashSet.clear();
            HashSet hashSet2 = this.f49456j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49446b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49458l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f49452c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f37581b;
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
                            hashSet3.add(Long.valueOf(s6Var.f37201a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49457k = 0L;
        this.f49456j.clear();
        this.f49458l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49453f;
        }
        if (i10 == 4) {
            return this.f49454g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49464r;
        }
        if (i10 == 1) {
            return this.f49465s;
        }
        if (i10 == 2) {
            return this.f49466t;
        }
        if (i10 == 3) {
            return this.f49467u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49447c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49464r += j3;
        } else if (i10 == 1) {
            this.f49465s += j3;
        } else if (i10 == 2) {
            this.f49466t += j3;
        } else if (i10 == 3) {
            this.f49467u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49453f.isEmpty()) {
            if (this.f49450a || this.f49451b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49456j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49457k -= aVar.f49447c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49457k += aVar.f49447c;
            a(aVar.d, true);
        }
        c();
    }
}
