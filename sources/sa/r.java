package sa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class r extends pa.u {
    public static final p f47235c = new p(pa.t.f44280a, 1);
    public final pa.g f47236a;
    public final pa.t f47237b;

    public r(pa.g gVar, pa.t tVar) {
        this.f47236a = gVar;
        this.f47237b = tVar;
    }

    public final Serializable a(xa.a aVar, int i10) {
        int c3 = m1.j.c(i10);
        if (c3 != 5) {
            if (c3 != 6) {
                if (c3 != 7) {
                    if (c3 == 8) {
                        aVar.t();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(w.c.m(i10)));
                }
                return Boolean.valueOf(aVar.n());
            }
            return this.f47237b.a(aVar);
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
        int c3 = m1.j.c(x10);
        if (c3 != 0) {
            if (c3 != 2) {
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
                int c10 = m1.j.c(x11);
                if (c10 != 0) {
                    if (c10 != 2) {
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
        pa.g gVar = this.f47236a;
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
