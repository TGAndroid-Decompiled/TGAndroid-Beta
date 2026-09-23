package zg;

import com.google.android.gms.internal.vision.e2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.gk0;
public final class v implements Runnable {
    public final int f49124a;
    public final Object f49125b;
    public final Object f49126c;

    public v(int i10, Object obj, Object obj2) {
        this.f49124a = i10;
        this.f49125b = obj;
        this.f49126c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f49124a) {
            case 0:
                c0 c0Var = (c0) this.f49125b;
                gk0 gk0Var = (gk0) this.f49126c;
                c0Var.f48935l = true;
                c0Var.f48927a.invalidate();
                gk0Var.f24323b1 = false;
                gk0Var.invalidate();
                c0Var.c(true);
                return;
            case 1:
                e0 e0Var = (e0) this.f49125b;
                b bVar = (b) this.f49126c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                return;
            default:
                q0 q0Var = (q0) this.f49125b;
                n0 n0Var = (n0) this.f49126c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.f49036a;
                org.telegram.ui.Cells.a0 a0Var = q0Var.f49107z;
                if (e2.u(a0Var)) {
                    ((o4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.Y.c(false);
                q0Var.S = null;
                q0Var.T = false;
                q0Var.U = null;
                return;
        }
    }
}
