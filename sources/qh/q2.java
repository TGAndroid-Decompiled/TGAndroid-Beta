package qh;

import org.telegram.messenger.MediaController;
public final class q2 extends org.telegram.ui.ActionBar.j {
    public final a3 f45899a;

    public q2(a3 a3Var) {
        this.f45899a = a3Var;
    }

    @Override
    public final void b(int i10) {
        a3 a3Var = this.f45899a;
        if (i10 == -1) {
            Runnable runnable = a3Var.S;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            a3Var.e((MediaController.AlbumEntry) a3Var.f44897d0.get(i10 - 10), false);
        }
    }
}
