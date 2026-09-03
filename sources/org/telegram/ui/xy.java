package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class xy extends f2.b0 {
    public boolean d;
    public final zy e;

    public xy(zy zyVar) {
        this.e = zyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        l1Var.f5774a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        if (l1Var.f5777f != 3) {
            return f2.b0.l(0, 0);
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        boolean z4;
        boolean z10 = false;
        if (l1Var.f5777f != l1Var2.f5777f) {
            return false;
        }
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        zy zyVar = this.e;
        wy wyVar = zyVar.f40892a;
        zy zyVar2 = wyVar.d;
        int i10 = zyVar2.f40896n;
        ArrayList arrayList = zyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = zyVar2.f40897r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            wyVar.p(b10, b11);
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) l1Var.f5774a;
            if (b11 != zyVar.f40897r - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            f4Var.setDrawDivider(z4);
            org.telegram.ui.Cells.f4 f4Var2 = (org.telegram.ui.Cells.f4) l1Var2.f5774a;
            if (b10 != zyVar.f40897r - 1) {
                z10 = true;
            }
            f4Var2.setDrawDivider(z10);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        zy zyVar = this.e;
        if (i10 != 0) {
            zyVar.f40893b.I0(false);
            l1Var.f5774a.setPressed(true);
        } else if (this.d) {
            yy yyVar = zyVar.f40895f;
            if (yyVar != null) {
                yyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(f2.l1 l1Var) {
    }
}
