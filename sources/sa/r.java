package sa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import vh.v2;
public final class r extends pa.u {
    public static final p f44216c = new p(pa.t.f41090a, 1);
    public final pa.g f44217a;
    public final pa.t f44218b;

    public r(pa.g gVar, pa.t tVar) {
        this.f44217a = gVar;
        this.f44218b = tVar;
    }

    public final Serializable a(xa.a aVar, int i10) {
        int b10 = m1.j.b(i10);
        if (b10 != 5) {
            if (b10 != 6) {
                if (b10 != 7) {
                    if (b10 == 8) {
                        aVar.t();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(v2.m(i10)));
                }
                return Boolean.valueOf(aVar.n());
            }
            return this.f44218b.a(aVar);
        }
        return aVar.v();
    }

    @Override
    public final Object read(xa.a aVar) {
        Object arrayList;
        String str;
        Serializable arrayList2;
        boolean z4;
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 != 0) {
            if (b10 != 2) {
                arrayList = null;
            } else {
                aVar.b();
                arrayList = new ra.l(true);
            }
        } else {
            aVar.a();
            arrayList = new ArrayList();
        }
        if (arrayList == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (arrayList instanceof Map) {
                    str = aVar.r();
                } else {
                    str = null;
                }
                int x11 = aVar.x();
                int b11 = m1.j.b(x11);
                if (b11 != 0) {
                    if (b11 != 2) {
                        arrayList2 = null;
                    } else {
                        aVar.b();
                        arrayList2 = new ra.l(true);
                    }
                } else {
                    aVar.a();
                    arrayList2 = new ArrayList();
                }
                if (arrayList2 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, x11);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(str, arrayList2);
                }
                if (z4) {
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
    public final void write(xa.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        pa.g gVar = this.f44217a;
        gVar.getClass();
        pa.u b10 = gVar.b(new wa.a(cls));
        if (b10 instanceof r) {
            bVar.c();
            bVar.f();
            return;
        }
        b10.write(bVar, obj);
    }
}
