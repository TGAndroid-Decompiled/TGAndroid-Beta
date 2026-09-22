package zg;

import com.google.android.gms.internal.vision.e2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.fk0;
public final class v implements Runnable {
    public final int f49173a;
    public final Object f49174b;
    public final Object f49175c;

    public v(int i10, Object obj, Object obj2) {
        this.f49173a = i10;
        this.f49174b = obj;
        this.f49175c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f49173a) {
            case 0:
                c0 c0Var = (c0) this.f49174b;
                fk0 fk0Var = (fk0) this.f49175c;
                c0Var.f48984l = true;
                c0Var.f48976a.invalidate();
                fk0Var.f23970b1 = false;
                fk0Var.invalidate();
                c0Var.c(true);
                return;
            case 1:
                e0 e0Var = (e0) this.f49174b;
                b bVar = (b) this.f49175c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                return;
            default:
                q0 q0Var = (q0) this.f49174b;
                n0 n0Var = (n0) this.f49175c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.f49085a;
                org.telegram.ui.Cells.a0 a0Var = q0Var.f49156z;
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
