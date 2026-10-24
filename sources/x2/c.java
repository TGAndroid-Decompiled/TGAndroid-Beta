package x2;

import android.os.SystemClock;
import b2.p1;
import b2.w;
import e2.m0;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.o70;
import v7.u6;
public abstract class c implements p {
    public final p1 f49577a;
    public final int f49578b;
    public final int[] f49579c;
    public final w[] d;
    public final long[] e;
    public int f49580f;

    public c(p1 p1Var, int[] iArr) {
        boolean z10;
        int i10 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        p1Var.getClass();
        this.f49577a = p1Var;
        int length = iArr.length;
        this.f49578b = length;
        this.d = new w[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = p1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new o70(18));
        this.f49579c = new int[this.f49578b];
        while (true) {
            int i12 = this.f49578b;
            if (i10 < i12) {
                this.f49579c[i10] = p1Var.a(this.d[i10]);
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
    public final p1 b() {
        return this.f49577a;
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
            if (this.f49577a.equals(cVar.f49577a) && Arrays.equals(this.f49579c, cVar.f49579c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final w f(int i10) {
        return this.d[i10];
    }

    @Override
    public final int h(int i10) {
        return this.f49579c[i10];
    }

    public final int hashCode() {
        if (this.f49580f == 0) {
            this.f49580f = Arrays.hashCode(this.f49579c) + (System.identityHashCode(this.f49577a) * 31);
        }
        return this.f49580f;
    }

    @Override
    public int i(long j10, List list) {
        return list.size();
    }

    @Override
    public final int l() {
        return this.f49579c[c()];
    }

    @Override
    public final int length() {
        return this.f49579c.length;
    }

    @Override
    public final w m() {
        return this.d[c()];
    }

    @Override
    public final boolean o(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a2 = a(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f49578b && !a2; i11++) {
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
        jArr[i10] = Math.max(jArr[i10], m0.a(elapsedRealtime, j10));
        return true;
    }

    @Override
    public final int s(w wVar) {
        for (int i10 = 0; i10 < this.f49578b; i10++) {
            if (this.d[i10] == wVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f49578b; i11++) {
            if (this.f49579c[i11] == i10) {
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
