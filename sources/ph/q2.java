package ph;

import org.telegram.messenger.MediaController;
public final class q2 extends org.telegram.ui.ActionBar.j {
    public final a3 f42201a;

    public q2(a3 a3Var) {
        this.f42201a = a3Var;
    }

    @Override
    public final void b(int i10) {
        a3 a3Var = this.f42201a;
        if (i10 == -1) {
            Runnable runnable = a3Var.S;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            a3Var.e((MediaController.AlbumEntry) a3Var.f41260d0.get(i10 - 10), false);
        }
    }
}
