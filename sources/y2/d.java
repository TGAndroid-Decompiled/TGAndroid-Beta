package y2;

import e2.m0;
import java.util.Arrays;
import u2.b1;
public final class d {
    public int f50345c;
    public int d;
    public final boolean f50343a = true;
    public final int f50344b = 65536;
    public int e = 0;
    public a[] f50346f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i10 = this.d + 1;
            this.d = i10;
            int i11 = this.e;
            if (i11 > 0) {
                a[] aVarArr = this.f50346f;
                int i12 = i11 - 1;
                this.e = i12;
                aVar = aVarArr[i12];
                aVar.getClass();
                this.f50346f[this.e] = null;
            } else {
                a aVar2 = new a(new byte[this.f50344b], 0);
                a[] aVarArr2 = this.f50346f;
                if (i10 > aVarArr2.length) {
                    this.f50346f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(b1 b1Var) {
        while (b1Var != null) {
            a[] aVarArr = this.f50346f;
            int i10 = this.e;
            this.e = i10 + 1;
            a aVar = (a) b1Var.f47709c;
            aVar.getClass();
            aVarArr[i10] = aVar;
            this.d--;
            b1Var = (b1) b1Var.d;
            if (b1Var == null || ((a) b1Var.f47709c) == null) {
                b1Var = null;
            }
        }
    }

    public final synchronized void c(a aVar) {
        a[] aVarArr = this.f50346f;
        int i10 = this.e;
        this.e = i10 + 1;
        aVarArr[i10] = aVar;
        this.d--;
    }

    public final synchronized void d(int i10) {
        boolean z10;
        if (i10 < this.f50345c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50345c = i10;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, m0.g(this.f50345c, this.f50344b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f50346f, max, i10, (Object) null);
        this.e = max;
    }
}
