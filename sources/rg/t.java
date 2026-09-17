package rg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
import zh.s6;
public final class t implements DialogInterface.OnDismissListener {
    public final int f45486a = 1;
    public final int f45487b;
    public final NotificationCenter.NotificationCenterDelegate f45488c;

    public t(int i10, s6 s6Var) {
        this.f45487b = i10;
        this.f45488c = s6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45486a) {
            case 0:
                o0 o0Var = (o0) this.f45488c;
                PhotoViewer photoViewer = ((zt0) o0Var).f43516o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                o0Var.B0(this.f45487b);
                return;
            default:
                NotificationCenter.getInstance(this.f45487b).removeObserver((s6) this.f45488c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public t(o0 o0Var, int i10) {
        this.f45488c = o0Var;
        this.f45487b = i10;
    }
}
