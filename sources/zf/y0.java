package zf;

import org.telegram.messenger.vp;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.un;
import th.n5;
public final class y0 implements r2 {
    public final b1 f55681a;

    public y0(b1 b1Var) {
        this.f55681a = b1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(v2 v2Var) {
        b1 b1Var = this.f55681a;
        un unVar = b1Var.f55445f;
        if (vp.r1(b1Var.f55447r).O1().K(v2Var.getDialogId())) {
            unVar.getOrCreateStoryViewer().getClass();
            unVar.getOrCreateStoryViewer().R(b1Var.f55444c, v2Var.getDialogId(), n5.a((tk0) v2Var.getParent()));
        }
    }

    @Override
    public final void l(v2 v2Var) {
    }

    @Override
    public final void r(v2 v2Var) {
    }

    @Override
    public final void x(v2 v2Var) {
    }

    @Override
    public final void q() {
    }
}
