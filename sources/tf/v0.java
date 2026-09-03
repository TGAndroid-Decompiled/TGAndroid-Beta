package tf;

import nh.c7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.zn;
public final class v0 implements m2 {
    public final y0 f44933a;

    public v0(y0 y0Var) {
        this.f44933a = y0Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(q2 q2Var) {
        y0 y0Var = this.f44933a;
        zn znVar = y0Var.f44946f;
        if (MessagesController.getInstance(y0Var.f44948r).getStoriesController().I(q2Var.getDialogId())) {
            znVar.getOrCreateStoryViewer().getClass();
            znVar.getOrCreateStoryViewer().D(y0Var.f44945c, q2Var.getDialogId(), c7.a((rl0) q2Var.getParent()));
        }
    }

    @Override
    public final void a(q2 q2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(q2 q2Var) {
    }

    @Override
    public final void f(q2 q2Var) {
    }
}
