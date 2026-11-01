package zf;

import org.telegram.messenger.wp;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.un;
import th.n5;
public final class y0 implements r2 {
    public final b1 f55699a;

    public y0(b1 b1Var) {
        this.f55699a = b1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(v2 v2Var) {
        b1 b1Var = this.f55699a;
        un unVar = b1Var.f55463f;
        if (wp.r1(b1Var.f55465r).O1().K(v2Var.getDialogId())) {
            unVar.getOrCreateStoryViewer().getClass();
            unVar.getOrCreateStoryViewer().R(b1Var.f55462c, v2Var.getDialogId(), n5.a((uk0) v2Var.getParent()));
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
