package qa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
public class u0 extends na.u {
    public static na.i a(va.a aVar, int i10) {
        int b10 = m1.j.b(i10);
        if (b10 != 5) {
            if (b10 != 6) {
                if (b10 != 7) {
                    if (b10 == 8) {
                        aVar.t();
                        return na.k.f17193a;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(u3.c.m(i10)));
                }
                return new na.m(Boolean.valueOf(aVar.n()));
            }
            return new na.m(new pa.h(aVar.v()));
        }
        return new na.m(aVar.v());
    }

    public static void b(na.i iVar, va.b bVar) {
        if (iVar != null && !(iVar instanceof na.k)) {
            boolean z10 = iVar instanceof na.m;
            if (z10) {
                if (z10) {
                    na.m mVar = (na.m) iVar;
                    Serializable serializable = mVar.f17195a;
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
            boolean z11 = iVar instanceof na.h;
            if (z11) {
                bVar.b();
                if (z11) {
                    ArrayList arrayList = ((na.h) iVar).f17192a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        b((na.i) obj, bVar);
                    }
                    bVar.e();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + iVar);
            } else if (iVar instanceof na.l) {
                bVar.c();
                Iterator it = ((pa.j) iVar.i().f17194a.entrySet()).iterator();
                while (((pa.i) it).hasNext()) {
                    pa.k b10 = ((pa.i) it).b();
                    bVar.g((String) b10.getKey());
                    b((na.i) b10.getValue(), bVar);
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
    public final Object read(va.a aVar) {
        na.i hVar;
        String str;
        na.i hVar2;
        boolean z10;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x4 = lVar.x();
            if (x4 != 5 && x4 != 2 && x4 != 4 && x4 != 10) {
                na.i iVar = (na.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + u3.c.m(x4) + " when reading a JsonElement.");
        }
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 != 0) {
            if (b10 != 2) {
                hVar = null;
            } else {
                aVar.b();
                hVar = new na.l();
            }
        } else {
            aVar.a();
            hVar = new na.h();
        }
        if (hVar == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (hVar instanceof na.l) {
                    str = aVar.r();
                } else {
                    str = null;
                }
                int x11 = aVar.x();
                int b11 = m1.j.b(x11);
                if (b11 != 0) {
                    if (b11 != 2) {
                        hVar2 = null;
                    } else {
                        aVar.b();
                        hVar2 = new na.l();
                    }
                } else {
                    aVar.a();
                    hVar2 = new na.h();
                }
                if (hVar2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hVar2 == null) {
                    hVar2 = a(aVar, x11);
                }
                if (hVar instanceof na.h) {
                    ((na.h) hVar).f17192a.add(hVar2);
                } else {
                    ((na.l) hVar).o(str, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof na.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (na.i) arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        b((na.i) obj, bVar);
    }
}
