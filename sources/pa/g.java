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
    public static final p f44237i = t.f44249a;
    public static final q f44238j = t.f44250b;
    public final ThreadLocal f44239a = new ThreadLocal();
    public final ConcurrentHashMap f44240b = new ConcurrentHashMap();
    public final g0 f44241c;
    public final sa.j d;
    public final List f44242e;
    public final boolean f44243f;
    public final c f44244g;

    public g(ra.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        sa.p pVar;
        sa.p pVar2;
        g0 g0Var = new g0(6, hashMap, arrayList4);
        this.f44241c = g0Var;
        this.f44243f = true;
        this.f44244g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f44249a) {
            pVar = sa.r.f47204c;
        } else {
            pVar = new sa.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f47184p);
        arrayList5.add(h1.f47176g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.f47174e);
        arrayList5.add(h1.f47175f);
        c0 c0Var = h1.f47179k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f44250b) {
            pVar2 = sa.q.f47202b;
        } else {
            pVar2 = new sa.p(new sa.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f47177i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f47178j);
        arrayList5.add(h1.f47180l);
        arrayList5.add(h1.f47185q);
        arrayList5.add(h1.f47186r);
        arrayList5.add(new x0(BigDecimal.class, h1.f47181m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f47182n, 0));
        arrayList5.add(new x0(ra.h.class, h1.f47183o, 0));
        arrayList5.add(h1.f47187s);
        arrayList5.add(h1.f47188t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f47190w);
        arrayList5.add(h1.f47192y);
        arrayList5.add(h1.f47189u);
        arrayList5.add(h1.f47172b);
        arrayList5.add(sa.h.f47168c);
        arrayList5.add(h1.f47191x);
        if (va.f.f48940a) {
            arrayList5.add(va.f.f48942c);
            arrayList5.add(va.f.f48941b);
            arrayList5.add(va.f.d);
        }
        arrayList5.add(sa.b.f47158c);
        arrayList5.add(h1.f47171a);
        arrayList5.add(new sa.d(0, g0Var));
        arrayList5.add(new sa.d(1, g0Var));
        sa.j jVar = new sa.j(g0Var);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(g0Var, fVar, jVar, arrayList4));
        this.f44242e = DesugarCollections.unmodifiableList(arrayList5);
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
        ConcurrentHashMap concurrentHashMap = this.f44240b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f44239a;
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
            Iterator it = this.f44242e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).create(this, aVar);
                if (uVar3 != null) {
                    if (fVar.f44236a == null) {
                        fVar.f44236a = uVar3;
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
        bVar.k(this.f44244g);
        bVar.f50494r = this.f44243f;
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
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void f(Object obj, Class cls, xa.b bVar) {
        u b10 = b(new wa.a(cls));
        int i10 = bVar.f50493n;
        if (i10 == 2) {
            bVar.f50493n = 1;
        }
        boolean z4 = bVar.f50494r;
        boolean z10 = bVar.v;
        bVar.f50494r = this.f44243f;
        bVar.v = false;
        try {
            try {
                b10.write(bVar, obj);
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.l(i10);
            bVar.f50494r = z4;
            bVar.v = z10;
        }
    }

    public final void g(xa.b bVar) {
        k kVar = k.f44246a;
        int i10 = bVar.f50493n;
        boolean z4 = bVar.f50494r;
        boolean z10 = bVar.v;
        bVar.f50494r = this.f44243f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f50493n = 1;
        }
        try {
            try {
                try {
                    ra.d.l(kVar, bVar);
                } catch (IOException e6) {
                    throw new RuntimeException(e6);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.l(i10);
            bVar.f50494r = z4;
            bVar.v = z10;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f44242e + ",instanceCreators:" + this.f44241c + "}";
    }
}
