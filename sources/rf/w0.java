package rf;

import lh.b7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.tn;
public final class w0 implements l2 {
    public final z0 f47397a;

    public w0(z0 z0Var) {
        this.f47397a = z0Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(p2 p2Var) {
        z0 z0Var = this.f47397a;
        tn tnVar = z0Var.f47413f;
        if (MessagesController.getInstance(z0Var.f47415r).getStoriesController().I(p2Var.getDialogId())) {
            tnVar.getOrCreateStoryViewer().getClass();
            tnVar.getOrCreateStoryViewer().D(z0Var.f47411c, p2Var.getDialogId(), b7.a((jl0) p2Var.getParent()));
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
