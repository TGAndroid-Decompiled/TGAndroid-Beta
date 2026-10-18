package y2;

import e2.m0;
import java.util.Arrays;
import u2.y0;
public final class d {
    public int f49943c;
    public int d;
    public final boolean f49941a = true;
    public final int f49942b = 65536;
    public int e = 0;
    public a[] f49944f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i10 = this.d + 1;
            this.d = i10;
            int i11 = this.e;
            if (i11 > 0) {
                a[] aVarArr = this.f49944f;
                int i12 = i11 - 1;
                this.e = i12;
                aVar = aVarArr[i12];
                aVar.getClass();
                this.f49944f[this.e] = null;
            } else {
                a aVar2 = new a(new byte[this.f49942b], 0);
                a[] aVarArr2 = this.f49944f;
                if (i10 > aVarArr2.length) {
                    this.f49944f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(y0 y0Var) {
        while (y0Var != null) {
            a[] aVarArr = this.f49944f;
            int i10 = this.e;
            this.e = i10 + 1;
            a aVar = (a) y0Var.f47539c;
            aVar.getClass();
            aVarArr[i10] = aVar;
            this.d--;
            y0Var = (y0) y0Var.d;
            if (y0Var == null || ((a) y0Var.f47539c) == null) {
                y0Var = null;
            }
        }
    }

    public final synchronized void c(a aVar) {
        a[] aVarArr = this.f49944f;
        int i10 = this.e;
        this.e = i10 + 1;
        aVarArr[i10] = aVar;
        this.d--;
    }

    public final synchronized void d(int i10) {
        boolean z10;
        if (i10 < this.f49943c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49943c = i10;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, m0.g(this.f49943c, this.f49942b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f49944f, max, i10, (Object) null);
        this.e = max;
    }
}
