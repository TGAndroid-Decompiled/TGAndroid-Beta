package z2;

import android.os.SystemClock;
import b8.zb;
import d2.o1;
import d2.v;
import g2.n0;
import java.util.Arrays;
import java.util.List;
import vg.i1;
public abstract class c implements p {
    public final o1 f59587a;
    public final int f59588b;
    public final int[] f59589c;
    public final v[] d;
    public final long[] f59590e;
    public int f59591f;

    public c(o1 o1Var, int[] iArr) {
        boolean z10;
        int i3 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        o1Var.getClass();
        this.f59587a = o1Var;
        int length = iArr.length;
        this.f59588b = length;
        this.d = new v[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.d[i10] = o1Var.d[iArr[i10]];
        }
        Arrays.sort(this.d, new i1(2));
        this.f59589c = new int[this.f59588b];
        while (true) {
            int i11 = this.f59588b;
            if (i3 < i11) {
                this.f59589c[i3] = o1Var.a(this.d[i3]);
                i3++;
            } else {
                this.f59590e = new long[i11];
                return;
            }
        }
    }

    @Override
    public final boolean a(int i3, long j10) {
        if (this.f59590e[i3] > j10) {
            return true;
        }
        return false;
    }

    @Override
    public final o1 b() {
        return this.f59587a;
    }

    @Override
    public final int e(v vVar) {
        for (int i3 = 0; i3 < this.f59588b; i3++) {
            if (this.d[i3] == vVar) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f59587a.equals(cVar.f59587a) && Arrays.equals(this.f59589c, cVar.f59589c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final v g(int i3) {
        return this.d[i3];
    }

    public final int hashCode() {
        if (this.f59591f == 0) {
            this.f59591f = Arrays.hashCode(this.f59589c) + (System.identityHashCode(this.f59587a) * 31);
        }
        return this.f59591f;
    }

    @Override
    public final int i(int i3) {
        return this.f59589c[i3];
    }

    @Override
    public int j(long j10, List list) {
        return list.size();
    }

    @Override
    public final int l() {
        return this.f59589c[c()];
    }

    @Override
    public final int length() {
        return this.f59589c.length;
    }

    @Override
    public final boolean m(long j10, x2.f fVar, List list) {
        return false;
    }

    @Override
    public final v n() {
        return this.d[c()];
    }

    @Override
    public final boolean p(int i3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a10 = a(i3, elapsedRealtime);
        for (int i10 = 0; i10 < this.f59588b && !a10; i10++) {
            if (i10 != i3 && !a(i10, elapsedRealtime)) {
                a10 = true;
            } else {
                a10 = false;
            }
        }
        if (!a10) {
            return false;
        }
        long[] jArr = this.f59590e;
        jArr[i3] = Math.max(jArr[i3], n0.a(elapsedRealtime, j10));
        return true;
    }

    @Override
    public final int u(int i3) {
        for (int i10 = 0; i10 < this.f59588b; i10++) {
            if (this.f59589c[i10] == i3) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public void h() {
    }

    @Override
    public void k() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void f(boolean z10) {
    }

    @Override
    public void q(float f10) {
    }
}
