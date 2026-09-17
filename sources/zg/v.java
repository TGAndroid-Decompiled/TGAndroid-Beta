package zg;

import com.google.android.gms.internal.vision.e2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.gk0;
public final class v implements Runnable {
    public final int f49203a;
    public final Object f49204b;
    public final Object f49205c;

    public v(int i10, Object obj, Object obj2) {
        this.f49203a = i10;
        this.f49204b = obj;
        this.f49205c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f49203a) {
            case 0:
                c0 c0Var = (c0) this.f49204b;
                gk0 gk0Var = (gk0) this.f49205c;
                c0Var.f49014l = true;
                c0Var.f49006a.invalidate();
                gk0Var.f24270b1 = false;
                gk0Var.invalidate();
                c0Var.c(true);
                return;
            case 1:
                e0 e0Var = (e0) this.f49204b;
                b bVar = (b) this.f49205c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                return;
            default:
                q0 q0Var = (q0) this.f49204b;
                n0 n0Var = (n0) this.f49205c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.f49115a;
                org.telegram.ui.Cells.a0 a0Var = q0Var.f49186z;
                if (e2.u(a0Var)) {
                    ((n4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.Y.c(false);
                q0Var.S = null;
                q0Var.T = false;
                q0Var.U = null;
                return;
        }
    }
}
