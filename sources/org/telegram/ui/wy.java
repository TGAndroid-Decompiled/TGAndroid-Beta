package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class wy extends f2.b0 {
    public boolean d;
    public final yy f42874e;

    public wy(yy yyVar) {
        this.f42874e = yyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.f5875a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        if (m1Var.f5879f != 3) {
            return f2.b0.l(0, 0);
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        boolean z4;
        boolean z10 = false;
        if (m1Var.f5879f != m1Var2.f5879f) {
            return false;
        }
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        yy yyVar = this.f42874e;
        vy vyVar = yyVar.f43729a;
        yy yyVar2 = vyVar.d;
        int i10 = yyVar2.f43734n;
        ArrayList arrayList = yyVar2.f43732e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = yyVar2.f43735r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            vyVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) m1Var.f5875a;
            if (b11 != yyVar.f43735r - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            g4Var.setDrawDivider(z4);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) m1Var2.f5875a;
            if (b10 != yyVar.f43735r - 1) {
                z10 = true;
            }
            g4Var2.setDrawDivider(z10);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        yy yyVar = this.f42874e;
        if (i10 != 0) {
            yyVar.f43730b.I0(false);
            m1Var.f5875a.setPressed(true);
        } else if (this.d) {
            xy xyVar = yyVar.f43733f;
            if (xyVar != null) {
                xyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(f2.m1 m1Var) {
    }
}
