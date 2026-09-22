package x2;

import android.os.SystemClock;
import b2.l1;
import e2.d0;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.mb1;
public abstract class c implements s {
    public final l1 f45471a;
    public final int f45472b;
    public final int[] f45473c;
    public final b2.s[] d;
    public final long[] e;
    public int f45474f;

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
        this.f45471a = l1Var;
        int length = iArr.length;
        this.f45472b = length;
        this.d = new b2.s[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = l1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new mb1(10));
        this.f45473c = new int[this.f45472b];
        while (true) {
            int i12 = this.f45472b;
            if (i10 < i12) {
                this.f45473c[i10] = l1Var.a(this.d[i10]);
                i10++;
            } else {
                this.e = new long[i12];
                return;
            }
        }
    }

    @Override
    public final boolean a(int i10, long j3) {
        if (this.e[i10] > j3) {
            return true;
        }
        return false;
    }

    @Override
    public final l1 b() {
        return this.f45471a;
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
            if (this.f45471a.equals(cVar.f45471a) && Arrays.equals(this.f45473c, cVar.f45473c)) {
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
        return this.f45473c[i10];
    }

    public final int hashCode() {
        if (this.f45474f == 0) {
            this.f45474f = Arrays.hashCode(this.f45473c) + (System.identityHashCode(this.f45471a) * 31);
        }
        return this.f45474f;
    }

    @Override
    public int i(long j3, List list) {
        return list.size();
    }

    @Override
    public final int l() {
        return this.f45473c[c()];
    }

    @Override
    public final int length() {
        return this.f45473c.length;
    }

    @Override
    public final b2.s m() {
        return this.d[c()];
    }

    @Override
    public final boolean o(int i10, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a2 = a(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f45472b && !a2; i11++) {
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
        long j10 = jArr[i10];
        String str = d0.f7887a;
        long j11 = elapsedRealtime + j3;
        if (((j3 ^ j11) & (elapsedRealtime ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j10, j11);
        return true;
    }

    @Override
    public final int s(b2.s sVar) {
        for (int i10 = 0; i10 < this.f45472b; i10++) {
            if (this.d[i10] == sVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f45472b; i11++) {
            if (this.f45473c[i11] == i10) {
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
