package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;
import org.telegram.ui.ActionBar.b5;
public final class d implements q {
    public static final s f49042s = new Object();
    public final o f49043a;
    public final int f49044b;
    public final b2.s f49045c;
    public final SparseArray d = new SparseArray();
    public boolean f49046e;
    public b5 f49047f;
    public long h;
    public b0 f49048n;
    public b2.s[] f49049r;

    public d(o oVar, int i10, b2.s sVar) {
        this.f49043a = oVar;
        this.f49044b = i10;
        this.f49045c = sVar;
    }

    public final void a(b5 b5Var, long j3, long j10) {
        this.f49047f = b5Var;
        this.h = j10;
        boolean z10 = this.f49046e;
        o oVar = this.f49043a;
        if (!z10) {
            oVar.g(this);
            if (j3 != -9223372036854775807L) {
                oVar.h(0L, j3);
            }
            this.f49046e = true;
            return;
        }
        if (j3 == -9223372036854775807L) {
            j3 = 0;
        }
        oVar.h(0L, j3);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i10);
                if (b5Var == null) {
                    cVar.f49040e = cVar.f49039c;
                } else {
                    cVar.f49041f = j10;
                    h0 w10 = b5Var.w(cVar.f49037a);
                    cVar.f49040e = w10;
                    b2.s sVar = cVar.d;
                    if (sVar != null) {
                        w10.b(sVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d2(b0 b0Var) {
        this.f49048n = b0Var;
    }

    @Override
    public final h0 f2(int i10, int i11) {
        boolean z10;
        b2.s sVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f49049r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (i11 == this.f49044b) {
                sVar = this.f49045c;
            } else {
                sVar = null;
            }
            cVar = new c(i10, i11, sVar);
            b5 b5Var = this.f49047f;
            long j3 = this.h;
            if (b5Var == null) {
                cVar.f49040e = cVar.f49039c;
            } else {
                cVar.f49041f = j3;
                h0 w10 = b5Var.w(i11);
                cVar.f49040e = w10;
                b2.s sVar2 = cVar.d;
                if (sVar2 != null) {
                    w10.b(sVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override
    public final void k1() {
        SparseArray sparseArray = this.d;
        b2.s[] sVarArr = new b2.s[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            b2.s sVar = ((c) sparseArray.valueAt(i10)).d;
            e2.d.h(sVar);
            sVarArr[i10] = sVar;
        }
        this.f49049r = sVarArr;
    }
}
