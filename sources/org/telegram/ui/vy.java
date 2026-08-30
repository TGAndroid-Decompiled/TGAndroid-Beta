package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class vy extends f2.b0 {
    public boolean d;
    public final xy e;

    public vy(xy xyVar) {
        this.e = xyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        l1Var.f5785a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        if (l1Var.f5788f != 3) {
            return f2.b0.l(0, 0);
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        boolean z4;
        boolean z10 = false;
        if (l1Var.f5788f != l1Var2.f5788f) {
            return false;
        }
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        xy xyVar = this.e;
        uy uyVar = xyVar.f40326a;
        xy xyVar2 = uyVar.d;
        int i10 = xyVar2.f40330n;
        ArrayList arrayList = xyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = xyVar2.f40331r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            uyVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) l1Var.f5785a;
            if (b11 != xyVar.f40331r - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            g4Var.setDrawDivider(z4);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) l1Var2.f5785a;
            if (b10 != xyVar.f40331r - 1) {
                z10 = true;
            }
            g4Var2.setDrawDivider(z10);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        xy xyVar = this.e;
        if (i10 != 0) {
            xyVar.f40327b.I0(false);
            l1Var.f5785a.setPressed(true);
        } else if (this.d) {
            wy wyVar = xyVar.f40329f;
            if (wyVar != null) {
                wyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(f2.l1 l1Var) {
    }
}
