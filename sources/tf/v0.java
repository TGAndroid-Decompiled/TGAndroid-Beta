package tf;

import nh.c7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.xn;
public final class v0 implements n2 {
    public final y0 f44871a;

    public v0(y0 y0Var) {
        this.f44871a = y0Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(r2 r2Var) {
        y0 y0Var = this.f44871a;
        xn xnVar = y0Var.f44884f;
        if (MessagesController.getInstance(y0Var.f44886r).getStoriesController().I(r2Var.getDialogId())) {
            xnVar.getOrCreateStoryViewer().getClass();
            xnVar.getOrCreateStoryViewer().D(y0Var.f44883c, r2Var.getDialogId(), c7.a((sl0) r2Var.getParent()));
        }
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(r2 r2Var) {
    }

    @Override
    public final void f(r2 r2Var) {
    }
}
