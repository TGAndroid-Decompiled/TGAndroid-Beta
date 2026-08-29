package qa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class r extends na.u {
    public static final p f46564c = new p(na.t.f17196a, 1);
    public final na.g f46565a;
    public final na.t f46566b;

    public r(na.g gVar, na.t tVar) {
        this.f46565a = gVar;
        this.f46566b = tVar;
    }

    public final Serializable a(va.a aVar, int i10) {
        int b10 = m1.j.b(i10);
        if (b10 != 5) {
            if (b10 != 6) {
                if (b10 != 7) {
                    if (b10 == 8) {
                        aVar.t();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(u3.c.m(i10)));
                }
                return Boolean.valueOf(aVar.n());
            }
            return this.f46566b.a(aVar);
        }
        return aVar.v();
    }

    @Override
    public final Object read(va.a aVar) {
        Object arrayList;
        String str;
        Serializable arrayList2;
        boolean z10;
        int x4 = aVar.x();
        int b10 = m1.j.b(x4);
        if (b10 != 0) {
            if (b10 != 2) {
                arrayList = null;
            } else {
                aVar.b();
                arrayList = new pa.l(true);
            }
        } else {
            aVar.a();
            arrayList = new ArrayList();
        }
        if (arrayList == null) {
            return a(aVar, x4);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (arrayList instanceof Map) {
                    str = aVar.r();
                } else {
                    str = null;
                }
                int x10 = aVar.x();
                int b11 = m1.j.b(x10);
                if (b11 != 0) {
                    if (b11 != 2) {
                        arrayList2 = null;
                    } else {
                        aVar.b();
                        arrayList2 = new pa.l(true);
                    }
                } else {
                    aVar.a();
                    arrayList2 = new ArrayList();
                }
                if (arrayList2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, x10);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(str, arrayList2);
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
    public final void write(va.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        na.g gVar = this.f46565a;
        gVar.getClass();
        na.u b10 = gVar.b(new ua.a(cls));
        if (b10 instanceof r) {
            bVar.c();
            bVar.f();
            return;
        }
        b10.write(bVar, obj);
    }
}
