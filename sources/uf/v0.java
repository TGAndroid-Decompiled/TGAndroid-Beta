package uf;

import oh.c7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.xn;
public final class v0 implements n2 {
    public final y0 f48728a;

    public v0(y0 y0Var) {
        this.f48728a = y0Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(r2 r2Var) {
        y0 y0Var = this.f48728a;
        xn xnVar = y0Var.f48744f;
        if (MessagesController.getInstance(y0Var.f48746r).getStoriesController().I(r2Var.getDialogId())) {
            xnVar.getOrCreateStoryViewer().getClass();
            xnVar.getOrCreateStoryViewer().D(y0Var.f48742c, r2Var.getDialogId(), c7.a((tl0) r2Var.getParent()));
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
