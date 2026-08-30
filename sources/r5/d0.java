package r5;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.s2;
import com.google.android.gms.internal.cast.u6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.yh;
public final class d0 extends s5.g {
    public final int f43363a;
    public final Object f43364b;

    public d0(Object obj, int i10) {
        this.f43363a = i10;
        this.f43364b = obj;
    }

    @Override
    public void a() {
        switch (this.f43363a) {
            case 2:
                ((t5.h) this.f43364b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f43363a) {
            case 2:
                ((t5.h) this.f43364b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f43363a) {
            case 2:
                ((t5.h) this.f43364b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f43363a) {
            case 2:
                ((t5.h) this.f43364b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f43363a) {
            case 1:
                s5.c cVar = (s5.c) this.f43364b;
                long e = cVar.e();
                if (e != cVar.f44049b) {
                    cVar.f44049b = e;
                    cVar.c();
                    if (cVar.f44049b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((t5.h) this.f43364b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.f43363a) {
            case 0:
                o4 o4Var = ((c) this.f43364b).f43361l;
                if (o4Var != null) {
                    u6 E = o4Var.f3121a.E();
                    s2 s2Var = new s2(str);
                    s2Var.f3159b = j10;
                    s2Var.f3160c = i10;
                    s2Var.d = j11;
                    s2Var.e = j12;
                    h3 h3Var = new h3(s2Var);
                    h3Var.f3066f = E.h;
                    E.d.add(h3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f43363a) {
            case 1:
                s5.c cVar = (s5.c) this.f43364b;
                ArrayList c3 = u5.a.c(iArr);
                if (!cVar.d.equals(c3)) {
                    cVar.h();
                    cVar.f44051f.evictAll();
                    cVar.f44052g.clear();
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
        switch (this.f43363a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((s5.c) this.f43364b).d.size();
                } else {
                    i11 = ((s5.c) this.f43364b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((s5.c) this.f43364b).d();
                        return;
                    }
                }
                ((s5.c) this.f43364b).h();
                ((s5.c) this.f43364b).d.addAll(i11, u5.a.c(iArr));
                s5.c.b((s5.c) this.f43364b);
                s5.c cVar = (s5.c) this.f43364b;
                synchronized (cVar.f44057m) {
                    Iterator it = cVar.f44057m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((s5.c) this.f43364b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(q5.o[] oVarArr) {
        switch (this.f43363a) {
            case 1:
                HashSet hashSet = new HashSet();
                s5.c cVar = (s5.c) this.f43364b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.f44052g;
                arrayList.clear();
                int i10 = 0;
                for (q5.o oVar : oVarArr) {
                    int i11 = oVar.f42840b;
                    cVar.f44051f.put(Integer.valueOf(i11), oVar);
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
        switch (this.f43363a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((s5.c) this.f43364b).f44051f.remove(Integer.valueOf(i10));
                    int i11 = ((s5.c) this.f43364b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((s5.c) this.f43364b).d();
                        return;
                    }
                    ((s5.c) this.f43364b).e.delete(i10);
                    arrayList.add(Integer.valueOf(i11));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((s5.c) this.f43364b).h();
                    ((s5.c) this.f43364b).d.removeAll(u5.a.c(iArr));
                    s5.c.b((s5.c) this.f43364b);
                    s5.c cVar = (s5.c) this.f43364b;
                    u5.a.e(arrayList);
                    synchronized (cVar.f44057m) {
                        Iterator it = cVar.f44057m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((s5.c) this.f43364b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f43363a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((s5.c) this.f43364b).d.size();
                } else if (arrayList2.isEmpty()) {
                    u5.b bVar = ((s5.c) this.f43364b).f44048a;
                    Log.w(bVar.f45098a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((s5.c) this.f43364b).e.get(i10, -1) == -1) {
                    ((s5.c) this.f43364b).e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((s5.c) this.f43364b).e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((s5.c) this.f43364b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((s5.c) this.f43364b).h();
                s5.c cVar = (s5.c) this.f43364b;
                cVar.d = arrayList;
                s5.c.b(cVar);
                s5.c cVar2 = (s5.c) this.f43364b;
                synchronized (cVar2.f44057m) {
                    Iterator it = cVar2.f44057m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((s5.c) this.f43364b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f43363a) {
            case 1:
                s5.c cVar = (s5.c) this.f43364b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f44051f.remove(Integer.valueOf(i11));
                    int i12 = cVar.e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    i10 = yh.e(i12, i10, 1, arrayList);
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
        switch (this.f43363a) {
            case 1:
                ((s5.c) this.f43364b).d();
                return;
            default:
                return;
        }
    }
}
