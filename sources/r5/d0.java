package r5;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.g3;
import com.google.android.gms.internal.cast.n4;
import com.google.android.gms.internal.cast.r2;
import com.google.android.gms.internal.cast.t6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.yh;
public final class d0 extends s5.g {
    public final int f46743a;
    public final Object f46744b;

    public d0(Object obj, int i10) {
        this.f46743a = i10;
        this.f46744b = obj;
    }

    @Override
    public void a() {
        switch (this.f46743a) {
            case 2:
                ((t5.h) this.f46744b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f46743a) {
            case 2:
                ((t5.h) this.f46744b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f46743a) {
            case 2:
                ((t5.h) this.f46744b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f46743a) {
            case 2:
                ((t5.h) this.f46744b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f46743a) {
            case 1:
                s5.c cVar = (s5.c) this.f46744b;
                long e6 = cVar.e();
                if (e6 != cVar.f47051b) {
                    cVar.f47051b = e6;
                    cVar.c();
                    if (cVar.f47051b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((t5.h) this.f46744b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.f46743a) {
            case 0:
                n4 n4Var = ((c) this.f46744b).f46741l;
                if (n4Var != null) {
                    t6 E = n4Var.f3070a.E();
                    r2 r2Var = new r2(str);
                    r2Var.f3115b = j10;
                    r2Var.f3116c = i10;
                    r2Var.d = j11;
                    r2Var.f3117e = j12;
                    g3 g3Var = new g3(r2Var);
                    g3Var.f3009f = E.h;
                    E.d.add(g3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f46743a) {
            case 1:
                s5.c cVar = (s5.c) this.f46744b;
                ArrayList c3 = u5.a.c(iArr);
                if (!cVar.d.equals(c3)) {
                    cVar.h();
                    cVar.f47054f.evictAll();
                    cVar.f47055g.clear();
                    cVar.d = c3;
                    s5.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void j(int[] iArr, int i10) {
        int i11;
        switch (this.f46743a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((s5.c) this.f46744b).d.size();
                } else {
                    i11 = ((s5.c) this.f46744b).f47053e.get(i10, -1);
                    if (i11 == -1) {
                        ((s5.c) this.f46744b).d();
                        return;
                    }
                }
                ((s5.c) this.f46744b).h();
                ((s5.c) this.f46744b).d.addAll(i11, u5.a.c(iArr));
                s5.c.b((s5.c) this.f46744b);
                s5.c cVar = (s5.c) this.f46744b;
                synchronized (cVar.f47060m) {
                    Iterator it = cVar.f47060m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((s5.c) this.f46744b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(q5.o[] oVarArr) {
        switch (this.f46743a) {
            case 1:
                HashSet hashSet = new HashSet();
                s5.c cVar = (s5.c) this.f46744b;
                SparseIntArray sparseIntArray = cVar.f47053e;
                ArrayList arrayList = cVar.f47055g;
                arrayList.clear();
                int i10 = 0;
                for (q5.o oVar : oVarArr) {
                    int i11 = oVar.f44627b;
                    cVar.f47054f.put(Integer.valueOf(i11), oVar);
                    int i12 = sparseIntArray.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    hashSet.add(Integer.valueOf(i12));
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    int i13 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i13 != -1) {
                        hashSet.add(Integer.valueOf(i13));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                u5.a.e(arrayList2);
                s5.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(int[] iArr) {
        switch (this.f46743a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((s5.c) this.f46744b).f47054f.remove(Integer.valueOf(i10));
                    int i11 = ((s5.c) this.f46744b).f47053e.get(i10, -1);
                    if (i11 == -1) {
                        ((s5.c) this.f46744b).d();
                        return;
                    }
                    ((s5.c) this.f46744b).f47053e.delete(i10);
                    arrayList.add(Integer.valueOf(i11));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((s5.c) this.f46744b).h();
                    ((s5.c) this.f46744b).d.removeAll(u5.a.c(iArr));
                    s5.c.b((s5.c) this.f46744b);
                    s5.c cVar = (s5.c) this.f46744b;
                    u5.a.e(arrayList);
                    synchronized (cVar.f47060m) {
                        Iterator it = cVar.f47060m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((s5.c) this.f46744b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f46743a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((s5.c) this.f46744b).d.size();
                } else if (arrayList2.isEmpty()) {
                    u5.b bVar = ((s5.c) this.f46744b).f47050a;
                    Log.w(bVar.f48385a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((s5.c) this.f46744b).f47053e.get(i10, -1) == -1) {
                    ((s5.c) this.f46744b).f47053e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((s5.c) this.f46744b).f47053e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((s5.c) this.f46744b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((s5.c) this.f46744b).h();
                s5.c cVar = (s5.c) this.f46744b;
                cVar.d = arrayList;
                s5.c.b(cVar);
                s5.c cVar2 = (s5.c) this.f46744b;
                synchronized (cVar2.f47060m) {
                    Iterator it = cVar2.f47060m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((s5.c) this.f46744b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f46743a) {
            case 1:
                s5.c cVar = (s5.c) this.f46744b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f47054f.remove(Integer.valueOf(i11));
                    int i12 = cVar.f47053e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    i10 = yh.d(i12, i10, 1, arrayList);
                }
                Collections.sort(arrayList);
                cVar.h();
                u5.a.e(arrayList);
                s5.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void o() {
        switch (this.f46743a) {
            case 1:
                ((s5.c) this.f46744b).d();
                return;
            default:
                return;
        }
    }
}
