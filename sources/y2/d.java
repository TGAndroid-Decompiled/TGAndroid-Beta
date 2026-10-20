package y2;

import e2.m0;
import java.util.Arrays;
import u2.a1;
public final class d {
    public int f49902c;
    public int d;
    public final boolean f49900a = true;
    public final int f49901b = 65536;
    public int e = 0;
    public a[] f49903f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i10 = this.d + 1;
            this.d = i10;
            int i11 = this.e;
            if (i11 > 0) {
                a[] aVarArr = this.f49903f;
                int i12 = i11 - 1;
                this.e = i12;
                aVar = aVarArr[i12];
                aVar.getClass();
                this.f49903f[this.e] = null;
            } else {
                a aVar2 = new a(new byte[this.f49901b], 0);
                a[] aVarArr2 = this.f49903f;
                if (i10 > aVarArr2.length) {
                    this.f49903f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(a1 a1Var) {
        while (a1Var != null) {
            a[] aVarArr = this.f49903f;
            int i10 = this.e;
            this.e = i10 + 1;
            a aVar = (a) a1Var.f47257c;
            aVar.getClass();
            aVarArr[i10] = aVar;
            this.d--;
            a1Var = (a1) a1Var.d;
            if (a1Var == null || ((a) a1Var.f47257c) == null) {
                a1Var = null;
            }
        }
    }

    public final synchronized void c(a aVar) {
        a[] aVarArr = this.f49903f;
        int i10 = this.e;
        this.e = i10 + 1;
        aVarArr[i10] = aVar;
        this.d--;
    }

    public final synchronized void d(int i10) {
        boolean z10;
        if (i10 < this.f49902c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49902c = i10;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, m0.g(this.f49902c, this.f49901b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f49903f, max, i10, (Object) null);
        this.e = max;
    }
}
