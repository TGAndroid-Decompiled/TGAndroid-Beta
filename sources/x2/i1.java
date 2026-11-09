package x2;

import a8.ia;
import android.net.Uri;
import h9.t1;
import java.util.Collections;
import java.util.List;
public final class i1 extends e2.l1 {
    public static final Object f58360q = new Object();
    public final long f58361e;
    public final long f58362f;
    public final long f58363g;
    public final long h;
    public final long f58364i;
    public final long f58365j;
    public final boolean f58366k;
    public final boolean f58367l;
    public final boolean f58368m;
    public final Object f58369n;
    public final e2.l0 f58370o;
    public final e2.f0 f58371p;

    static {
        boolean z9;
        e2.d0 d0Var;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        t1 t1Var = t1.f14397e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10195b != null && c0Var.f10194a == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        if (uri != null) {
            if (c0Var.f10194a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            new e2.g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        }
        new e2.a0(zVar);
        new e2.f0(e0Var);
        e2.o0 o0Var = e2.o0.L;
    }

    public i1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z9, boolean z10, boolean z11, qb.a aVar, e2.l0 l0Var, e2.f0 f0Var) {
        this.f58361e = j3;
        this.f58362f = j10;
        this.f58363g = j11;
        this.h = j12;
        this.f58364i = j13;
        this.f58365j = j14;
        this.f58366k = z9;
        this.f58367l = z10;
        this.f58368m = z11;
        this.f58369n = aVar;
        l0Var.getClass();
        this.f58370o = l0Var;
        this.f58371p = f0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f58360q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        Object obj;
        ia.j(i7, 1);
        if (z9) {
            obj = f58360q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        i1Var.getClass();
        e2.c cVar = e2.c.f10190c;
        i1Var.h(null, obj2, 0, this.f58363g, -this.f58364i, cVar, false);
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        ia.j(i7, 1);
        return f58360q;
    }

    @Override
    public final e2.k1 m(int r25, e2.k1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: x2.i1.m(int, e2.k1, long):e2.k1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
