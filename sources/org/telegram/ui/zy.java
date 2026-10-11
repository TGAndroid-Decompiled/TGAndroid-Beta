package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class zy extends s4.w {
    public boolean d;
    public final bz f45130e;

    public zy(bz bzVar) {
        this.f45130e = bzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47748a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (d1Var.f47752f != 3) {
            return s4.w.l(0, 0);
        }
        return s4.w.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        boolean z10;
        boolean z11 = false;
        if (d1Var.f47752f != d1Var2.f47752f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        bz bzVar = this.f45130e;
        yy yyVar = bzVar.f36469a;
        bz bzVar2 = yyVar.d;
        int i10 = bzVar2.f36474n;
        ArrayList arrayList = bzVar2.f36472e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = bzVar2.f36475r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            yyVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) d1Var.f47748a;
            if (b11 != bzVar.f36475r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) d1Var2.f47748a;
            if (b10 != bzVar.f36475r - 1) {
                z11 = true;
            }
            g4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        bz bzVar = this.f45130e;
        if (i10 != 0) {
            bzVar.f36470b.I0(false);
            d1Var.f47748a.setPressed(true);
        } else if (this.d) {
            az azVar = bzVar.f36473f;
            if (azVar != null) {
                azVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
