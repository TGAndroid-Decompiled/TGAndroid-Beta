package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class xy extends s4.v {
    public boolean d;
    public final zy e;

    public xy(zy zyVar) {
        this.e = zyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42959a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f42962f != 3) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        boolean z10;
        boolean z11 = false;
        if (c1Var.f42962f != c1Var2.f42962f) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        zy zyVar = this.e;
        wy wyVar = zyVar.f40593a;
        zy zyVar2 = wyVar.d;
        int i10 = zyVar2.f40597n;
        ArrayList arrayList = zyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = zyVar2.f40598r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            wyVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) c1Var.f42959a;
            if (b11 != zyVar.f40598r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) c1Var2.f42959a;
            if (b10 != zyVar.f40598r - 1) {
                z11 = true;
            }
            g4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        zy zyVar = this.e;
        if (i10 != 0) {
            zyVar.f40594b.I0(false);
            c1Var.f42959a.setPressed(true);
        } else if (this.d) {
            yy yyVar = zyVar.f40596f;
            if (yyVar != null) {
                yyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
