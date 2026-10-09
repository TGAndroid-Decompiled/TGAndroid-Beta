package x2;

import android.os.SystemClock;
import b2.l1;
import e2.d0;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.mb1;
public abstract class c implements r {
    public final l1 f50474a;
    public final int f50475b;
    public final int[] f50476c;
    public final b2.s[] d;
    public final long[] f50477e;
    public int f50478f;

    public c(l1 l1Var, int[] iArr) {
        boolean z10;
        int i10 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        l1Var.getClass();
        this.f50474a = l1Var;
        int length = iArr.length;
        this.f50475b = length;
        this.d = new b2.s[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = l1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new mb1(12));
        this.f50476c = new int[this.f50475b];
        while (true) {
            int i12 = this.f50475b;
            if (i10 < i12) {
                this.f50476c[i10] = l1Var.a(this.d[i10]);
                i10++;
            } else {
                this.f50477e = new long[i12];
                return;
            }
        }
    }

    @Override
    public final boolean a(int i10, long j3) {
        if (this.f50477e[i10] > j3) {
            return true;
        }
        return false;
    }

    @Override
    public final l1 b() {
        return this.f50474a;
    }

    @Override
    public final boolean d(long j3, v2.e eVar, List list) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f50474a.equals(cVar.f50474a) && Arrays.equals(this.f50476c, cVar.f50476c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final b2.s f(int i10) {
        return this.d[i10];
    }

    @Override
    public final int h(int i10) {
        return this.f50476c[i10];
    }

    public final int hashCode() {
        if (this.f50478f == 0) {
            this.f50478f = Arrays.hashCode(this.f50476c) + (System.identityHashCode(this.f50474a) * 31);
        }
        return this.f50478f;
    }

    @Override
    public int i(long j3, List list) {
        return list.size();
    }

    @Override
    public final int l() {
        return this.f50476c[c()];
    }

    @Override
    public final int length() {
        return this.f50476c.length;
    }

    @Override
    public final b2.s m() {
        return this.d[c()];
    }

    @Override
    public final boolean o(int i10, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a2 = a(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f50475b && !a2; i11++) {
            if (i11 != i10 && !a(i11, elapsedRealtime)) {
                a2 = true;
            } else {
                a2 = false;
            }
        }
        if (!a2) {
            return false;
        }
        long[] jArr = this.f50477e;
        long j10 = jArr[i10];
        String str = d0.f8532a;
        long j11 = elapsedRealtime + j3;
        if (((j3 ^ j11) & (elapsedRealtime ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j10, j11);
        return true;
    }

    @Override
    public final int s(b2.s sVar) {
        for (int i10 = 0; i10 < this.f50475b; i10++) {
            if (this.d[i10] == sVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f50475b; i11++) {
            if (this.f50476c[i11] == i10) {
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
