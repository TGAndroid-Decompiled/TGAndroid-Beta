package pa;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class r extends ma.u {

    public static final p f45657c = new p(ma.t.f17913a, 1);

    public final ma.g f45658a;

    public final ma.t f45659b;

    public r(ma.g gVar, ma.t tVar) {
        this.f45658a = gVar;
        this.f45659b = tVar;
    }

    public final Serializable a(ua.a aVar, int i10) {
        int iB = m1.j.b(i10);
        if (iB == 5) {
            return aVar.v();
        }
        if (iB == 6) {
            return this.f45659b.a(aVar);
        }
        if (iB == 7) {
            return Boolean.valueOf(aVar.n());
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(s3.c.n(i10)));
        }
        aVar.t();
        return null;
    }

    @Override
    public final Object read(ua.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int iX = aVar.x();
        int iB = m1.j.b(iX);
        if (iB == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (iB != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new oa.l(true);
        }
        if (arrayList == null) {
            return a(aVar, iX);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String strR = arrayList instanceof Map ? aVar.r() : null;
                int iX2 = aVar.x();
                int iB2 = m1.j.b(iX2);
                if (iB2 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (iB2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new oa.l(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, iX2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strR, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        ma.g gVar = this.f45658a;
        gVar.getClass();
        ma.u uVarB = gVar.b(new ta.a(cls));
        if (!(uVarB instanceof r)) {
            uVarB.write(bVar, obj);
        } else {
            bVar.c();
            bVar.f();
        }
    }
}
