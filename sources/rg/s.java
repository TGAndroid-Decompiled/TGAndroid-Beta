package rg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gu0;
import zh.m6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f44293a = 1;
    public final int f44294b;
    public final NotificationCenter.NotificationCenterDelegate f44295c;

    public s(int i10, m6 m6Var) {
        this.f44294b = i10;
        this.f44295c = m6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44293a) {
            case 0:
                o0 o0Var = (o0) this.f44295c;
                PhotoViewer photoViewer = ((gu0) o0Var).f36310o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                o0Var.C0(this.f44294b);
                return;
            default:
                NotificationCenter.getInstance(this.f44294b).removeObserver((m6) this.f44295c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(o0 o0Var, int i10) {
        this.f44295c = o0Var;
        this.f44294b = i10;
    }
}
