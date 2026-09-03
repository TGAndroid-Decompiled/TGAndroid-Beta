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
import q5.c0;
import sa.h1;
import sa.x;
import sa.x0;
import sa.y0;
public final class g {
    public static final c h = c.d;
    public static final p f41102i = t.f41113a;
    public static final q f41103j = t.f41114b;
    public final ThreadLocal f41104a = new ThreadLocal();
    public final ConcurrentHashMap f41105b = new ConcurrentHashMap();
    public final c0 f41106c;
    public final sa.j d;
    public final List e;
    public final boolean f41107f;
    public final c f41108g;

    public g(ra.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        sa.p pVar;
        sa.p pVar2;
        c0 c0Var = new c0(7, hashMap, arrayList4);
        this.f41106c = c0Var;
        this.f41107f = true;
        this.f41108g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f41113a) {
            pVar = sa.r.f44281c;
        } else {
            pVar = new sa.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f44261p);
        arrayList5.add(h1.f44253g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.e);
        arrayList5.add(h1.f44252f);
        sa.c0 c0Var2 = h1.f44256k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var2));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f41114b) {
            pVar2 = sa.q.f44279b;
        } else {
            pVar2 = new sa.p(new sa.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f44254i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var2, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var2, 1).nullSafe(), 0));
        arrayList5.add(h1.f44255j);
        arrayList5.add(h1.f44257l);
        arrayList5.add(h1.f44262q);
        arrayList5.add(h1.f44263r);
        arrayList5.add(new x0(BigDecimal.class, h1.f44258m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f44259n, 0));
        arrayList5.add(new x0(ra.h.class, h1.f44260o, 0));
        arrayList5.add(h1.f44264s);
        arrayList5.add(h1.f44265t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f44267w);
        arrayList5.add(h1.f44269y);
        arrayList5.add(h1.f44266u);
        arrayList5.add(h1.f44250b);
        arrayList5.add(sa.h.f44246c);
        arrayList5.add(h1.f44268x);
        if (va.f.f45707a) {
            arrayList5.add(va.f.f45709c);
            arrayList5.add(va.f.f45708b);
            arrayList5.add(va.f.d);
        }
        arrayList5.add(sa.b.f44236c);
        arrayList5.add(h1.f44249a);
        arrayList5.add(new sa.d(0, c0Var));
        arrayList5.add(new sa.d(1, c0Var));
        sa.j jVar = new sa.j(c0Var);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(c0Var, fVar, jVar, arrayList4));
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
        ConcurrentHashMap concurrentHashMap = this.f41105b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f41104a;
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
                    if (fVar.f41101a == null) {
                        fVar.f41101a = uVar3;
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
        bVar.k(this.f41108g);
        bVar.f46952r = this.f41107f;
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
        int i10 = bVar.f46951n;
        if (i10 == 2) {
            bVar.f46951n = 1;
        }
        boolean z4 = bVar.f46952r;
        boolean z10 = bVar.v;
        bVar.f46952r = this.f41107f;
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
            bVar.f46952r = z4;
            bVar.v = z10;
        }
    }

    public final void g(xa.b bVar) {
        k kVar = k.f41110a;
        int i10 = bVar.f46951n;
        boolean z4 = bVar.f46952r;
        boolean z10 = bVar.v;
        bVar.f46952r = this.f41107f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f46951n = 1;
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
            bVar.f46952r = z4;
            bVar.v = z10;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.f41106c + "}";
    }
}
