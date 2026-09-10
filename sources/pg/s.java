package pg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
import xh.v6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f40279a = 1;
    public final int f40280b;
    public final NotificationCenter.NotificationCenterDelegate f40281c;

    public s(int i10, v6 v6Var) {
        this.f40280b = i10;
        this.f40281c = v6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40279a) {
            case 0:
                m0 m0Var = (m0) this.f40281c;
                PhotoViewer photoViewer = ((zt0) m0Var).f39441o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.B0(this.f40280b);
                return;
            default:
                NotificationCenter.getInstance(this.f40280b).removeObserver((v6) this.f40281c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f40281c = m0Var;
        this.f40280b = i10;
    }
}
