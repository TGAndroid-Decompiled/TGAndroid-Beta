package pa;

import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.telegram.tgnet.TLObject;
import q5.g0;
import sa.c0;
import sa.h1;
import sa.x;
import sa.x0;
import sa.y0;
public final class g {
    public static final c h = c.d;
    public static final p f41079i = t.f41090a;
    public static final q f41080j = t.f41091b;
    public final ThreadLocal f41081a = new ThreadLocal();
    public final ConcurrentHashMap f41082b = new ConcurrentHashMap();
    public final g0 f41083c;
    public final sa.j d;
    public final List e;
    public final boolean f41084f;
    public final c f41085g;

    public g(ra.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        sa.p pVar;
        sa.p pVar2;
        g0 g0Var = new g0(6, hashMap, arrayList4);
        this.f41083c = g0Var;
        this.f41084f = true;
        this.f41085g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f41090a) {
            pVar = sa.r.f44216c;
        } else {
            pVar = new sa.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f44196p);
        arrayList5.add(h1.f44188g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.e);
        arrayList5.add(h1.f44187f);
        c0 c0Var = h1.f44191k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f41091b) {
            pVar2 = sa.q.f44214b;
        } else {
            pVar2 = new sa.p(new sa.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f44189i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f44190j);
        arrayList5.add(h1.f44192l);
        arrayList5.add(h1.f44197q);
        arrayList5.add(h1.f44198r);
        arrayList5.add(new x0(BigDecimal.class, h1.f44193m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f44194n, 0));
        arrayList5.add(new x0(ra.h.class, h1.f44195o, 0));
        arrayList5.add(h1.f44199s);
        arrayList5.add(h1.f44200t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f44202w);
        arrayList5.add(h1.f44204y);
        arrayList5.add(h1.f44201u);
        arrayList5.add(h1.f44185b);
        arrayList5.add(sa.h.f44181c);
        arrayList5.add(h1.f44203x);
        if (va.f.f45643a) {
            arrayList5.add(va.f.f45645c);
            arrayList5.add(va.f.f45644b);
            arrayList5.add(va.f.d);
        }
        arrayList5.add(sa.b.f44171c);
        arrayList5.add(h1.f44184a);
        arrayList5.add(new sa.d(0, g0Var));
        arrayList5.add(new sa.d(1, g0Var));
        sa.j jVar = new sa.j(g0Var);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(g0Var, fVar, jVar, arrayList4));
        this.e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final u b(wa.a aVar) {
        boolean z4;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f41082b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f41081a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z4 = true;
        } else {
            u uVar2 = (u) map.get(aVar);
            if (uVar2 != null) {
                return uVar2;
            }
            z4 = false;
        }
        try {
            f fVar = new f();
            map.put(aVar, fVar);
            Iterator it = this.e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).create(this, aVar);
                if (uVar3 != null) {
                    if (fVar.f41078a == null) {
                        fVar.f41078a = uVar3;
                        map.put(aVar, uVar3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z4) {
                threadLocal.remove();
            }
            if (uVar3 != null) {
                if (z4) {
                    concurrentHashMap.putAll(map);
                }
                return uVar3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z4) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    public final pa.u c(pa.v r7, wa.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: pa.g.c(pa.v, wa.a):pa.u");
    }

    public final xa.b d(Writer writer) {
        xa.b bVar = new xa.b(writer);
        bVar.k(this.f41085g);
        bVar.f46884r = this.f41084f;
        bVar.l(2);
        bVar.v = false;
        return bVar;
    }

    public final String e(TLObject tLObject) {
        if (tLObject == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final void f(Object obj, Class cls, xa.b bVar) {
        u b10 = b(new wa.a(cls));
        int i10 = bVar.f46883n;
        if (i10 == 2) {
            bVar.f46883n = 1;
        }
        boolean z4 = bVar.f46884r;
        boolean z10 = bVar.v;
        bVar.f46884r = this.f41084f;
        bVar.v = false;
        try {
            try {
                b10.write(bVar, obj);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e6.getMessage(), e6);
            }
        } finally {
            bVar.l(i10);
            bVar.f46884r = z4;
            bVar.v = z10;
        }
    }

    public final void g(xa.b bVar) {
        k kVar = k.f41087a;
        int i10 = bVar.f46883n;
        boolean z4 = bVar.f46884r;
        boolean z10 = bVar.v;
        bVar.f46884r = this.f41084f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f46883n = 1;
        }
        try {
            try {
                try {
                    ra.d.l(kVar, bVar);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e6.getMessage(), e6);
            }
        } finally {
            bVar.l(i10);
            bVar.f46884r = z4;
            bVar.v = z10;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.f41083c + "}";
    }
}
