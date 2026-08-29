package p5;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.i3;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.t2;
import com.google.android.gms.internal.cast.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.th;
public final class c0 extends q5.g {
    public final int f45632a;
    public final Object f45633b;

    public c0(Object obj, int i10) {
        this.f45632a = i10;
        this.f45633b = obj;
    }

    @Override
    public void a() {
        switch (this.f45632a) {
            case 2:
                ((r5.h) this.f45633b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f45632a) {
            case 2:
                ((r5.h) this.f45633b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f45632a) {
            case 2:
                ((r5.h) this.f45633b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f45632a) {
            case 2:
                ((r5.h) this.f45633b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f45632a) {
            case 1:
                q5.c cVar = (q5.c) this.f45633b;
                long e10 = cVar.e();
                if (e10 != cVar.f46366b) {
                    cVar.f46366b = e10;
                    cVar.c();
                    if (cVar.f46366b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((r5.h) this.f45633b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.f45632a) {
            case 0:
                o4 o4Var = ((c) this.f45633b).f45631l;
                if (o4Var != null) {
                    v6 A = o4Var.f4220a.A();
                    t2 t2Var = new t2(str);
                    t2Var.f4277b = j10;
                    t2Var.f4278c = i10;
                    t2Var.d = j11;
                    t2Var.f4279e = j12;
                    i3 i3Var = new i3(t2Var);
                    i3Var.f4170f = A.h;
                    A.d.add(i3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f45632a) {
            case 1:
                q5.c cVar = (q5.c) this.f45633b;
                ArrayList c3 = s5.a.c(iArr);
                if (!cVar.d.equals(c3)) {
                    cVar.h();
                    cVar.f46369f.evictAll();
                    cVar.f46370g.clear();
                    cVar.d = c3;
                    q5.c.b(cVar);
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
        switch (this.f45632a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((q5.c) this.f45633b).d.size();
                } else {
                    i11 = ((q5.c) this.f45633b).f46368e.get(i10, -1);
                    if (i11 == -1) {
                        ((q5.c) this.f45633b).d();
                        return;
                    }
                }
                ((q5.c) this.f45633b).h();
                ((q5.c) this.f45633b).d.addAll(i11, s5.a.c(iArr));
                q5.c.b((q5.c) this.f45633b);
                q5.c cVar = (q5.c) this.f45633b;
                synchronized (cVar.f46375m) {
                    Iterator it = cVar.f46375m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((q5.c) this.f45633b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(o5.o[] oVarArr) {
        switch (this.f45632a) {
            case 1:
                HashSet hashSet = new HashSet();
                q5.c cVar = (q5.c) this.f45633b;
                SparseIntArray sparseIntArray = cVar.f46368e;
                ArrayList arrayList = cVar.f46370g;
                arrayList.clear();
                int i10 = 0;
                for (o5.o oVar : oVarArr) {
                    int i11 = oVar.f19305b;
                    cVar.f46369f.put(Integer.valueOf(i11), oVar);
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
                s5.a.e(arrayList2);
                q5.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(int[] iArr) {
        switch (this.f45632a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((q5.c) this.f45633b).f46369f.remove(Integer.valueOf(i10));
                    int i11 = ((q5.c) this.f45633b).f46368e.get(i10, -1);
                    if (i11 == -1) {
                        ((q5.c) this.f45633b).d();
                        return;
                    }
                    ((q5.c) this.f45633b).f46368e.delete(i10);
                    arrayList.add(Integer.valueOf(i11));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((q5.c) this.f45633b).h();
                    ((q5.c) this.f45633b).d.removeAll(s5.a.c(iArr));
                    q5.c.b((q5.c) this.f45633b);
                    q5.c cVar = (q5.c) this.f45633b;
                    s5.a.e(arrayList);
                    synchronized (cVar.f46375m) {
                        Iterator it = cVar.f46375m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((q5.c) this.f45633b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f45632a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((q5.c) this.f45633b).d.size();
                } else if (arrayList2.isEmpty()) {
                    s5.b bVar = ((q5.c) this.f45633b).f46365a;
                    Log.w(bVar.f47580a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((q5.c) this.f45633b).f46368e.get(i10, -1) == -1) {
                    ((q5.c) this.f45633b).f46368e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((q5.c) this.f45633b).f46368e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((q5.c) this.f45633b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((q5.c) this.f45633b).h();
                q5.c cVar = (q5.c) this.f45633b;
                cVar.d = arrayList;
                q5.c.b(cVar);
                q5.c cVar2 = (q5.c) this.f45633b;
                synchronized (cVar2.f46375m) {
                    Iterator it = cVar2.f46375m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((q5.c) this.f45633b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f45632a) {
            case 1:
                q5.c cVar = (q5.c) this.f45633b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f46369f.remove(Integer.valueOf(i11));
                    int i12 = cVar.f46368e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    i10 = th.d(i12, i10, 1, arrayList);
                }
                Collections.sort(arrayList);
                cVar.h();
                s5.a.e(arrayList);
                q5.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void o() {
        switch (this.f45632a) {
            case 1:
                ((q5.c) this.f45633b).d();
                return;
            default:
                return;
        }
    }
}
