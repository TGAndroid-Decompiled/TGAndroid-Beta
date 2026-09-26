package zh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class b {
    public final boolean f49468a;
    public long f49475k;
    public boolean f49477m;
    public boolean f49478n;
    public boolean f49479o;
    public boolean f49480p;
    public boolean f49481q;
    public long f49482r;
    public long f49483s;
    public long f49484t;
    public long f49485u;
    public long v;
    public ArrayList f49469b = new ArrayList();
    public final LongSparseArray f49470c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f49471f = new ArrayList();
    public final ArrayList f49472g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49473i = new HashSet();
    public final HashSet f49474j = new HashSet();
    public final HashSet f49476l = new HashSet();

    public b(boolean z10) {
        this.f49468a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f49468a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f49477m = false;
                    return;
                } else if (i10 == 1) {
                    this.f49478n = false;
                    return;
                } else if (i10 == 2) {
                    this.f49479o = false;
                    return;
                } else if (i10 == 3) {
                    this.f49480p = false;
                    return;
                } else if (i10 == 4) {
                    this.f49481q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f49477m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f49478n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f49479o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f49480p = b(i10, this.f49471f);
            } else if (i10 == 4) {
                this.f49481q = b(i10, this.f49472g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f49474j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f49468a) {
            HashSet hashSet = this.f49473i;
            hashSet.clear();
            HashSet hashSet2 = this.f49474j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((a) it.next()).f49464b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f49476l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f49470c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).f37599b;
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
                            hashSet3.add(Long.valueOf(r6Var.f37185a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f49475k = 0L;
        this.f49474j.clear();
        this.f49476l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f49471f;
        }
        if (i10 == 4) {
            return this.f49472g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f49482r;
        }
        if (i10 == 1) {
            return this.f49483s;
        }
        if (i10 == 2) {
            return this.f49484t;
        }
        if (i10 == 3) {
            return this.f49485u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j3 = aVar.f49465c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f49482r += j3;
        } else if (i10 == 1) {
            this.f49483s += j3;
        } else if (i10 == 2) {
            this.f49484t += j3;
        } else if (i10 == 3) {
            this.f49485u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f49471f.isEmpty()) {
            if (this.f49468a || this.f49469b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f49474j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f49475k -= aVar.f49465c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f49475k += aVar.f49465c;
            a(aVar.d, true);
        }
        c();
    }
}
