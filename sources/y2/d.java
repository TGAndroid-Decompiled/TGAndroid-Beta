package y2;

import e2.m0;
import java.util.Arrays;
import u2.z0;
public final class d {
    public int f49895c;
    public int d;
    public final boolean f49893a = true;
    public final int f49894b = 65536;
    public int e = 0;
    public a[] f49896f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i10 = this.d + 1;
            this.d = i10;
            int i11 = this.e;
            if (i11 > 0) {
                a[] aVarArr = this.f49896f;
                int i12 = i11 - 1;
                this.e = i12;
                aVar = aVarArr[i12];
                aVar.getClass();
                this.f49896f[this.e] = null;
            } else {
                a aVar2 = new a(new byte[this.f49894b], 0);
                a[] aVarArr2 = this.f49896f;
                if (i10 > aVarArr2.length) {
                    this.f49896f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(z0 z0Var) {
        while (z0Var != null) {
            a[] aVarArr = this.f49896f;
            int i10 = this.e;
            this.e = i10 + 1;
            a aVar = (a) z0Var.f47496c;
            aVar.getClass();
            aVarArr[i10] = aVar;
            this.d--;
            z0Var = (z0) z0Var.d;
            if (z0Var == null || ((a) z0Var.f47496c) == null) {
                z0Var = null;
            }
        }
    }

    public final synchronized void c(a aVar) {
        a[] aVarArr = this.f49896f;
        int i10 = this.e;
        this.e = i10 + 1;
        aVarArr[i10] = aVar;
        this.d--;
    }

    public final synchronized void d(int i10) {
        boolean z10;
        if (i10 < this.f49895c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49895c = i10;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, m0.g(this.f49895c, this.f49894b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f49896f, max, i10, (Object) null);
        this.e = max;
    }
}
