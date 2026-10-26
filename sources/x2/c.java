package x2;

import a8.yb;
import android.os.SystemClock;
import b2.q1;
import b2.x;
import e2.n0;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.bv;
public abstract class c implements q {
    public final q1 f51307a;
    public final int f51308b;
    public final int[] f51309c;
    public final x[] d;
    public final long[] e;
    public int f51310f;

    public c(q1 q1Var, int[] iArr) {
        boolean z10;
        int i10 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        q1Var.getClass();
        this.f51307a = q1Var;
        int length = iArr.length;
        this.f51308b = length;
        this.d = new x[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = q1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new bv(21));
        this.f51309c = new int[this.f51308b];
        while (true) {
            int i12 = this.f51308b;
            if (i10 < i12) {
                this.f51309c[i10] = q1Var.a(this.d[i10]);
                i10++;
            } else {
                this.e = new long[i12];
                return;
            }
        }
    }

    @Override
    public final boolean a(int i10, long j10) {
        if (this.e[i10] > j10) {
            return true;
        }
        return false;
    }

    @Override
    public final q1 b() {
        return this.f51307a;
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f51307a.equals(cVar.f51307a) && Arrays.equals(this.f51309c, cVar.f51309c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final x f(int i10) {
        return this.d[i10];
    }

    @Override
    public final int h(int i10) {
        return this.f51309c[i10];
    }

    public final int hashCode() {
        if (this.f51310f == 0) {
            this.f51310f = Arrays.hashCode(this.f51309c) + (System.identityHashCode(this.f51307a) * 31);
        }
        return this.f51310f;
    }

    @Override
    public int i(long j10, List list) {
        return list.size();
    }

    @Override
    public final int l() {
        return this.f51309c[c()];
    }

    @Override
    public final int length() {
        return this.f51309c.length;
    }

    @Override
    public final x m() {
        return this.d[c()];
    }

    @Override
    public final boolean o(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a2 = a(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f51308b && !a2; i11++) {
            if (i11 != i10 && !a(i11, elapsedRealtime)) {
                a2 = true;
            } else {
                a2 = false;
            }
        }
        if (!a2) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i10] = Math.max(jArr[i10], n0.a(elapsedRealtime, j10));
        return true;
    }

    @Override
    public final int s(x xVar) {
        for (int i10 = 0; i10 < this.f51308b; i10++) {
            if (this.d[i10] == xVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f51308b; i11++) {
            if (this.f51309c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override
    public void g() {
    }

    @Override
    public void j() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public void p(float f7) {
    }
}
