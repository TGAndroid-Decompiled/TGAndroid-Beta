package rg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
import zh.s6;
public final class t implements DialogInterface.OnDismissListener {
    public final int f45514a = 1;
    public final int f45515b;
    public final NotificationCenter.NotificationCenterDelegate f45516c;

    public t(int i10, s6 s6Var) {
        this.f45515b = i10;
        this.f45516c = s6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45514a) {
            case 0:
                o0 o0Var = (o0) this.f45516c;
                PhotoViewer photoViewer = ((zt0) o0Var).f43543o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                o0Var.B0(this.f45515b);
                return;
            default:
                NotificationCenter.getInstance(this.f45515b).removeObserver((s6) this.f45516c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public t(o0 o0Var, int i10) {
        this.f45516c = o0Var;
        this.f45515b = i10;
    }
}
