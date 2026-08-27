package pf;

import jh.b7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.rn;

public final class v0 implements l2 {

    public final y0 f45956a;

    public v0(y0 y0Var) {
        this.f45956a = y0Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(p2 p2Var) {
        y0 y0Var = this.f45956a;
        rn rnVar = y0Var.f45972f;
        if (MessagesController.getInstance(y0Var.f45974r).getStoriesController().I(p2Var.getDialogId())) {
            rnVar.getOrCreateStoryViewer().getClass();
            rnVar.getOrCreateStoryViewer().D(y0Var.f45970c, p2Var.getDialogId(), b7.a((zk0) p2Var.getParent()));
        }
    }

    @Override
    public final void a(p2 p2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(p2 p2Var) {
    }

    @Override
    public final void f(p2 p2Var) {
    }
}
