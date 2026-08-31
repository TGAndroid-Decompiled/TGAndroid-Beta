package r4;

import h5.d0;
import j3.c1;
import j3.m2;
import j3.n2;
import j3.o2;
import j3.x0;
import java.util.List;
public final class e extends o2 {
    public final long f46617b;
    public final long f46618c;
    public final long d;
    public final int f46619e;
    public final long f46620f;
    public final long h;
    public final long f46621n;
    public final s4.c f46622r;
    public final c1 f46623s;
    public final x0 v;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, s4.c cVar, c1 c1Var, x0 x0Var) {
        boolean z4;
        boolean z10 = cVar.d;
        if (x0Var != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z10 == z4);
        this.f46617b = j10;
        this.f46618c = j11;
        this.d = j12;
        this.f46619e = i10;
        this.f46620f = j13;
        this.h = j14;
        this.f46621n = j15;
        this.f46622r = cVar;
        this.f46623s = c1Var;
        this.v = x0Var;
    }

    @Override
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f46619e) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override
    public final m2 f(int i10, m2 m2Var, boolean z4) {
        String str;
        h5.a.h(i10, h());
        Integer num = null;
        s4.c cVar = this.f46622r;
        if (z4) {
            str = cVar.b(i10).f46975a;
        } else {
            str = null;
        }
        if (z4) {
            num = Integer.valueOf(this.f46619e + i10);
        }
        m2Var.getClass();
        m2Var.i(str, num, 0, cVar.d(i10), d0.G(cVar.b(i10).f46976b - cVar.b(0).f46976b) - this.f46620f, p4.b.f44198f, false);
        return m2Var;
    }

    @Override
    public final int h() {
        return this.f46622r.f46958m.size();
    }

    @Override
    public final Object l(int i10) {
        h5.a.h(i10, h());
        return Integer.valueOf(this.f46619e + i10);
    }

    @Override
    public final n2 m(int i10, n2 n2Var, long j10) {
        long j11;
        boolean z4;
        long j12;
        h c3;
        h5.a.h(i10, 1);
        s4.c cVar = this.f46622r;
        boolean z10 = cVar.d;
        long j13 = this.f46621n;
        if (z10 && cVar.f46951e != -9223372036854775807L && cVar.f46949b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.h) {
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    Object obj = n2.E;
                    if (!cVar.d && cVar.f46951e != j11 && cVar.f46949b == j11) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    n2Var.b(obj, this.f46623s, cVar, this.f46617b, this.f46618c, this.d, true, z4, this.v, j13, this.h, 0, h() - 1, this.f46620f);
                    return n2Var;
                }
            }
            long j15 = this.f46620f + j13;
            long d = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f46958m.size() - 1 && j15 >= d) {
                j15 -= d;
                i11++;
                d = cVar.d(i11);
            }
            s4.h b10 = cVar.b(i11);
            List list = b10.f46977c;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    j12 = j14;
                    if (((s4.a) list.get(i12)).f46941b == 2) {
                        break;
                    }
                    i12++;
                    j14 = j12;
                } else {
                    j12 = j14;
                    i12 = -1;
                    break;
                }
            }
            if (i12 != -1 && (c3 = ((s4.m) ((s4.a) b10.f46977c.get(i12)).f46942c.get(0)).c()) != null && c3.F(d) != j12) {
                j13 = (c3.a(c3.t(j15, d)) + j13) - j15;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        Object obj2 = n2.E;
        if (!cVar.d) {
        }
        z4 = false;
        n2Var.b(obj2, this.f46623s, cVar, this.f46617b, this.f46618c, this.d, true, z4, this.v, j13, this.h, 0, h() - 1, this.f46620f);
        return n2Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
