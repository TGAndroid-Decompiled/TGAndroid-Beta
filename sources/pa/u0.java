package pa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class u0 extends ma.u {
    public static ma.i a(ua.a aVar, int i10) {
        int iB = m1.j.b(i10);
        if (iB == 5) {
            return new ma.m(aVar.v());
        }
        if (iB == 6) {
            return new ma.m(new oa.h(aVar.v()));
        }
        if (iB == 7) {
            return new ma.m(Boolean.valueOf(aVar.n()));
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(s3.c.n(i10)));
        }
        aVar.t();
        return ma.k.f17910a;
    }

    public static void b(ma.i iVar, ua.b bVar) {
        if (iVar == null || (iVar instanceof ma.k)) {
            bVar.i();
            return;
        }
        boolean z10 = iVar instanceof ma.m;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            ma.m mVar = (ma.m) iVar;
            Serializable serializable = mVar.f17912a;
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
        boolean z11 = iVar instanceof ma.h;
        if (!z11) {
            if (!(iVar instanceof ma.l)) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            bVar.c();
            Iterator it = ((oa.j) iVar.i().f17911a.entrySet()).iterator();
            while (((oa.i) it).hasNext()) {
                oa.k kVarB = ((oa.i) it).b();
                bVar.g((String) kVarB.getKey());
                b((ma.i) kVarB.getValue(), bVar);
            }
            bVar.f();
            return;
        }
        bVar.b();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Array: " + iVar);
        }
        ArrayList arrayList = ((ma.h) iVar).f17909a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b((ma.i) obj, bVar);
        }
        bVar.e();
    }

    @Override
    public final Object read(ua.a aVar) {
        ma.i hVar;
        ma.i hVar2;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int iX = lVar.x();
            if (iX != 5 && iX != 2 && iX != 4 && iX != 10) {
                ma.i iVar = (ma.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + s3.c.n(iX) + " when reading a JsonElement.");
        }
        int iX2 = aVar.x();
        int iB = m1.j.b(iX2);
        if (iB == 0) {
            aVar.a();
            hVar = new ma.h();
        } else if (iB != 2) {
            hVar = null;
        } else {
            aVar.b();
            hVar = new ma.l();
        }
        if (hVar == null) {
            return a(aVar, iX2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String strR = hVar instanceof ma.l ? aVar.r() : null;
                int iX3 = aVar.x();
                int iB2 = m1.j.b(iX3);
                if (iB2 == 0) {
                    aVar.a();
                    hVar2 = new ma.h();
                } else if (iB2 != 2) {
                    hVar2 = null;
                } else {
                    aVar.b();
                    hVar2 = new ma.l();
                }
                boolean z10 = hVar2 != null;
                if (hVar2 == null) {
                    hVar2 = a(aVar, iX3);
                }
                if (hVar instanceof ma.h) {
                    ((ma.h) hVar).f17909a.add(hVar2);
                } else {
                    ((ma.l) hVar).o(strR, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof ma.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (ma.i) arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        b((ma.i) obj, bVar);
    }
}
