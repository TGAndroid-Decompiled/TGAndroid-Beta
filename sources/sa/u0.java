package sa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import vh.w2;
public class u0 extends pa.u {
    public static pa.i a(xa.a aVar, int i10) {
        int c3 = m1.j.c(i10);
        if (c3 != 5) {
            if (c3 != 6) {
                if (c3 != 7) {
                    if (c3 == 8) {
                        aVar.t();
                        return pa.k.f41110a;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(w2.m(i10)));
                }
                return new pa.m(Boolean.valueOf(aVar.n()));
            }
            return new pa.m(new ra.h(aVar.v()));
        }
        return new pa.m(aVar.v());
    }

    public static void b(pa.i iVar, xa.b bVar) {
        if (iVar != null && !(iVar instanceof pa.k)) {
            boolean z4 = iVar instanceof pa.m;
            if (z4) {
                if (z4) {
                    pa.m mVar = (pa.m) iVar;
                    Serializable serializable = mVar.f41112a;
                    if (serializable instanceof Number) {
                        bVar.q(mVar.r());
                        return;
                    } else if (serializable instanceof Boolean) {
                        bVar.s(mVar.p());
                        return;
                    } else {
                        bVar.r(mVar.n());
                        return;
                    }
                }
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            boolean z10 = iVar instanceof pa.h;
            if (z10) {
                bVar.b();
                if (z10) {
                    ArrayList arrayList = ((pa.h) iVar).f41109a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        b((pa.i) obj, bVar);
                    }
                    bVar.e();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + iVar);
            } else if (iVar instanceof pa.l) {
                bVar.c();
                Iterator it = ((ra.j) iVar.i().f41111a.entrySet()).iterator();
                while (((ra.i) it).hasNext()) {
                    ra.k b10 = ((ra.i) it).b();
                    bVar.g((String) b10.getKey());
                    b((pa.i) b10.getValue(), bVar);
                }
                bVar.f();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
        }
        bVar.i();
    }

    @Override
    public final Object read(xa.a aVar) {
        pa.i hVar;
        String str;
        pa.i hVar2;
        boolean z4;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x10 = lVar.x();
            if (x10 != 5 && x10 != 2 && x10 != 4 && x10 != 10) {
                pa.i iVar = (pa.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + w2.m(x10) + " when reading a JsonElement.");
        }
        int x11 = aVar.x();
        int c3 = m1.j.c(x11);
        if (c3 != 0) {
            if (c3 != 2) {
                hVar = null;
            } else {
                aVar.b();
                hVar = new pa.l();
            }
        } else {
            aVar.a();
            hVar = new pa.h();
        }
        if (hVar == null) {
            return a(aVar, x11);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (hVar instanceof pa.l) {
                    str = aVar.r();
                } else {
                    str = null;
                }
                int x12 = aVar.x();
                int c10 = m1.j.c(x12);
                if (c10 != 0) {
                    if (c10 != 2) {
                        hVar2 = null;
                    } else {
                        aVar.b();
                        hVar2 = new pa.l();
                    }
                } else {
                    aVar.a();
                    hVar2 = new pa.h();
                }
                if (hVar2 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (hVar2 == null) {
                    hVar2 = a(aVar, x12);
                }
                if (hVar instanceof pa.h) {
                    ((pa.h) hVar).f41109a.add(hVar2);
                } else {
                    ((pa.l) hVar).o(str, hVar2);
                }
                if (z4) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof pa.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (pa.i) arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        b((pa.i) obj, bVar);
    }
}
