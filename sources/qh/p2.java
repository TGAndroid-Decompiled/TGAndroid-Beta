package qh;

import org.telegram.messenger.MediaController;
public final class p2 extends org.telegram.ui.ActionBar.j {
    public final z2 f45881a;

    public p2(z2 z2Var) {
        this.f45881a = z2Var;
    }

    @Override
    public final void b(int i10) {
        z2 z2Var = this.f45881a;
        if (i10 == -1) {
            Runnable runnable = z2Var.S;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            z2Var.e((MediaController.AlbumEntry) z2Var.f46392d0.get(i10 - 10), false);
        }
    }
}
